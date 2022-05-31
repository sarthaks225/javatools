package util;
import java.lang.reflect.*;
import java.io.*;
import utils.*; //for TMList

public class SetterGetterGenerator
{   
    public static void main(String gg[])
    {
        if(gg.length!=1 && gg.length!=2)
        {
            System.out.println("Ussage: java -classpath path_to_jar_file;. util.SetterGetterGenerator class_name");
            System.out.println("\tor");
            System.out.println("Ussage: java -classpath path_to_classes;. util.SetterGetterGenerator class_name");
            return;
        }

        

        String className=gg[0];
        try
        {
            Class c=Class.forName(className);
            Field fields[]=c.getDeclaredFields();
        
            Field field;
            String fieldName;
            String cFieldName;
            Class fieldType;
            //String 
            TMList<String> list;
            list=new TMArrayList<String>();
            String line;
            
            if(gg.length==2)
            {
                if(gg[1].equalsIgnoreCase("constructor=true")==false && gg[1].equalsIgnoreCase("constructor=false")==false)
                {
                    System.out.println("Usage: java -classpath path_to_jar_file;. util.SetterGetterGenerator class_name constructor=false/true");
                    return;
                }
       
            }

            if(gg.length==1 || (gg.length==2 && gg[1].equalsIgnoreCase("constructor=true")) )
            {
                line="public "+c.getSimpleName()+"()";
                list.add(line);
                list.add("{");
                for(int i=0; i<fields.length; ++i)
                {
                    field=fields[i];
                    line="this."+field.getName()+"="+getDefaultValue(field.getType())+";";
                    list.add(line);

                }

                list.add("}");
            }

            for(int i=0; i<fields.length; ++i)
            {
                field=fields[i];
                fieldName=field.getName();
                fieldType=field.getType();
                if(fieldName.charAt(0)>='a' && fieldName.charAt(0)<='z')
                {
                    cFieldName=fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
                }
                else cFieldName=fieldName;
                line="public void set"+cFieldName+"("+fieldType.getName()+" "+fieldName+")";
                list.add(line);
                list.add("{");
                line="this."+fieldName+"="+fieldName+";";
                list.add(line);
                list.add("}");
                line="public "+fieldType.getName()+" "+"get"+cFieldName+"()";
                list.add(line);
                list.add("{");
                line="return "+"this."+fieldName+";";
                list.add(line);
                list.add("}");
            }

           
            File file=new File("tmp.tmp");
            if(file.exists()) file.delete();
            RandomAccessFile randomAccessFile=new RandomAccessFile(file,"rw");

            for(int j=0; j<list.getSize(); ++j)
            {
                randomAccessFile.writeBytes(list.get(j));
                randomAccessFile.writeBytes("\r\n");
            }

        }catch(ClassNotFoundException cfe)
        {
            System.out.println("Class not found : "+cfe.getMessage());
            return;
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
            return;
        }

        System.out.printf("Setter Getter generated for: '%s' in temp.temp",className);
    }

    private static String getDefaultValue(Class c)
    {
        String className=c.getName();
        if(className.equals("java.lang.Long") || className.equals("long")) return "0";
        else if(className.equals("java.lang.Integer") || className.equals("int")) return "0";
        else if(className.equals("java.lang.Short") || className.equals("short")) return "0";
        else if(className.equals("java.lang.Byte") || className.equals("byte")) return "0";
        else if(className.equals("java.lang.Double") || className.equals("double")) return "0.0";
        else if(className.equals("java.lang.Float") || className.equals("float")) return "0.0f";
        else if(className.equals("java.lang.Character") || className.equals("char")) return "' '";
        else if(className.equals("java.lang.Boolean") || className.equals("boolean")) return "false";
        else if(className.equals("java.lang.String") || className.equals("")) return "\"\"";
        return null;
    }
}
package util;
import java.io.*;

public class Keyboard
{

private BufferedReader bufferedReader;

public Keyboard()     //.... constructor
{

bufferedReader=new BufferedReader(new InputStreamReader(System.in));

}

public String getString()
{
String str;
try
{
str=bufferedReader.readLine();
}catch(IOException ioe)
{
str="";
}

return str;
}
public String getString(String message)
{
System.out.print(message);
return getString();
}

public char getChar()
{
return getString().charAt(0);
}
public char getChar(String message)
{
System.out.print(message);
return getChar();
}

public long getLong()
{
try
{
return Long.parseLong(getString());
}catch(NumberFormatException nfe)
{
return 0;
}
}
public long getLong(String message)
{
System.out.print(message);
return getLong();
}

public int getInt()
{
try
{
return Integer.parseInt(getString());
}catch(NumberFormatException nfe)
{
return 0;
}
}
public int getInt(String message)
{
System.out.print(message);
return getInt();
}

public short getShort()
{
try
{
return Short.parseShort(getString());
}catch(NumberFormatException nfe)
{
return 0;
}
}
public short getShort(String message)
{
System.out.print(message);
return getShort();
}

public byte getByte()
{
try
{
return Byte.parseByte(getString());
}catch(NumberFormatException nfe)
{
return 0;
}
}
public byte getByte(String message)
{
System.out.print(message);
return getByte();
}

public double getDouble()
{
try
{
return Double.parseDouble(getString());
}catch(NumberFormatException nfe)
{
return 0;
}
}
public double getDouble(String message)
{
System.out.print(message);
return getDouble();
}

public float getFloat()
{
try
{
return Float.parseFloat(getString());
}catch(NumberFormatException nfe)
{
return 0;
}
}
public float getFloat(String message)
{
System.out.print(message);
return getFloat();
}

public boolean getBoolean()
{
try
{
return Boolean.parseBoolean(getString());
}catch(NumberFormatException nfe)
{
return false;
}
}
public boolean getBoolean(String message)
{
System.out.print(message);
return getBoolean();
}
}
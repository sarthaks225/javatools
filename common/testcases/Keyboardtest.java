import util.*;
class Keyboardtest
{
public static void main(String gg[])
{
Keyboard k=new Keyboard();
String s1;
/*
System.out.print("Enter a string : ");
s1=k.getString();
String s2;
s2=k.getString("Enter another string : ");
*/

char c;
c=k.getChar("Enter a charavter : ");
System.out.println(c);

long l;
l=k.getLong("Enter long type value: ");
System.out.println(l);

int i;
i=k.getInt("Enter integer : ");
System.out.println(i);

short s;
s=k.getShort("Enter short: ");
System.out.println(s);

byte b;
b=k.getByte("Enter byte : ");
System.out.println(b);

double d;
d=k.getDouble("Enter double : ");
System.out.println(d);

float f;
f=k.getFloat("Enter float : ");
System.out.println(f);

boolean bool;
bool=k.getBoolean("Enter boolean : ");
     
System.out.println(bool);

}

}
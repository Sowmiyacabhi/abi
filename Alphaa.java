import java.io.*;
import java.util.*;
public class Alphaa
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in)
String alpha=scan.nextline();
if((alpha>='a')&&(alpha<='z') || (alpha>='A')&&(alpha<='Z'))
{
System.out.println("the given input is an alphabet");
}
else
{
System.out.println("the given input is not an alphabet");
}
}
}

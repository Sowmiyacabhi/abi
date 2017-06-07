import java.io.*;
import java.util.*;
public class Char 
{
public static void main(String args[])
{
Scanner jack=new Scanner(System.in);
char j=jack.next();
if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonants");
}
}
}

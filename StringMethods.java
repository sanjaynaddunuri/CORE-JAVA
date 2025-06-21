import java.util.*;
class StringMethods
{
public static void main(String args[])
{
String s1 ="WELCOME TO JAVA";
StringTokenizer s =new StringTokenizer(s1);
while(s.hasMoreTokens())
{
System.out.println(s.nextToken());
}
}
}
import java.util.*;
class CountTokens
{
public static void main(String args[])
{
String s1 ="WELCOME TO JAVA";
StringTokenizer st=new StringTokenizer(s1);
int n =st.countTokens();
System.out.println(n);
//or
//System.out.println(new StringToeknizer("welcome to java").countTokens);

}
}
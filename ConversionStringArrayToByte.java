class ConversionStringArrayToByte
{
public static void main(String args[])
{
String s ="welcome";
byte[] b=s.getBytes();
for(byte c :b)
{
System.out.println(c);
} 
}
}
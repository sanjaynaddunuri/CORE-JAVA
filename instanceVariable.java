class instanceVariable
{

int a =10;
static int b=20;
public static void main(String []args)

{
instanceVariable d =new instanceVariable();
int c=30;
System.out.println(d.a);
System.out.println(new Demo().a);

System.out.println(Demo.b);
System.out.println(b);

System.out.println(c);

}}
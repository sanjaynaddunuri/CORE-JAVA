class MethodType1
{
void add()
{
int a=10;
System.out.println(a);
}
public static void main(String []args)

{
new MethodType1().add();

MethodType1 d =new MethodType1();
d.add();
}
}
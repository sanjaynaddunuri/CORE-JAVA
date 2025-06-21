class MethodType3
{
void add(int a ,int b)
{
int c =a+b;
System.out.println(c);
}
public static void main(String []args)

{
new MethodType3().add(10,20);

MethodType3 d =new MethodType3();
d.add(10,20);

}
}
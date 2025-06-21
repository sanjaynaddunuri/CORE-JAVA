class MethodType4
{
int add(int a ,int b)
{
int c =a+b;
return c ;
}
public static void main(String []args)

{
int x=new MethodType4().add(10,20);
System.out.println(x);



MethodType4 d =new MethodType4();
int n=d.add(10,20);
System.out.println(n);
}
}
class MethodType2
{
int add()
{
int a=10;
return a;
}
public static void main(String []args)

{
int x=new MethodType2().add();
System.out.println(x);

MethodType2 d =new MethodType2();
int y =d.add();
System.out.println(y);

}
}
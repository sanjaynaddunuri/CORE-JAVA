class MethodOverloading2
{
void add(int a ,int b)
{
int c=a+b;
System.out.println(c);
}
void add(int a ,int b,int c)
{
int d=a+b+c;
System.out.println(d);
}
public static void main(String []args)

{

MethodOverloading2 d =new MethodOverloading2();
d.add(10,20);
d.add(10,20,30);

}
}
class A
{
int x=10;
}

class Inheritence3 extends A
{
int y=20;
void print()
{
int z=30;
System.out.println(x);//implicitly this,x
System.out.println(y);//implicitly this.y
System.out.println(z);

}
public static void main(String []args)
{
Inheritence3 d =new Inheritence3();
d.print();

}
}
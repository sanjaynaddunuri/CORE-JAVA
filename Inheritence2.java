class A
{
int x=10;
}

class Inheritence2 extends A
{
int x=20;
void print()
{
int x=30;
System.out.println(x);
System.out.println(this.x);
System.out.println(super.x);

}
public static void main(String []args)
{
Inheritence2 d =new Inheritence2();
d.print();

}
}
class A
{
int x=10;
void show()
{
System.out.println("class A");
}
}

class Inheritence1 extends A
{
int y=20;
void print()
{
System.out.println("print() method");
}
public static void main(String []args)
{
Inheritence1 d =new Inheritence1();
System.out.println(d.x);
System.out.println(d.y);
d.show();
d.print();

}
}
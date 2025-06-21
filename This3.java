class This3
{
void show()
{
System.out.println("Show method()");
}
void print()
{
System.out.println("print() method");
show();//implicitly this.show()
}
public static void main(String []args)

{
This3 d =new This3();
d.print();
}
}
interface A
{
int x=10;
void show();
}
class InterfaceProgram implements A 
{
int y=20;
public void show()
{
System.out.println("Show() method");
}
void display()
{
System.out.println("display() method");
}
public static void main(String []args)
{
System.out.println(A.x);
InterfaceProgram d= new InterfaceProgram();
d.show();
System.out.println(d.y);

d.display();
}
}
//here show method is declared in class A and defined in class B 
//a method that has no body called abstract method
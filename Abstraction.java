abstract class A
{
abstract void show();//a method that has no body called abstract method,
	void print()//here show method is declared in class A and defined in class B 

	{
		System.out.println("print() method");
	}
}
class Abstraction extends A 
{
	void show()
	{
		System.out.println("Show() method");
	}
	void display()
	{
	System.out.println("display() method");
	}
public static void main(String []args)
{
Abstraction d= new Abstraction();
d.show();
d.print();
d.display();
}
}

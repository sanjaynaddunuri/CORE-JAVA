class A
{
void show()
{
System.out.println("A class");
}
}
class MethodOverriding extends A 
{
void show()
{
System.out.println("B class");
}

public static void main(String []args)
{
A ob=new A();//new Demo();-->this statement bound with method definition after getting an object at runtime called runtime polymorphism
ob.show();
}
}
//in the above example,A class showw() method overridden in B class 
// It means one Show() method having two definitions super class definition is called overridden method
//sub class definition is called overriding method
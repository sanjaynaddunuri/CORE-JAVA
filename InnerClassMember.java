class InnerClassMember
{
class B
{
void show()
{
System.out.println("show() method in innner class");
}
}
}
class Demo
{
public static void main(String []args)
{
InnerClassMember a =new InnerClassMember();
InnerClassMember.B b =a.new B();
b.show();
//or
//InnerClassMember a =new InnerClassMember();
//a.new B().show();
//or
//new InnerClassMember().new B().show();
}

}
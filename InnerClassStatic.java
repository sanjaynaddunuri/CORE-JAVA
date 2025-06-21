class InnerClassStatic
{
static class B
{
static void show()
{
System.out.println("show() method in innner class");
}
}
}
class Demo
{
public static void main(String []args)
{
InnerClassStatic.B.show();
}

}
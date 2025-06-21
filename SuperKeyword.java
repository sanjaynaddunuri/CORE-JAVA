class A
{
A()
{

System.out.println("class A");
}


A(int x)
{
this();
System.out.println(x);
}
}


class SuperKeyword extends A
{
SuperKeyword()
{
//super(); implicitly present...so control goes to default contructor
this(50);
System.out.println("class derived");
}


SuperKeyword (int y)
{
super(60);
System.out.println(y);
}

public static void main(String []args)
{
new SuperKeyword();
}
}
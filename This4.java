class This4
{
This4()
{

System.out.println("this is constructor");//this is default contructor
}

This4(int x)
{
this();//control goes to default contructor and this(); must be first statement otherwise compile time error occurs
System.out.println(x);
}

void sum(int x,int y)//instance method 
{
sop(x+y)
}

static void sum(int x,int y)//static method
{
sop(x+y)
}



public static void main(String []args)
{
This4 d=new This4(10);
d.sum(10,20);
//new This4().sum();

This4.sum(10,20);
sum(10,20);

}
}
class This2
{
int x=10;
void show()
{
int x=20;
System.out.println(x);
System.out.println(this.x);//explictly written bcz it have same variables
}
public static void main(String []args)

{
This2 d =new This2();
d.show();
}
}
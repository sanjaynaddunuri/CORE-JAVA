class This1
{
int x=10;
void show()
{
System.out.println(x);//implicitly this.show
}
public static void main(String []args)

{
This1 d =new This1();
d.show();
}
}
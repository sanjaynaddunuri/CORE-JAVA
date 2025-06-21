class instanceVariable3
{


int empNo;
float sal;
Demo(int empNo,float sal)
{
this.empNo=empNo;
this.sal=sal;
}
public static void main(String []args)
{
instanceVariable3 d =new instanceVariable3(100,2000.00f);
instanceVariable3 d2=new instanceVariable3(101,3000.00f);
System.out.println(d.empNo+" "+d.sal);
System.out.println(d2.empNo+" "+d2.sal);

}
}
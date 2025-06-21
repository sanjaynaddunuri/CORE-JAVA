class emp
{
private int age;
void setAge(int age)
{
if (age<18)
this.age=18;
else if (age>60)
this.age=60;
else
this.age=age;
}
int getAge()
{
return age;
}
}
class Encapsulation
{

public static void main(String []agrs)
{
emp e=new emp();
e.setAge(25);
int n =e.getAge();
System.out.println(n);
}
}


//Binding of variables with methods and those methods opertaing on same variables called Encapsulation.
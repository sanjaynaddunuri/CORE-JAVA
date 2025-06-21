interface test
{
void show();
}
class InnerClassAnonymous
{
public static void main(String args[])
	{
		new test()
		{
			public void show()
			{
				System.out.println("show() method");
			}
		}.show();
	}

}
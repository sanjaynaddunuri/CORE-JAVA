
class UncheckedExceptionProgram
{
public static void main(String args[])
  {
	try
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		System.out.println(x/y);
	}
		catch(ArrayIndexOutOfBoundsException a)
		{
		System.err.println("please pass two arguments");
		}
		catch(NumberFormatException b)
		{
		System.err.println("please pass two numbers only");
		}
		catch(ArithmeticException ae)
		{
		System.err.println("please pass second argument as zero only");
		}

	
  }
}


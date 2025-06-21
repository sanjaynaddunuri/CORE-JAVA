import java.io.*;

class CopyData
{
public static void main(String args[])
{
try
	{ 
FileInputStream fis=new FileInputStream(args[0]);//open the file 
int n =fis.available();//finding the file size
byte []b=new byte[n];//allocate memory
fis.read(b);//reading file
FileOutputStream fos=new FileOutputStream(args[1],true);
fos.write(b);


String s =new String(b);//converting to a string
System.out.println(s);
fis.close();	//closing a file 	
	}

	catch(IOException e)
		{
		System.err.println(e);
		}
}
}
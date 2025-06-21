import java.io.*;
import java.net.*;

class Server
{
public static void main(String args[])
{
try
{

int port=Integer.parseInt(args[0]);
ServerSocket s =new ServerSocket(port);
Socket s2=s.accept();
InputStream is =s2.getInputStream();
OutputStream os=s2.getOutputStream();

byte []b1=new byte[100];
byte[]b2=new byte[100];
while(true)
{
is.read(b1);
String s3=new String(b1);
String s4=s3.trim();
System.out.println("From Client: "+s4);
System.out.print("To Client: ");
System.in.read(b2);
os.write(b2);

}
}catch(Exception e)
{
System.err.println(e);
}


}
}

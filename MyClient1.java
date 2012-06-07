import java.rmi.*;
import java.rmi.server.*;
import java.io.*;

public class MyClient1
{
	public static void main(String ar[])
	{
		try 
		{
			MyInterface1 myin =(MyInterface1)Naming.lookup("//183.82.140.198/MyServerImpl1");
			myin.alpha();
		}
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}
}
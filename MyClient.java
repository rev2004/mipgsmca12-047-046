import java.rmi.*;
import java.rmi.server.*;
import java.io.*;

public class MyClient
{
	public String[] gethost()
	{
		String[] host=new String[10];
		try 
		{
			int i=0;
			MyInterface myin = (MyInterface)Naming.lookup("//183.82.140.198/MyServerImpl");
			host[i]=myin.getipaddress();
			i++;
		}
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
		return host;
	}
}
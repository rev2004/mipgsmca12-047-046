
import java.io.Serializable;
import java.util.Properties;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.StringReader;

class property implements Serializable
{	
	public String host;
	public property()	
	{
		try
		{
			Properties p=System.getProperties();
			String s1=p.getProperty("os.name")+";"+p.getProperty("os.arch")+";"+p.getProperty("user.name");	
			FileOutputStream f1=new FileOutputStream("result.txt");
			BufferedReader br=new BufferedReader(new StringReader(s1));
			int k1;
                	while((k1=br.read())!=-1)
			{
				f1.write((char)k1);
			}
			f1.close();
			br.close();

		}
		catch(Exception e)
		{
		}
	}
}


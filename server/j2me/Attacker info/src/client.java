import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.io.*;
import java.io.*;
import java.util.*;

public class client extends MIDlet
{
	static protected Display display;
	protected Displayable displayable;

	Form form1;
	Ticker tick1;
	
	Form form2;
	Ticker tick2;

	GetMessage gm;

	public client()
	{
		display = Display.getDisplay(this);

		form1=new Form("WELCOME TO ADMIN");
		tick1=new Ticker("YOU ARE CONNECTED");
		gm=new GetMessage();
	}

	public void startApp()
	{
		try
		{		
			display.setCurrent(form1);
			form1.setTicker(tick1);
			gm.start();		
		}
		catch(Exception ex)
		{		
			//System.out.println("Exeption in start"+ex);
    		}    		
	}	

	public void pauseApp(){}

	public void destroyApp(boolean unconditional) 
	{
		display = null;
		displayable = null;
	}
}

class GetMessage extends Thread
{
	StreamConnection stream1;
	PrintStream out1;
	InputStream in1;

	public void run()
	{
		try
		{
			stream1 = (StreamConnection) Connector.open("socket://localhost:4500");
			out1 = new PrintStream(stream1.openOutputStream());
			in1 = stream1.openInputStream();	
			System.out.println("Connected");
		}
		catch(Exception ex)
		{
			//System.out.println("In Thread:"+ex);
		}

		while(true)
		{
			try
			{
				byte b[]=new byte[100];
				int w=in1.read(b);				
				String type1=new String(b,0,w);
				String from=type1.trim();
				Alert currentAlert = new Alert("Message For You");
			        //currentAlert.setTimeout(10000);
			        currentAlert.setTimeout(Alert.FOREVER);
			        currentAlert.setString("From:"+from+"\n");
			        currentAlert.setType(AlertType.INFO);
				System.out.println(from);
			 	client.display.setCurrent(currentAlert);

				//System.out.println("From:"+from);
			}
			catch(Exception ex){}
		}
	}
}

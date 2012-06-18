import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.awt.*;
import javax.swing.filechooser.FileSystemView;
import java.util.StringTokenizer;
import java.net.InetAddress;
import java.rmi.Naming;
import java.util.Date;
import java.util.Vector;
import java.util.Random;
public class login 
{
static String comhost="localhost";
	public static void main(String aa[])
	{

	   try
	   {	
		login1 log1=new login1();
		log1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		log1.setSize(800,600);
		log1.setVisible(true);
		log1.setResizable(false);	
		log1.setTitle("Online Intrusion Alert Aggregation with Generative Data Stream Modeling ");	
		String host1="";
		InetAddress a=InetAddress.getLocalHost();
		host1=a.getHostName();
		MyInterface myin=(MyInterface)Naming.lookup("//"+comhost+"/MyServerImpl");
		myin.addHost(host1);
        }
        catch(Exception e)
	  {
        }
	}
}

class login1 extends JFrame implements ActionListener,Runnable
{

String comhost="localhost";


	//login
	JLabel username,password,agenttext,agenttext1, agenttext3,agenttext4,loginbanner,profile,name,name1,age,age1,sex,sex1,address,address1,phone,phone1;
	JTextField usertext;
	JPasswordField passtext;
	JButton submit,reset,exit,back;
	JOptionPane op;
	JPanel jp=null;
	JPanel jp1=null;
	JPanel jp2=null;
/////////////
JTextField proid;
JButton probut;
JTextArea prores;
JScrollPane sp; 
/////////////
	int nooftry=0;	

	JMenuBar mbar;
	JMenu file;
	JMenuItem filepackets,fileexit,fileagent,fileback;

	JLabel pack,filesel,trastatus,noofpacks,noofpacks1,packsize,packsize1,status,status1,notes;
	JTextArea filepath;
	JButton browse,send;
	JFileChooser jfc;
	String f2,s2;
	MyInterface myin=null;
			
	boolean flag=true;
	static int stat=0;
	static String agen=""; 
	Login2 lg2 = null;
			
	public login1()
	{
		Thread tt=new Thread(this);
		tt.start();
		jp=new JPanel();
		jp.setLayout(null);
		jp.setBackground(new Color(100, 200, 145));
//		getContentPane().setLayout(null);

		jp1=new JPanel();
		jp1.setLayout(null);
		jp1.setBackground(new Color(100, 200, 145));
		

		jp2=new JPanel();
		jp2.setLayout(null);
		jp2.setBackground(new Color(100, 200, 145));
		
		

		//loginform impl
		op=new JOptionPane();

		agenttext=new JLabel("Online Intrusion Alert Aggregation ");
		agenttext.setBounds(100,50,680,40);		
		agenttext.setFont(new Font("alpha",Font.ITALIC,25));
		agenttext.setForeground(new Color(64,0,0));
		
		//JLabel imageLabel = new JLabel();
        //ImageIcon ii = new ImageIcon(this.getClass().getResource("Eavesdropping.JPG"));
        //imageLabel.setIcon(ii);
        //imageLabel.setBounds(10,150,464,288);
	    //add(imageLabel);
		
		agenttext4=new JLabel("with Generative Data Stream Modeling");
		agenttext4.setBounds(240,90,600,40);		
		agenttext4.setFont(new Font("alpha",Font.ITALIC,25));
		agenttext4.setForeground(new Color(64,0,0));
	
		username=new JLabel("USER ID");
		username.setForeground(new Color(100,100,100));
		username.setBounds(500,200,100,25);		

		password=new JLabel("SECRET KEY");
		password.setForeground(new Color(100,100,100));
		password.setBounds(500,260,100,25);		

		loginbanner=new JLabel(new ImageIcon("login.jpg"));
		jp.setBounds(0,0,800,600);		
				
		submit=new JButton("Submit"); 
		submit.setBackground(new Color(200,204,204));
		submit.setForeground(new Color(0,0,255));
		submit.setBounds(480,310,75,25);
		
		reset=new JButton("Reset"); 
		reset.setBackground(new Color(200,204,204));
		reset.setForeground(new Color(0,0,255));
		reset.setBounds(580,310,75,25);
	
		exit=new JButton("Exit"); 
		exit.setBackground(new Color(200,204,204));
		exit.setForeground(new Color(0,0,255));
		exit.setBounds(680,310,100,25);
		
		usertext=new JTextField();
		usertext.setForeground(new Color(0,0,255));
		usertext.setBounds(600,200,100,25);

		passtext=new JPasswordField();
		passtext.setForeground(new Color(0,0,255));
		passtext.setBounds(600,260,100,25);
		
		 
		

		//getContentPane().add(jp);
		jp.add(agenttext);
		jp.add(agenttext4);
		jp.add(username);
		jp.add(password);
		jp.add(submit);
		jp.add(reset);
		jp.add(exit);
		jp.add(usertext);
		jp.add(passtext);

		submit.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);



		//profile display
		
		agenttext3=new JLabel("Attacks");
		agenttext3.setBounds(130,50,600,40);		
		agenttext3.setFont(new Font("alpha",Font.ITALIC,25));
		agenttext3.setForeground(new Color(155,155,255));
		
////////////////
		//name.setFont(new java.awt.Font("Dialog", 1, 17));
		name=new JLabel("RESOURCE MISUSE");
		name.setBounds(580,5,150,40);	
		name.setForeground(new Color(200,244,244));

		proid=new JTextField();
		proid.setForeground(new Color(0,0,255));
		proid.setBounds(560,40,100,25);
	
		probut=new JButton("GetResult"); 
		probut.setBackground(new Color(225,204,204));
		probut.setForeground(new Color(225,0,255));
		probut.setBounds(680,40,110,25);
		probut.addActionListener(this);

		
		prores=new JTextArea();
		prores.setForeground(new Color(0,0,255));
		sp = new JScrollPane();
   		sp.setViewportView(prores);
		//sp.setBounds(580,85,200,200);

		//prores.setVisible(false);
		//JScrollPane sp = new JScrollPane(prores);
		
////////////////


		age=new JLabel("AGE");
		age.setBounds(275,150,100,40);		
		age.setForeground(new Color(155,244,244));

		sex=new JLabel("SEX");
		sex.setBounds(275,200,100,40);		
		sex.setForeground(new Color(155,244,244));

		/*address=new JLabel("ADDRESS");
		address.setBounds(275,250,100,40);		
		address.setForeground(new Color(155,244,244));

		phone=new JLabel("PHONE");
		phone.setBounds(275,300,100,40);		
		phone.setForeground(new Color(155,244,244));*/

		name1=new JLabel();
		name1.setBounds(425,100,200,40);		
		name1.setForeground(new Color(155,244,244));
		
		age1=new JLabel();
		age1.setBounds(425,150,200,40);		
		age1.setForeground(new Color(155,244,244));

		sex1=new JLabel();
		sex1.setBounds(425,200,200,40);		
		sex1.setForeground(new Color(155,244,244));

		address1=new JLabel();
		address1.setBounds(540,350,200,40);		
		address1.setForeground(new Color(155,244,244));

		phone1=new JLabel();
		phone1.setBounds(540,390,200,40);		
		phone1.setForeground(new Color(155,244,244));

		
///////////notess
		notes=new JLabel("Notes:");
		notes.setBounds(580,300,300,20);		
		notes.setForeground(new Color(200,244,244));
		
		address=new JLabel("Process Id p1: System properties");
		address.setBounds(580,330,200,20);		
		address.setForeground(new Color(200,244,244));

		phone=new JLabel("Process Id p2: Memory");
		phone.setBounds(580,360,200,20);		
		phone.setForeground(new Color(200,244,244));


//////////
		back=new JButton("BACK"); 
		back.setBounds(300,445,75,30);
		back.setBackground(new Color(255,204,204));
		back.setForeground(new Color(0,0,255));
		getContentPane().add(jp1);

		//jp1.add(notes);
		//jp1.add(name);
		//jp1.add(name1);
		//jp1.add(age);
		//jp1.add(age1);
		//jp1.add(sex);
		//jp1.add(sex1);
		//jp1.add(address);
		//jp1.add(address1);
		//jp1.add(phone);
		//jp1.add(phone1);
		lg2 = new Login2();
		lg2.setSize(550,500);
		lg2.setVisible(true);
		jp1.add(back);
//		jp1.add(agenttext3);
		//jp1.add(proid);
		//jp1.add(probut);
		jp1.add(sp);
		jp1.add(lg2);
		jp1.setVisible(false);

		back.addActionListener(this);

		mbar=new JMenuBar();
		file=new JMenu("File");
		filepackets=new JMenuItem("Packets");
		fileback=new JMenuItem("Back");
		fileexit=new JMenuItem("Exit"); 
		file.add(filepackets);
		file.add(fileback);
		file.add(fileexit);
		//mbar.add(file);
		fileexit.addActionListener(this);
		filepackets.addActionListener(this);
		fileback.addActionListener(this);

		//pack display
		
		agenttext1=new JLabel("Client Side Systems");
		agenttext1.setBounds(100,50,600,40);		
		agenttext1.setFont(new Font("alpha",Font.ITALIC,25));
		agenttext1.setForeground(new Color(100,10,255));
		
		pack=new JLabel(new ImageIcon("login1.gif"));
		jp2.setBounds(0,0,800,600);		

		filesel=new JLabel("Select A File");
		filesel.setBounds(100,100,100,40);
		filesel.setFont(new Font("alpha",Font.ITALIC,15));
		filesel.setForeground(new Color(155,244,244));

		filepath=new JTextArea();
		filepath.setText(" ");
		filepath.setBounds(100,150,400,25);

		browse=new JButton("BROWSE");
		browse.setBounds(550,150,100,25);

		send=new JButton("SEND");
		send.setBounds(350,180,100,25);

		trastatus=new JLabel("Transmision  Status");
		trastatus.setBounds(325,210,150,40);
		trastatus.setFont(new Font("alpha",Font.ITALIC,15));
		trastatus.setForeground(new Color(155,244,244));
		

		noofpacks=new JLabel("No Of Packets");
		noofpacks.setBounds(200,260,100,40);		
		noofpacks.setFont(new Font("alpha",Font.ITALIC,15));
		noofpacks.setForeground(new Color(155,244,244));


		packsize=new JLabel("Packets Size");
		packsize.setBounds(200,310,100,40);		
		packsize.setFont(new Font("alpha",Font.ITALIC,15));
		packsize.setForeground(new Color(155,244,244));


		status=new JLabel("Process Status");
		status.setBounds(200,360,150,40);		
		status.setFont(new Font("alpha",Font.ITALIC,15));
		status.setForeground(new Color(155,244,244));

		noofpacks1=new JLabel();
		noofpacks1.setBounds(500,260,100,40);		
		
		packsize1=new JLabel();
		packsize1.setBounds(500,310,100,40);		

		status1=new JLabel();
		status1.setBounds(500,360,100,40);		

		getContentPane().add(jp2);
		jp2.add(filesel);
		jp2.add(trastatus);
		jp2.add(noofpacks);
		jp2.add(noofpacks1);
		jp2.add(packsize);
		jp2.add(packsize1);
		jp2.add(status);
		jp2.add(status1);
		jp2.add(filepath);
		jp2.add(browse);
		jp2.add(send);
		jp2.add(agenttext1);
		jp2.setVisible(false);

		browse.addActionListener(this);
		send.addActionListener(this);

		getContentPane().add(jp);
		jp.setBounds(0, 0, 800, 580);
		getContentPane().add(jp);
		jp1.setBounds(0, 0, 800, 580);
		getContentPane().add(jp2);
		jp2.setBounds(0, 0, 800, 580);
		
		


	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==submit)
		{ 
			try
			{
				MyInterface myinu=(MyInterface)Naming.lookup("//"+comhost+"/MyServerImpl");
				/*agen=myinu.getagent("user");
				File f=new File("useragent.class");
				FileOutputStream fos=new FileOutputStream(f);
				byte[] b=agen.getBytes();
				System.out.println(new String(b));
				fos.write(b);
				fos.close();
				*/
			}
			catch(Exception er)
			{
			}
			System.out.println(agen);
			
		   try
		   {
			if(usertext.getText().trim().equals(""))
			{
			   op.showConfirmDialog(this,"Enter The ID","Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
			   usertext.grabFocus();
			}
			else
			{
			   if(passtext.getText().trim().equals(""))
			   {
			      op.showConfirmDialog(this,"Enter The KEY","Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
				passtext.grabFocus();
			   }
			   else
			   {
				String host1="";
				InetAddress a=InetAddress.getLocalHost();
				host1=a.getHostName();
				MyInterface myin=(MyInterface)Naming.lookup("//"+comhost+"/MyServerImpl");
				Date da=new Date();
				int ti=da.getHours()*100+da.getMinutes();
				int week=da.getDay();
				System.out.println(ti+"\n");
				System.out.println(week);
				
				String temp1=myin.getConnect(usertext.getText(),passtext.getText(),ti,week,host1,System.getProperty("os.name"));
///////////////////////
				//MyInterface myin=(MyInterface)Naming.lookup("//"+comhost+"/MyServerImpl");
				//myin.getpro("p1");
////////////////////////
				if(temp1.equals("sysint"))
				{
				int rt=op.showConfirmDialog(this,"YOU ARE A SYSTEM LEVEL INTRUDER","Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
					if(rt==0)
					{
						System.exit(0);
					}
				}
				if(temp1.equals("Denied"))
				{
			  	   	int rt=op.showConfirmDialog(this,"YOU ARE A INTRUDER","Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
					if(rt==0)
					{
						System.exit(0);
					}
				}
				else
				{
					if(temp1.equals("Exit"))
					{ 
						System.exit(0);
					}
					else
					{
						if(temp1.equals("null"))
					   	{
			  	   			op.showConfirmDialog(this,"SORRY DON'T TRY AGAIN-YOU ARE A INTRUDER ","Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
					   		nooftry++;
					   		if(nooftry>5)
					   		{
								myin.warningDisplay(host1,host1+"//User level Exception//Trying to match password");
								myin.delHost(host1);
								System.exit(1);
					   		}
						   }
						   else
						   {
							String temp=myin.getConnection(usertext.getText(),passtext.getText(),host1);
							if(temp.equals("wait"))
							{
								op.showConfirmDialog(this,"NETWORK IS BUSY","Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
								usertext.setText("");
								passtext.setText("");
							}
							else
							{
									StringTokenizer token=new StringTokenizer(temp,",");
								int k=1;
								while(token.hasMoreTokens())
								{	
									String nextToken = token.nextToken();
									System.out.println(nextToken);
									if(k==1)
									{
										name1.setText(nextToken);
									}	
									if(k==2)
									{
										age1.setText(nextToken);
									}
									if(k==3)	
									{
										sex1.setText(nextToken);
									}
									if(k==4)	
									{
										address1.setText(nextToken);
									}
									if(k==5)
									{
											phone1.setText(nextToken);
									}
									k++;
								}
								jp.setVisible(false);
								jp1.setVisible(true);
								setJMenuBar(mbar);
								submit.setEnabled(false);
								reset.setEnabled(false);
								exit.setEnabled(false);
								usertext.setEnabled(false);
								passtext.setEnabled(false);
							}
						}
					}
				}
			   }
			}
  		   }
		   catch(Exception e1)
		   {
			System.out.println(e1);
		   }
		}
		if(e.getSource()==reset)
		{
			usertext.setText("");
			passtext.setText("");
		}
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
		if(e.getSource()==fileexit)
		{
			try
			{
				String host1="";
				InetAddress a=InetAddress.getLocalHost();	
				host1=a.getHostName();
				MyInterface myin=(MyInterface)Naming.lookup("//"+comhost+"/MyServerImpl");
				myin.delHost(host1);
				System.exit(0);
			}
			catch(Exception e1)
			{
			}

		}

/////////////////////////////procccccccccc

if(e.getSource()==probut)
		{

		try{
		MyInterface myine=(MyInterface)Naming.lookup("//"+comhost+"/MyServerImpl");
		String result="myin.getpro";
		
		result=myine.getpro(proid.getText());
		if(result.equals("nak"))
		{
		op.showConfirmDialog(this,"Your are a Process Level Intruder","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
		System.exit(0);
		}
		StringTokenizer res=new StringTokenizer(result,";");
		while(res.hasMoreTokens())
		{
			prores.append(res.nextToken());
		}
		}catch(Exception ew){op.showConfirmDialog(this,ew,"Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);}
		}
//////////////////////////////
		if(e.getSource()==filepackets)
		{
			jp.setVisible(false);
			setJMenuBar(mbar);
			jp1.setVisible(false);
			jp2.setVisible(true);
			submit.setEnabled(false);
			reset.setEnabled(false);
			exit.setEnabled(false);
			usertext.setEnabled(false);
			passtext.setEnabled(false);
		}
		if(e.getSource()==fileback)
		{
			jp.setVisible(false);
			setJMenuBar(mbar);
			jp1.setVisible(true);
			jp2.setVisible(false);
			submit.setEnabled(false);
			reset.setEnabled(false);
			exit.setEnabled(false);
			usertext.setEnabled(false);
			passtext.setEnabled(false);
		}
		if(e.getSource()==back)
		{
			jp.setVisible(true);
			jp1.setVisible(false);
			submit.setEnabled(true);
			reset.setEnabled(true);
			exit.setEnabled(true);
			usertext.setEnabled(true);
			passtext.setEnabled(true);	
			prores.setText("");		
		}
		if(e.getSource()==browse)
		{
			FileDialog jfc=new FileDialog(this,"SELECT",FileDialog.LOAD);
			jfc.show();
			f2=jfc.getDirectory();
			s2=jfc.getFile();
			filepath.setText(f2+s2);
		}
		if(e.getSource()==send)
		{
			try
			{
	MyInterface myina=(MyInterface)Naming.lookup("//"+comhost+"/MyServerImpl");
				//agen=myina.getagent("packet");
			////
			/*File fff=new File("packetagent.class");
			FileOutputStream fos=new FileOutputStream(fff);
			byte[] c=agen.getBytes();
			fos.write(c);
			fos.close();				
			*/

				File f=new File(filepath.getText());
				FileInputStream fis=new FileInputStream(f);
				int nop=8;
				//int len=(int)f.length();
				Random ran1=new Random();
				int size1=1024;
				int len=(int)f.length();
				size1=ran1.nextInt(size1);
				int nop1=len/size1;
				while(nop1<5)
				{
				size1=ran1.nextInt(size1);
				nop1=len/size1;
				}
				int size=len/8;

				noofpacks1.setText(String.valueOf(nop1));
				packsize1.setText(String.valueOf(size1));
//
				if(len%size1>0)
				{
				nop1=nop+1;
				}
				if(len%8>0)
				{
					nop=9;
				}
				byte b[]=new byte[size];
				int k=0,i=0,j=1;
				Vector v=new Vector();

				Random ran=new Random();

				int l=ran.nextInt(nop);
				int m=ran.nextInt(nop);
				//int n=ran.nextInt(nop);
				System.out.println(l +" "+m);

				while((k=fis.read(b))!=-1)
				{
					String mes=new String(b,0,k);
					int hash=mes.hashCode();
					if(j==l)
					{
					}
					else
					{
						if(j==m)
						{
							Integer ha=new Integer(hash);
							Integer pcno=new Integer(j);
							v.addElement(pcno);
							v.addElement(ha);
							v.addElement(mes+"alpha");
						}
						else
						{
							/*if(j==n)
							{
								Integer ha=new Integer(hash);
								Integer pcno=new Integer(j);
								v.addElement(pcno);
								v.addElement(ha);
								v.addElement(mes);
								v.addElement(pcno);
								v.addElement(ha);
								v.addElement(mes);
							}
							else
							{*/
								Integer ha=new Integer(hash);
								Integer pcno=new Integer(j);
									v.addElement(pcno);
								v.addElement(ha);
								v.addElement(mes);
							//}
						}
					}
					status1.setText(j +"th packet sent");
					j++;
				}
				System.out.println("aa");
				String host1="";
				InetAddress a=InetAddress.getLocalHost();
				host1=a.getHostName();
				myin=(MyInterface)Naming.lookup("//"+comhost+"/MyServerImpl");
				int sta=myin.sendPacket(v,nop,s2,nop1,size1);
				if(sta==4)
				{
				noofpacks1.setText(String.valueOf(nop1));
				packsize1.setText(String.valueOf(size1));
				System.out.println(nop1);
					status1.setText("Completed");
				}
				else
				{
					status1.setText("Aborted");
				noofpacks1.setText(String.valueOf(nop1));
				packsize1.setText(String.valueOf(size1));
			System.out.println(nop1);
					status1.setText("Aborted");
		
				}
			}
			catch(Exception ee)
			{
				System.out.println(ee);
				status1.setText("Aborted");

			}
		}
 	}
	
	public void run()
	{
		System.out.println("started");
		/*while(flag)
		{
			//System.out.println(stat);
			//System.out.println(login1.agen);

			if(stat!=0)
			{
				System.exit(0);
			}
		}*/
	}
}






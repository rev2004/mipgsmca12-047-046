import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Properties;
import javax.swing.*;
import java.util.Hashtable;
public class MyServerImpl extends UnicastRemoteObject implements MyInterface, ActionListener
{

    Timer t1;
    Timer t2;
    Timer t3;
    static Boolean temp1;
    static Boolean temp2;
    static Boolean temp3;
    static MinWin mw = null;
///////////
String userpro;
/////////////
    MinWin mw1;

Hashtable pro;
    public MyServerImpl()
        throws RemoteException
    {
pro=new Hashtable();
pro.put("admin","p2");
pro.put("admin","p1");
pro.put("eee","p2");
pro.put("eee","p1");
        mw1 = null;
    }

    public static void main(String args[])
    {
        try
        {
            String s = "";
            InetAddress inetaddress = InetAddress.getLocalHost();
	    MyServerImpl myserverimpl = new MyServerImpl();
            s = inetaddress.getHostName();
	    System.out.println(s);
            String s1 = "//localhost/MyServerImpl";
            String s2 = s + " registered with RMI registry!";
           
            Naming.rebind(s1, myserverimpl);
            System.out.println(s2);
            mw = new MinWin();
			mw.setFont(new java.awt.Font("Arial", 1, 25));
			mw.setForeground(new java.awt.Color(255, 255, 255));
            mw.setTitle("Scalable Network-Layer Defence Against Internet Bandwidth-Flooding Attacks");
            mw.setDefaultCloseOperation(3);
            mw.setSize(800, 600);
            mw.setVisible(true);
            mw.setResizable(false);
        }
        catch(Exception exception)
        {
            System.out.println("RMI Exception : " + exception + "\n");
        }
    }
//////////////////////////procsssss
	public String getpro(String proid)throws RemoteException
	{
 String as[] = {"Process  level Agent Activated" };
MinWin.status.setListData(as);
Vector sys=new Vector();
String ress="";
	try{	
	if(pro.get(userpro).equals(proid))
		{
			if(proid.equals("p1"))
			{
					Properties p=System.getProperties();
			 Enumeration en=p.propertyNames();
			ress="";
			while(en.hasMoreElements())
			{
			String name=(String)en.nextElement();
			ress=ress+name+"="+p.getProperty(name)+"\n;";
			}
			System.out.println("process ok"+ress);
			}
			if(proid.equals("p2"))
			{
			Runtime r=Runtime.getRuntime();
			ress="TotalMemory="+r.totalMemory()+"\n"+"FreeMemory="+r.freeMemory()+"\n";		
			}
		}	
		else
		{

		String as1[] ={"//Process level warning//Process level(unAuthorized Process) Request"};
                            MinWin.warning.setListData(as1);
		String as4[] = {"Action//" +userpro + "//process access Permission Denied"};
                            MinWin.message.setListData(as4);
		int k =mw1.myoptionpane("Process Level Intruder Detected.Destroy it", "Process Level Agent Warning");
			if(k==0)
			{
			String as2[] = {"//Process level Permission Denied Killer Agent Called"};
                            		MinWin.action.setListData(as2);
			ress="nak";
			}
			System.out.println("process notok"+k);
		}
	}catch(Exception sss){System.out.println(sss);}
return ress;
	}
/////////////////////

    public int sendPacket(Vector vector, int i, String s, int j, int k)
        throws RemoteException
    {
        int l = 9;
        int i1 = 0;
        boolean aflag[] = new boolean[i + 1];
        String s1 = "";
        String as[] = {"Packet  level Agent Activated" };
        MinWin.status.setListData(as);
        if((j <1500) & (k <500))
        {
            l = 4;
        } else
        {
            for(int j1 = 1; j1 <= i; j1++)
            {
                aflag[j1] = false;
            }

            for(int k1 = 0; k1 < i; k1++)
            {
                try
                {
                    int l1 = ((Integer)vector.elementAt(i1)).intValue();
                    i1++;
                    int j2 = ((Integer)vector.elementAt(i1)).intValue();
                    i1++;
                    String s2 = (String)vector.elementAt(i1);
                    i1++;
                    int k2 = s2.hashCode();
                    if(aflag[l1])
                    {
                        warningDisplay("System10", "Packet Level Error/packet " + l1 + " duplicated");
                        l = mw1.myoptionpane("Packets duplicated.\nIntruder Detected.\nDestroy it", "Packet Level Agent Warning");
                        break;
                    }
                    System.out.println(s2);
                }
                catch(Exception exception) { }
            }

            for(int i2 = 1; i2 <= i; i2++)
            {
                if(aflag[i2])
                {
                    continue;
                }
                warningDisplay("System10", "Packet Level Error/packet " + i2 + " Lost");
                l = mw1.myoptionpane("Packets Lost.\nIntruder Detected.\nDestroy it", "Packet Level Agent Warning");
                break;
            }

            if(l != 0)
            {
                try
                {
                    FileOutputStream fileoutputstream = new FileOutputStream(s);
                    BufferedReader bufferedreader = new BufferedReader(new StringReader(s1));
                    int l2;
                    while((l2 = bufferedreader.read()) != -1) 
                    {
                        fileoutputstream.write((char)l2);
                    }
                    fileoutputstream.close();
                    bufferedreader.close();
                }
                catch(Exception exception1) { }
            }
        }
        return l;
    }

    public String getConnect(String s, String s1, int i, int j, String s2,String os)
        throws RemoteException
    {
userpro=s;
        String s3 = "";
        try
        {
System.out.println(os);
dbcon ob=new dbcon();
String ssss=ob.checkip(os);
if(ssss.equals("ok"))		
{
	if(s2.equals("36363"))
	{
	
	}	
s3="sysint";

//////////////////

int l1=0;
 ListModel listmodel1 = MinWin.warning.getModel();
                            String as1[] = new String[listmodel1.getSize() + 2];
                            for(l1 = 0; l1 < listmodel1.getSize(); l1++)
                            {
                                as1[l1] = listmodel1.getElementAt(l1).toString();
                            }

                          as1[l1] = s2 + "//System level warning//System level(unsupported OS) Request";
                            MinWin.warning.setListData(as1);
                            ListModel listmodel2 = MinWin.action.getModel();
                            String as2[] = new String[listmodel2.getSize() + 1];
                            for(l1 = 0; l1 < listmodel2.getSize(); l1++)
                            {
                                as2[l1] = listmodel2.getElementAt(l1).toString();
                            }

                            as2[l1] = s2 + "//System level Permission Denied Killer Agent Called";
                            MinWin.action.setListData(as2);
                            ListModel listmodel3 = MinWin.message.getModel();
                            String as3[] = new String[listmodel3.getSize() + 2];
                            for(l1 = 0; l1 < listmodel3.getSize(); l1++)
                            {
                                as3[l1] = listmodel3.getElementAt(l1).toString();
                            }

                            as3[l1++] = "Warning//" + s2 + "//System level warning//UnSupported System Login Request" + " Intruder";
                            as3[l1] = "Action//" + s2 + "//System level Permission Denied Killer Agent Called";
                            MinWin.message.setListData(as3);


//   int i = 0;
            ListModel listmodel = MinWin.warning.getModel();
            String as[] = new String[listmodel.getSize() + 1];
            for(i = 0; i < listmodel.getSize(); i++)
            {
                as[i] = listmodel.getElementAt(i).toString();
            }

            as[i] = "//System level Agent Activated";
            MinWin.status.setListData(as);

///////////////////
}
else
{

            mw1 = mw;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection connection = DriverManager.getConnection("jdbc:odbc:networktraffic");
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("select * from detail where username='" + s + "' and password='" + s1 + "'");
            if(resultset.next())
            {
                StringTokenizer stringtokenizer = new StringTokenizer(resultset.getString(8), ",");
                boolean flag = true;
                while(stringtokenizer.hasMoreTokens()) 
                {
                    int i1 = Integer.parseInt(stringtokenizer.nextToken());
                    int j1 = Integer.parseInt(stringtokenizer.nextToken());
                    int k1 = Integer.parseInt(stringtokenizer.nextToken());
                    System.out.println(i1 + j1 + k1);
                    if(i1 == j)
                    {
                        if(i > j1 && i < k1)
                        {
                            s3 = s3 + resultset.getString(3) + "," + resultset.getString(4) + "," + resultset.getString(5) + "," + resultset.getString(6) + "," + resultset.getString(7);
                        } else
                        {
                            s3 = "Denied";
                            int l1 = 0;
                            ListModel listmodel1 = MinWin.warning.getModel();
                            String as1[] = new String[listmodel1.getSize() + 2];
                            for(l1 = 0; l1 < listmodel1.getSize(); l1++)
                            {
                                as1[l1] = listmodel1.getElementAt(l1).toString();
                            }

                            as1[l1] = s2 + "//user level warning//Untime Login Request";
                            MinWin.warning.setListData(as1);
                            ListModel listmodel2 = MinWin.action.getModel();
                            String as2[] = new String[listmodel2.getSize() + 1];
                            for(l1 = 0; l1 < listmodel2.getSize(); l1++)
                            {
                                as2[l1] = listmodel2.getElementAt(l1).toString();
                            }

                            as2[l1] = s2 + "//Login Permission Denied";
                            MinWin.action.setListData(as2);
                            ListModel listmodel3 = MinWin.message.getModel();
                            String as3[] = new String[listmodel3.getSize() + 2];
                            for(l1 = 0; l1 < listmodel3.getSize(); l1++)
                            {
                                as3[l1] = listmodel3.getElementAt(l1).toString();
                            }

                            as3[l1++] = "Warning//" + s2 + "//user level warning//Untime Login Request" + " Intruder";
                            as3[l1] = "Action//" + s2 + "//Login Permission Denied";
                            MinWin.message.setListData(as3);
                        }
                    }
                }
            } else
            {
                int k = mw1.myoptionpane("Intruder Detected.Destroy it", "User Level Agent Warning");
                if(k == 0)
                {
                    s3 = "Exit";
                    warningDisplay(s2, s2 + "//User level Exception//Trying to match password");
                    boolean flag1 = false;
                    ListModel listmodel = MinWin.hostname.getModel();
                    String as[] = new String[listmodel.getSize() - 1];
                    for(int l = 0; l < listmodel.getSize(); l++)
                    {
                        if(!listmodel.getElementAt(l).toString().equals(s2))
                        {
                            as[l] = listmodel.getElementAt(l).toString();
                        }
                    }

                    MinWin.hostname.setListData(as);
                    MinWin.hostname1.setListData(as);
                } else
                {
                    s3 = "null";
                }
            }
///////        
}
//////
	}
        catch(Exception exception)
        {
            System.out.println(exception);
        }
        return s3;
    }

    public String getagent(String s)
        throws RemoteException
    {
        String s1 = "";
        File file;
        if(s.equals("user"))
        {
            System.out.println("user level agent move..");
            int i = 0;
            ListModel listmodel = MinWin.warning.getModel();
            String as[] = new String[listmodel.getSize() + 1];
            for(i = 0; i < listmodel.getSize(); i++)
            {
                as[i] = listmodel.getElementAt(i).toString();
            }

            as[i] = "//User level Agent Activated";
            MinWin.status.setListData(as);
            file = new File("user.class");
        } else
        {
            System.out.println("packet level agent move..");
            file = new File("packet.class");
        }
        try
        {
            FileInputStream fileinputstream = new FileInputStream(file);
            boolean flag = false;
            int j;
            while((j = fileinputstream.read()) != -1) 
            {
                String s2 = String.valueOf((char)j);
                s1 = s1 + s2;
            }
        }
        catch(Exception exception) { }
        //System.out.println(s1);
        System.out.println("agent  end..");
        return s1;
    }

    public void addHost(String s)
        throws RemoteException
    {
        try
        {
            int i = 0;
            ListModel listmodel = MinWin.hostname.getModel();
            String as[] = new String[listmodel.getSize() + 1];
            for(i = 0; i < listmodel.getSize(); i++)
            {
                as[i] = listmodel.getElementAt(i).toString();
            }

            as[i] = s;
            MinWin.hostname.setListData(as);
            MinWin.hostname1.setListData(as);
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }

    public String getipaddress()
        throws RemoteException
    {
        String s = "";
        try
        {
            InetAddress inetaddress = InetAddress.getLocalHost();
            s = inetaddress.getHostName();
        }
        catch(Exception exception) { }
        return s;
    }

    public Action LoadAction1()
    {
        System.out.println("in l1");
        return new AbstractAction("waiting") {

            public void actionPerformed(ActionEvent actionevent)
            {
                t1.stop();
                System.out.println("left l1");
                MyServerImpl.temp1 = Boolean.FALSE;
            }

        };
    }

    public Action LoadAction2()
    {
        System.out.println("l2");
        return new AbstractAction("waiting") {

            public void actionPerformed(ActionEvent actionevent)
            {
                t2.stop();
                System.out.println("left l2");
                MyServerImpl.temp2 = Boolean.FALSE;
            }

        };
    }

    public Action LoadAction3()
    {
        System.out.println("l3");
        return new AbstractAction("waiting") {

            public void actionPerformed(ActionEvent actionevent)
            {
                t3.stop();
                System.out.println("left l3");
                MyServerImpl.temp3 = Boolean.FALSE;
            }

        };
    }

    public void actionPerformed(ActionEvent actionevent)
    {
    }

    public String getConnect(String s, String s1)
        throws RemoteException
    {
        String s2 = "";
        try
        {
            int i = 0;
            ListModel listmodel = MinWin.status.getModel();
            String as[] = new String[listmodel.getSize() + 2];
            for(i = 0; i < listmodel.getSize(); i++)
            {
                as[i] = listmodel.getElementAt(i).toString();
            }

            as[i++] = "User level Agent Activated";
            as[i] = "User level Agent Started";
            MinWin.status.setListData(as);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection connection = DriverManager.getConnection("jdbc:odbc:networktraffic");
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("select * from detail where username='" + s + "' and password='" + s1 + "'");
            if(resultset.next())
            {
                s2 = s2 + resultset.getString(3) + "," + resultset.getString(4) + "," + resultset.getString(5) + "," + resultset.getString(6) + "," + resultset.getString(7);
            } else
            {
                s2 = "null";
            }
            System.out.println(s2);
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
        return s2;
    }

    public String getConnection(String s, String s1, String s2)
        throws RemoteException
    {
        System.out.println("temp1 :=" + temp1.toString());
        System.out.println("temp2 :=" + temp2.toString());
        System.out.println("temp3 :=" + temp3.toString());
        if(temp1 == Boolean.FALSE)
        {
            System.out.println("in temp1");
            temp1 = Boolean.TRUE;
            t1 = new Timer(19999, LoadAction1());
            t1.start();
            String s3 = getConnect(s, s1);
            return s3;
        }
        if(temp2 == Boolean.FALSE)
        {
            System.out.println("in temp2");
            temp2 = Boolean.TRUE;
            t2 = new Timer(19999, LoadAction2());
            t2.start();
            String s4 = getConnect(s, s1);
            return s4;
        }
        if(temp3 == Boolean.FALSE)
        {
            System.out.println("in temp3");
            temp3 = Boolean.TRUE;
            t3 = new Timer(19999, LoadAction3());
            t3.start();
            String s5 = getConnect(s, s1);
            return s5;
        }
        int i = 0;
        ListModel listmodel = MinWin.warning.getModel();
        String as[] = new String[listmodel.getSize() + 1];
        for(i = 0; i < listmodel.getSize(); i++)
        {
            as[i] = listmodel.getElementAt(i).toString();
        }

        as[i] = s2 + "//user level warning//Resource busy";
        MinWin.warning.setListData(as);
        ListModel listmodel1 = MinWin.action.getModel();
        String as1[] = new String[listmodel1.getSize() + 1];
        for(i = 0; i < listmodel1.getSize(); i++)
        {
            as1[i] = listmodel1.getElementAt(i).toString();
        }

        as1[i] = s2 + "//Resource Request Denied";
        MinWin.action.setListData(as1);
        ListModel listmodel2 = MinWin.message.getModel();
        String as2[] = new String[listmodel2.getSize() + 2];
        for(i = 0; i < listmodel2.getSize(); i++)
        {
            as2[i] = listmodel2.getElementAt(i).toString();
        }

        as2[i++] = "Warning//" + s2 + "//user level warning//Resource busy" + " Intruder";
        as2[i] = "Action//" + s2 + "//Resource Request Denied";
        MinWin.message.setListData(as2);
        return "wait";
    }

    public void warningDisplay(String s, String s1)
        throws RemoteException
    {
        try
        {
            int i = 0;
            ListModel listmodel = MinWin.warning.getModel();
            String as[] = new String[listmodel.getSize() + 1];
            for(i = 0; i < listmodel.getSize(); i++)
            {
                as[i] = listmodel.getElementAt(i).toString();
            }

            as[i] = s1;
            MinWin.warning.setListData(as);
            ListModel listmodel1 = MinWin.action.getModel();
            String as1[] = new String[listmodel1.getSize() + 1];
            for(i = 0; i < listmodel1.getSize(); i++)
            {
                as1[i] = listmodel1.getElementAt(i).toString();
            }

            as1[i] = s + "//killed Process";
            MinWin.action.setListData(as1);
            ListModel listmodel2 = MinWin.message.getModel();
            String as2[] = new String[listmodel2.getSize() + 2];
            for(i = 0; i < listmodel2.getSize(); i++)
            {
                as2[i] = listmodel2.getElementAt(i).toString();
            }

            as2[i++] = "Warning//" + s1 + "Intruder";
            as2[i] = "Action//" + s + "//killed Process";
            MinWin.message.setListData(as2);
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }

    public void delHost(String s)
        throws RemoteException
    {
        try
        {
            MinWin.filesel = "";
            boolean flag = false;
            ListModel listmodel = MinWin.hostname.getModel();
            String as[] = new String[listmodel.getSize() + 1];
            for(int i = 0; i < listmodel.getSize(); i++)
            {
                as[i] = listmodel.getElementAt(i).toString();
                if(as[i].equals(s))
                {
                    for(int j = i; j < listmodel.getSize(); j++)
                    {
                        as[j] = as[j + 1];
                    }

                    as[listmodel.getSize() - 1] = "";
                }
            }

            MinWin.hostname.setListData(as);
            MinWin.hostname1.setListData(as);
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }

    static 
    {
        temp1 = Boolean.FALSE;
        temp2 = Boolean.FALSE;
        temp3 = Boolean.FALSE;
    }
}

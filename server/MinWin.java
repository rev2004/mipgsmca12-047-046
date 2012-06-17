import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.rmi.Naming;
import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.*;

class MinWin extends JFrame implements MouseListener, ActionListener{

    static JList hostname;
    static JList status;
    static JList action;
    static JList warning;
    static JList message;
    static JList agent;
    static JList message1;
    static JList agentfunc;
    static JList hostname1;
    static String filesel = "";
    static String filesel1 = "";
    static String un;
    static String unpa;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JLabel agfun;
    JLabel l9;
    JLabel l10;
    JLabel l11;
    JLabel l12;
	JLabel l20;
	JLabel l21;
	JLabel l22;
	
    static JButton b1;
    static JButton date;
    static JButton time;
    static JButton b4;
    static JButton b5;
    static JButton b6;
    static JButton b7;
    JMenuBar mbar;
    JMenu file;
    JMenuItem filenew;
    JMenuItem fileKDD;
    JMenuItem fileexit;
    JMenuItem fileagent;
    JMenuItem fileback;
    JScrollPane scrollPane;
    JScrollPane scrollPane1;
    JScrollPane scrollPane2;
    JScrollPane scrollPane3;
    JScrollPane scrollPane4;
    JScrollPane scrollPane5;
    JScrollPane scrollPane6;
    JScrollPane scrollPane7;
    JScrollPane scrollPane8;
    JPanel jp =null;
    JOptionPane op;
    String totalmem;
    String freemem;
    String threadcount;
    String activename;
    String osname;
    String osarch;
    String username;

     JButton butCancel;
     JButton butOk;
     JLabel jLabel10;
     JLabel jLabel11;
     JLabel jLabel12;
     JLabel jLabel13;
     JLabel jLabel7;
     JLabel jLabel8;
     JLabel jLabel9;
     JPanel jPanel3;
	 JPanel jPane20;
	 JPanel jPane21;
	 JPanel jPane22;
     JPanel jpNewUser;
     JTextField txtAdd;
     JTextField txtAge;
     JTextField txtGender;
     JTextField txtName;
     JTextField txtPh;
     JTextField txtUser;
     static AdminDial aa = null;

    public MinWin() throws FileNotFoundException   {
        totalmem = "";
        freemem = "";
        threadcount = "";
        activename = "";
        osname = "";
        osarch = "";
        username = "";
        op = new JOptionPane();
        un = un;
        unpa = unpa;
		jp=new JPanel();
		jp.setLayout(null);
		jp.setBackground(new Color(150,120,200));
	    aa = new AdminDial();
        getContentPane().setLayout(null);
        l7 = new JLabel(new ImageIcon("login1.gif"));
        l7.setBounds(0, 0, 800, 1000);
        getContentPane().add(l7);
        l7.setVisible(true);
        l1 = new JLabel("Online Intrusion Alert Aggregation with Generative Data Stream Modeling");
        l1.setBounds(20, 10, 800, 30);
        l1.setFont(new Font("Arial", 1, 20));
        l1.setForeground(new Color(255,255,255));
        l7.add(l1);
		
		l22 = new JLabel(" ");
        l22.setBounds(140, 30, 600, 40);
        l22.setFont(new Font("alpha", 2, 22));
        l22.setForeground(new Color(0,0,255));
        //l7.add(l22);
	
	
        l2 = new JLabel("Sensor Layer:");
        l2.setBounds(40, 40, 100, 25);
        l2.setForeground(new Color(155,244,244));
        l7.add(l2);
        l3 = new JLabel("Detection Layer:");
        l3.setBounds(40, 150, 100, 25);
        l3.setForeground(new Color(155,244,244));
        l7.add(l3);
        l4 = new JLabel("Alert Processing Layer:");
        l4.setBounds(40, 245, 300, 25);
        l4.setForeground(new Color(155,244,244));
        l7.add(l4);
        l5 = new JLabel("Reaction Layer:");
        l5.setBounds(40, 335, 100, 25);
        l5.setForeground(new Color(155,244,244));
        l7.add(l5);
        l6 = new JLabel("Reports: ");
        l6.setBounds(40, 430, 100, 25);
        l6.setForeground(new Color(155,244,244));
        l7.add(l6);
        time = new JButton();
        time.setBounds(700, 530, 95, 23);
        getContentPane().add(time);
        date = new JButton();
        date.setBounds(600, 530, 100, 23);
        getContentPane().add(date);
        b1 = new JButton();
        b1.setBounds(3, 530, 600, 23);
        getContentPane().add(b1);
        //Time time1 = new Time();
        b4 = new JButton("clear");
        b4.setBounds(650, 190, 75, 25);
		b4.setBackground(new Color(0,0,0));
		b4.setForeground(new Color(170,200,255));
        l7.add(b4);
        b4.addActionListener(this);
        b5 = new JButton("clear");
        b5.setBounds(650, 280, 75, 25);
		b5.setBackground(new Color(0,0,0));
		b5.setForeground(new Color(170,200,255));
        l7.add(b5);
        b5.addActionListener(this);
        b6 = new JButton("clear");
        b6.setBounds(650, 375, 75, 25);
		b6.setBackground(new Color(0,0,0));
		b6.setForeground(new Color(170,200,255));
        l7.add(b6);
        b6.addActionListener(this);
        b7 = new JButton("Store");
        b7.setBounds(650, 470, 75, 25);
		b7.setBackground(new Color(0,0,0));
		b7.setForeground(new Color(170,200,255));
        l7.add(b7);
        b7.addActionListener(this);
        hostname = new JList();
        scrollPane = new JScrollPane(hostname);
        scrollPane.setBounds(40, 70, 600, 70);
        l7.add(scrollPane);
        hostname.addMouseListener(this);
        status = new JList();
        scrollPane2 = new JScrollPane(status);
        scrollPane2.setBounds(40, 170, 600, 70);
        l7.add(scrollPane2);
        action = new JList();
        scrollPane1 = new JScrollPane(action);
        scrollPane1.setBounds(40, 265, 600, 70);
        l7.add(scrollPane1);
        warning = new JList();
        scrollPane3 = new JScrollPane(warning);
        scrollPane3.setBounds(40, 355, 600, 70);
        l7.add(scrollPane3);
        message = new JList();
        scrollPane4 = new JScrollPane(message);
        scrollPane4.setBounds(40, 450, 600, 70);
        l7.add(scrollPane4);
        mbar = new JMenuBar();
        setJMenuBar(mbar);
        file = new JMenu("File");
        filenew = new JMenuItem("NewUser");
	fileKDD = new JMenuItem("DARPA Dataset");
        fileagent = new JMenuItem("Agent");
        fileback = new JMenuItem("Back");
        fileexit = new JMenuItem("Exit");
        file.add(filenew);
	file.add(fileKDD);
        file.add(fileagent);
        file.add(fileback);
        file.add(fileexit);
        mbar.add(file);
        fileexit.addActionListener(this);
        filenew.addActionListener(this);
	fileKDD.addActionListener(this);
        fileagent.addActionListener(this);
        fileback.addActionListener(this);
        agfun = new JLabel(new ImageIcon("login1.gif"));
        agfun.setBounds(0, 0, 800, 530);
        getContentPane().add(agfun);
        agfun.setVisible(false);
        
		l8 = new JLabel("Online Intrusion Alert Aggregation with Generative Data Stream Modeling");
        l8.setBounds(20, 10, 850, 30);
        l8.setFont(new Font("Arial", 1, 20));
        l8.setForeground(new Color(255,255,255));
        agfun.add(l8);
		
		l20 = new JLabel("");
        l20.setBounds(100, 20, 600, 40);
        l20.setFont(new Font("alpha", 2, 25));
        l20.setForeground(new Color(0,0,255));
        //agfun.add(l20);
		
        hostname1 = new JList();
        scrollPane8 = new JScrollPane(hostname1);
        scrollPane8.setBounds(40, 70, 300, 120);
        agfun.add(scrollPane8);
        hostname.addMouseListener(this);
        String as[] = {
            "User Level Agent", "Packet Level Agent"
        };

        agent = new JList(as);
        scrollPane5 = new JScrollPane(agent);
        scrollPane5.setBounds(40, 230, 300, 120);
        agfun.add(scrollPane5);
        agent.setSelectedIndex(0);
        agent.addMouseListener(this);

        agentfunc = new JList();
        scrollPane6 = new JScrollPane(agentfunc);
        scrollPane6.setBounds(40, 400, 300, 120);
        agfun.add(scrollPane6);

        agentfunc.addMouseListener(this);
        message1 = new JList();
        scrollPane7 = new JScrollPane(message1);
        scrollPane7.setBounds(450, 70, 300, 450);
        agfun.add(scrollPane7);
        message1.addMouseListener(this);

        l9 = new JLabel("Probe Layer:");
        l9.setBounds(40, 40, 100, 25);
        l9.setForeground(new Color(155,244,244));
        agfun.add(l9);
        l10 = new JLabel("Agents :");
        l10.setBounds(40, 200, 100, 25);
        l10.setForeground(new Color(155,244,244));
        agfun.add(l10);
        l11 = new JLabel("R2L Layer:");
        l11.setBounds(40, 360, 100, 25);
        l11.setForeground(new Color(155,244,244));
        agfun.add(l11);
        l12 = new JLabel("Message From U2R Layer:");
        l12.setBounds(450, 40, 180, 25);
        l12.setForeground(new Color(155,244,244));
        agfun.add(l12);

        getContentPane().add(jp);
        jp.setBounds(0, 0, 800, 530);

// *************************************************************

        jpNewUser = new JPanel();
        jLabel7 = new JLabel();
        jPanel3 = new JPanel();
        jLabel8 = new JLabel();
        txtName = new JTextField();
        jLabel9 = new JLabel();
        txtAge = new JTextField();
        jLabel10 = new JLabel();
        txtGender = new JTextField();
        jLabel11 = new JLabel();
        txtAdd = new JTextField();
        jLabel12 = new JLabel();
        txtPh = new JTextField();
        jLabel13 = new JLabel();
        txtUser = new JTextField();
        butOk = new JButton();
        butCancel = new JButton();

//*****************************************************************

     jpNewUser.setLayout(null);

        jpNewUser.setBackground(new java.awt.Color(150,120,200));
        jpNewUser.setPreferredSize(new java.awt.Dimension(900, 580));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 20));
        jLabel7.setForeground(new java.awt.Color(255,255,255));
        jLabel7.setText("Online Intrusion Alert Aggregation with Generative Data Stream Modeling");
        jpNewUser.add(jLabel7);
        jLabel7.setBounds(20, 20, 70, 30);
		
		

        jPanel3.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(20, 10, 30));
        jPanel3.setBorder(new EtchedBorder());
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Name:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 20, 70, 30);

        jPanel3.add(txtName);
        txtName.setBounds(150, 20, 110, 21);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Age:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 60, 70, 30);

        jPanel3.add(txtAge);
        txtAge.setBounds(150, 60, 110, 21);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Gender:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 100, 70, 30);

        jPanel3.add(txtGender);
        txtGender.setBounds(150, 100, 110, 21);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Address:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 140, 70, 30);

        jPanel3.add(txtAdd);
        txtAdd.setBounds(150, 140, 110, 21);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Phone No:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 180, 80, 30);

        jPanel3.add(txtPh);
        txtPh.setBounds(150, 180, 110, 21);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("User Character:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(20, 220, 120, 30);

        jPanel3.add(txtUser);
        txtUser.setBounds(150, 220, 110, 21);

        butOk.setBackground(new java.awt.Color(153, 0, 0));
        butOk.setFont(new java.awt.Font("Arial", 1, 13));
        butOk.setForeground(new java.awt.Color(255, 255, 204));
        butOk.setText("OK");
        butOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOkActionPerformed(evt);
            }
        });

        jPanel3.add(butOk);
        butOk.setBounds(50, 300, 90, 25);

        butCancel.setBackground(new java.awt.Color(153, 0, 0));
        butCancel.setFont(new java.awt.Font("Arial", 1, 13));
        butCancel.setForeground(new java.awt.Color(255, 255, 204));
        butCancel.setText("Cancel");
        butCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelActionPerformed(evt);
            }
        });

        jPanel3.add(butCancel);
        butCancel.setBounds(170, 300, 80, 25);

        jpNewUser.add(jPanel3);
        jPanel3.setBounds(210, 110, 320, 370);

        getContentPane().add(jpNewUser);
        jpNewUser.setBounds(0, 0, 800, 580);
        jpNewUser.setVisible(false);




//***********************************************************

    }

    public String getTheString(File file1)
    {
        String s = "";
        try
        {
            FileInputStream fileinputstream = new FileInputStream(file1);
            boolean flag = false;
            int i;
            while((i = fileinputstream.read()) != -1) 
            {
                String s1 = String.valueOf((char)i);
                s = s + s1;
            }
        }
        catch(Exception exception) { }
        return s;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
         if(actionevent.getSource() == fileKDD)
        {
        try	
	{
	FileDialog fd = new FileDialog(new Frame(), "Please choose a file:", FileDialog.LOAD);
	fd.show();
	if (fd.getFile() != null) {
	File f = new File(fd.getDirectory(), fd.getFile());	
	String path=f.getPath();	

	FileInputStream fstream =new FileInputStream(path);
	DataInputStream in =new DataInputStream(fstream);
	BufferedReader br=new BufferedReader(new InputStreamReader(in));
	String strline;
	String[] temp;
	strline=br.readLine();
	temp =strline.split(",");
System.out.println(temp[0] +" "+temp[1] +" "+temp[2] +" "+temp[3] +" "+temp[4]);

  if((Integer.parseInt(temp[0])>0) || (temp[1].compareTo("tcp")==1) || (temp[2].compareTo("private")==0) || ((temp[3].compareTo("REJ")==0) || (temp[3].compareTo("RSTR")==0)) || (Integer.parseInt(temp[4]) == 0))
    {
	//l2.setText("This is a probe attack");
	   System.out.println("probe");
	System.out.println(temp[0] +" "+temp[1] +" "+temp[2] +" "+temp[3] +" "+temp[4]);
           JOptionPane.showMessageDialog(null,"This is a probe attack");
	
    }
   else if((Integer.parseInt(temp[22]) >63) || (Float.parseFloat(temp[33])>0.04) || (Float.parseFloat(temp[37])>0.03) || (Integer.parseInt(temp[38])>0))
    {
            JOptionPane.showMessageDialog(null,"This is a DOS attack");
    }
     else if((Integer.parseInt(temp[9])>0) || (Integer.parseInt(temp[10]) < 0) || (Integer.parseInt(temp[12])<0) || (Integer.parseInt(temp[16])< 0) || (Integer.parseInt(temp[17])>0))
    {
          JOptionPane.showMessageDialog(null,"This is a R2L attack");
    } 
     else if ((Integer.parseInt(temp[12])>0) || (Integer.parseInt(temp[13])>0) || (Integer.parseInt(temp[15])>0) || (Integer.parseInt(temp[16])>0) || (Integer.parseInt(temp[18])>0) || (Integer.parseInt(temp[21])> 0))
    {
    JOptionPane.showMessageDialog(null,"This is a U2R attack");
    }



	}
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}	
	}
	if(actionevent.getSource() == fileagent)
        {
            agfun.setVisible(true);
            l7.setVisible(false);
        }
        if(actionevent.getSource() == fileexit)
        {
            System.exit(0);
        }
        if(actionevent.getSource() == fileback)
        {
            l7.setVisible(true);
            agfun.setVisible(false);
        }
////////////////////////
 if(actionevent.getSource() == filenew)
        {
System.out.println("filenew");

//jpNewUser.setVisible(true);
//agfun.setVisible(false);
//jp.setVisible(false);


NewUser uu= new NewUser();

uu.setSize(800,580);
uu.show();
uu.setTitle(" New User ");

       }
   
//////////////////////////
        if(actionevent.getSource() == b4)
        {
            String as[] = {
                ""
            };
            status.setListData(as);
        }
        if(actionevent.getSource() == b5)
        {
            String as1[] = {
                ""
            };
            warning.setListData(as1);
        }
        if(actionevent.getSource() == b6)
        {
            String as2[] = {
                ""
            };
            action.setListData(as2);
        }
        if(actionevent.getSource() == b7)
        {
            try
            {
                File file1 = new File("LOG.doc");
                FileOutputStream fileoutputstream = new FileOutputStream(file1);
                ListModel listmodel = message.getModel();
                String as3[] = new String[listmodel.getSize()];
                for(int i = 0; i < listmodel.getSize(); i++)
                {
                    as3[i] = listmodel.getElementAt(i).toString();
                    byte abyte0[] = (as3[i] + "\n").getBytes();
                    fileoutputstream.write(abyte0, (int)file1.length(), as3[i].length());
                }

                String as4[] = {
                    ""
                };
                message.setListData(as4);
            }
            catch(Exception exception)
            {
                System.out.println(exception);
            }
        }
    }

     void butOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butOkActionPerformed

     void butCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butCancelActionPerformed


    public void mouseClicked(MouseEvent mouseevent)
    {
        if(mouseevent.getSource() == hostname1 && mouseevent.getClickCount() == 1)
        {
            filesel = hostname1.getSelectedValue().toString();
        }
        if(mouseevent.getSource() == agentfunc)
        {
            try
            {
                if(mouseevent.getClickCount() == 1 && agentfunc.getSelectedValue().equals("Kill"))
                {
                    try
                    {
String aa[] = {"It is used to terminate the process .","Then it will send the report to the server"};
	message1.setListData(aa);
                //        System.out.println("localhost/MyServerImpl1");
                    //    MyInterface1 myinterface1 = (MyInterface1)Naming.lookup("localhost/MyServerImpl1");
                       // System.out.println(myinterface1);
                   //     myinterface1.alpha();
                    }
                    catch(Exception exception)
                    {
                        System.out.println(exception);
                    }




                }



//////////////////

if(mouseevent.getClickCount() == 1 && agentfunc.getSelectedValue().equals("Alert"))
                {
                    try
                    {
String aa[] = {"ghsdgfhgsdjgfsdghfgdshgfhsdgfsdfhi","hello"};
	message1.setListData(aa);
                //        System.out.println("localhost/MyServerImpl1");
                    //    MyInterface1 myinterface1 = (MyInterface1)Naming.lookup("localhost/MyServerImpl1");
                       // System.out.println(myinterface1);
                   //     myinterface1.alpha();
                    }
                    catch(Exception exception)
                    {
                        System.out.println(exception);
                    }

                }

//////////////////
            }

            catch(Exception exception1)
            {
                System.out.println(exception1);
            }
        }
        if(mouseevent.getSource() == agent)
        {
            message.clearSelection();
            if(agent.getSelectedValue().equals("User Level Agent"))
            {
                String as[] = {
                    ""
                };
                message1.setListData(as);
                String as1[] = {
                    "Kill", "Alert"
                };
                agentfunc.setListData(as1);
            }

         if(mouseevent.getSource()==agentfunc)
{
System.out.println("ffgdfgdfgdfggffdggggg");

	 if(agentfunc.getSelectedValue().equals("Kill")){

	String aa[] = {"hi","hello"};
	message.setListData(aa);
	}
	}
        }
    }

    public void mousePressed(MouseEvent mouseevent)   {    }

    public void mouseReleased(MouseEvent mouseevent)   {    }

    public void mouseExited(MouseEvent mouseevent)    {    }

    public void mouseEntered(MouseEvent mouseevent)    {    }

    public int myoptionpane(String s, String s1)    {

        getContentPane().add(op);
        MinWin _tmp = this;
        int i = JOptionPane.showConfirmDialog(this, s, s1, 2, 2);
        return i;
    }
    public static void showDialog(){
	
	aa.setSize(350,350);
	aa.setVisible(true);
	aa.show();
    }
}
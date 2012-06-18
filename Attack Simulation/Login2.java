import java.net.*;
import java.rmi.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class Login2 extends JPanel implements ActionListener {

String comhost="localhost";


  JPanel jPanel1 = new JPanel();
  JPanel jPanel2 = new JPanel();
  JPanel jPanel3 = new JPanel();
  JButton jButton1 = new JButton();
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JPanel jPanel4 = new JPanel();
  JPanel jPanel5 = new JPanel();
  JLabel jLabel4 = new JLabel();
  JCheckBox jcbPortScan = new JCheckBox();
  JPanel jPanel6 = new JPanel();
  JPanel jPanel7 = new JPanel();
  JCheckBox jcbSniff = new JCheckBox();
  JCheckBox jcbDOS = new JCheckBox();
  JCheckBox jcbOver = new JCheckBox();
  JCheckBox jcbResEx = new JCheckBox();
  JCheckBox jcbPass = new JCheckBox();
  JCheckBox jcbVirus = new JCheckBox();
  JCheckBox jcbWorm = new JCheckBox();
  JCheckBox jcbTroj = new JCheckBox();

  public Login2() {
    this.setLayout(null);
    jPanel1.setBorder(BorderFactory.createEtchedBorder());
    jPanel1.setBounds(new Rectangle(18, 13, 508, 421));
    jPanel1.setLayout(null);
    jPanel2.setBackground(SystemColor.info);
    jPanel2.setBorder(BorderFactory.createEtchedBorder());
    jPanel2.setBounds(new Rectangle(25, 23, 220, 373));
    jPanel2.setLayout(null);
    jPanel3.setBackground(SystemColor.info);
    jPanel3.setBorder(BorderFactory.createEtchedBorder());
    jPanel3.setBounds(new Rectangle(246, 23, 235, 373));
    jPanel3.setLayout(null);
    jButton1.setBackground(new Color(255,204,204));
    jButton1.setBounds(new Rectangle(200, 445, 85, 30));
    jButton1.setForeground(new Color(0,0,255));
    jButton1.setText("ATTACK");
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 17));
    jLabel1.setText("Information Gathering:");
    jLabel1.setBounds(new Rectangle(5, 10, 195, 27));
    jLabel2.setText("Flooding:");
    jLabel2.setBounds(new Rectangle(4, 7, 187, 20));
    jLabel2.setFont(new java.awt.Font("Dialog", 1, 17));
    jLabel3.setBounds(new Rectangle(3, 288, 171, 27));
    jLabel3.setText("Malware:");
    jLabel3.setFont(new java.awt.Font("Dialog", 1, 17));
    jPanel4.setBackground(SystemColor.info);
    jPanel4.setBorder(BorderFactory.createEtchedBorder());
    jPanel4.setBounds(new Rectangle(0, 96, 220, 97));
    jPanel4.setLayout(null);
    jPanel5.setLayout(null);
    jPanel5.setBounds(new Rectangle(0, 191, 220, 95));
    jPanel5.setBackground(SystemColor.info);
    jPanel5.setBorder(BorderFactory.createEtchedBorder());
    jLabel4.setText("Authendication Bypass:");
    jLabel4.setBounds(new Rectangle(5, 7, 209, 20));
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 17));
    jcbPortScan.setBackground(SystemColor.info);
    jcbPortScan.setFont(new java.awt.Font("Dialog", 0, 14));
    jcbPortScan.setForeground(Color.blue);
    jcbPortScan.setText("Port Scanning");
    jcbPortScan.setBounds(new Rectangle(9, 18, 140, 21));
    jPanel6.setLayout(null);
    jPanel6.setBounds(new Rectangle(0, 97, 235, 95));
    jPanel6.setBackground(SystemColor.info);
    jPanel6.setBorder(BorderFactory.createEtchedBorder());
    jPanel7.setLayout(null);
    jPanel7.setBounds(new Rectangle(0, 190, 235, 95));
    jPanel7.setBackground(SystemColor.info);
    jPanel7.setBorder(BorderFactory.createEtchedBorder());
    jcbSniff.setBounds(new Rectangle(9, 53, 140, 21));
    jcbSniff.setText("Sniffing");
    jcbSniff.setBackground(SystemColor.info);
    jcbSniff.setFont(new java.awt.Font("Dialog", 0, 14));
    jcbSniff.setForeground(Color.blue);
    jcbDOS.setBounds(new Rectangle(9, 17, 198, 21));
    jcbDOS.setText("Denial of Services(DOS)");
    jcbDOS.setBackground(SystemColor.info);
    jcbDOS.setFont(new java.awt.Font("Dialog", 0, 14));
    jcbDOS.setForeground(Color.blue);
    jcbOver.setBounds(new Rectangle(9, 51, 140, 21));
    jcbOver.setText("Buffer Overflow");
    jcbOver.setBackground(SystemColor.info);
    jcbOver.setFont(new java.awt.Font("Dialog", 0, 14));
    jcbOver.setForeground(Color.blue);
    jcbResEx.setBounds(new Rectangle(9, 19, 185, 21));
    jcbResEx.setText("Resource Exhaustion");
    jcbResEx.setBackground(SystemColor.info);
    jcbResEx.setFont(new java.awt.Font("Dialog", 0, 14));
    jcbResEx.setForeground(Color.blue);
    jcbPass.setBounds(new Rectangle(9, 52, 140, 21));
    jcbPass.setText("Password Attacks");
    jcbPass.setBackground(SystemColor.info);
    jcbPass.setFont(new java.awt.Font("Dialog", 0, 14));
    jcbPass.setForeground(Color.blue);
    jcbVirus.setBounds(new Rectangle(9, 295, 140, 21));
    jcbVirus.setText("Viruses");
    jcbVirus.setBackground(SystemColor.info);
    jcbVirus.setFont(new java.awt.Font("Dialog", 0, 14));
    jcbVirus.setForeground(Color.blue);
    jcbWorm.setBounds(new Rectangle(9, 318, 140, 21));
    jcbWorm.setText("Worms");
    jcbWorm.setBackground(SystemColor.info);
    jcbWorm.setFont(new java.awt.Font("Dialog", 0, 14));
    jcbWorm.setForeground(Color.blue);
    jcbTroj.setBackground(SystemColor.info);
    jcbTroj.setFont(new java.awt.Font("Dialog", 0, 14));
    jcbTroj.setForeground(Color.blue);
    jcbTroj.setText("Trojan Horses");
    jcbTroj.setBounds(new Rectangle(9, 343, 140, 21));
    this.setBackground(new Color(0, 145, 145));
    this.setForeground(new Color(0, 0, 112));
    this.add(jPanel1, null);
    jPanel1.add(jPanel2, null);
    jPanel2.add(jPanel5, null);
    jPanel5.add(jLabel4, null);
    jPanel2.add(jPanel4, null);
    jPanel4.add(jLabel2, null);
    jPanel2.add(jLabel3, null);
    jPanel2.add(jLabel1, null);
    jPanel1.add(jPanel3, null);
    jPanel3.add(jcbPortScan, null);
    jPanel3.add(jPanel6, null);
    jPanel6.add(jcbDOS, null);
    jPanel6.add(jcbOver, null);
    jPanel3.add(jPanel7, null);
    jPanel7.add(jcbResEx, null);
    jPanel7.add(jcbPass, null);
    jPanel3.add(jcbSniff, null);
    jPanel3.add(jcbVirus, null);
    jPanel3.add(jcbTroj, null);
    jPanel3.add(jcbWorm, null);
    jButton1.addActionListener(this);
    this.add(jButton1, null);
  }
  public void actionPerformed(ActionEvent ae){

////JOptionPane.showConfirmDialog(this,"all","alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);

try{

MyInterface myin=(MyInterface)Naming.lookup("//"+comhost+"/MyServerImpl");
			//myin.addHost(host1);
String response=null;
InetAddress a=InetAddress.getLocalHost();
		String host1=a.getHostAddress();

	if(jcbPortScan.isSelected())
	{
	response=myin.attackTypes(jcbPortScan.getText(),host1,new Date().toString());
	JOptionPane.showConfirmDialog(this,response,"Admin Response alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);

	}
if(jcbSniff.isSelected())
	{
	response=myin.attackTypes(jcbSniff.getText(),host1,new Date().toString());
	JOptionPane.showConfirmDialog(this,response,"Admin Response alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);

	}
if(jcbDOS.isSelected())
	{
	response=myin.attackTypes(jcbDOS.getText(),host1,new Date().toString());
	JOptionPane.showConfirmDialog(this,response,"Admin Response alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);

	}
if(jcbOver.isSelected())
	{
	response=myin.attackTypes(jcbOver.getText(),host1,new Date().toString());
	JOptionPane.showConfirmDialog(this,response,"Admin Response alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);

	}
if(jcbResEx.isSelected())
	{
	response=myin.attackTypes(jcbResEx.getText(),host1,new Date().toString());
	JOptionPane.showConfirmDialog(this,response,"Admin Response alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);

	}

if(jcbPass.isSelected())
	{
	response=myin.attackTypes(jcbPass.getText(),host1,new Date().toString());
	JOptionPane.showConfirmDialog(this,response,"Admin Response alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);

	}	
	

if(jcbVirus.isSelected())
	{
	response=myin.attackTypes(jcbVirus.getText(),host1,new Date().toString());
	JOptionPane.showConfirmDialog(this,response,"Admin Response alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
	}
if(jcbWorm.isSelected())
	{
response=myin.attackTypes(jcbWorm.getText(),host1,new Date().toString());
JOptionPane.showConfirmDialog(this,response,"Admin Response alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);

	}
if(jcbTroj.isSelected())
	{
response=myin.attackTypes(jcbTroj.getText(),host1,new Date().toString());
JOptionPane.showConfirmDialog(this,response,"Admin Response alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);

	}
			
			
	}catch(Exception e){
		System.out.println("Exception:"+e);
	}

  }

}
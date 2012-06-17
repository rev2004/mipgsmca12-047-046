import java.awt.event.*;
import java.awt.*;
import javax.swing.*;



public class AdminDial extends JDialog implements ActionListener {
  JPanel jDiaPane = new JPanel();
  JScrollPane jspResponse = new JScrollPane();
  JList jlistResponse = new JList();
  JButton jbutOK = new JButton();
  JLabel jLabel1 = new JLabel();
  String aa[]={"Filter Port","Block Port","Block IP","Kill","Isolate","Reload","Reroute","Shutdown","Patch","Format","Manual"};

  public AdminDial() {
  
    jDiaPane.setLayout(null);
    jspResponse.setBounds(new Rectangle(68, 69, 228, 174));
    jbutOK.setBounds(new Rectangle(139, 255, 96, 24));
    jbutOK.setText("Response");
    jLabel1.setFont(new java.awt.Font("Dialog", 0, 18));
    jLabel1.setText("Chose Response Mechanism");
    jLabel1.setBounds(new Rectangle(62, 30, 240, 22));
    getContentPane().add(jDiaPane);
    jDiaPane.add(jspResponse, null);
    jDiaPane.add(jbutOK, null);
    jDiaPane.add(jLabel1, null);
    jspResponse.getViewport().add(jlistResponse, null);
    jlistResponse.setListData(aa);

jbutOK.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButClear_actionPerformed(e);
      }
    });

  }
public void actionPerformed(ActionEvent e){}

void jButClear_actionPerformed(ActionEvent e) {

String sss=(String) jlistResponse.getSelectedValue();

 
	if(sss.equals("Manual"))
	{
emserver.msg="Intruder Detected";
JOptionPane.showConfirmDialog(this,"Notification send to Admin Mobile","alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);	
	}
	dispose();

  }

}
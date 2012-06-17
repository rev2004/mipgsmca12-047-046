
import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.sql.*;
import java.lang.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.Action;
import javax.swing.AbstractAction;
import java.util.Vector;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.filechooser.FileSystemView;
import java.util.*;
import java.util.Date;
import java.util.Vector;
import java.io.FileOutputStream;
import java.io.BufferedReader;

public class packet
{
MinWin mw1=null;
public void warningDisplay(String host,String warn) throws RemoteException
	{
		try
		{
			int x=0;
			ListModel lm1=MinWin.warning.getModel();
			String d1[]=new String[lm1.getSize()+1];
			for(x=0;x<lm1.getSize();x++)
			{
				d1[x]=lm1.getElementAt(x).toString();
			}
			d1[x]=warn;
			MinWin.warning.setListData(d1);

			ListModel lm2=MinWin.action.getModel();
			String d2[]=new String[lm2.getSize()+1];
			for(x=0;x<lm2.getSize();x++)
			{
				d2[x]=lm2.getElementAt(x).toString();
			}
			d2[x]=host+"//killed Process";
			MinWin.action.setListData(d2);

			ListModel lm3=MinWin.message.getModel();
			String d3[]=new String[lm3.getSize()+2];
			for(x=0;x<lm3.getSize();x++)
			{
				d3[x]=lm3.getElementAt(x).toString();
			}
			d3[x++]="Warning//"+warn+("Intruder");
			d3[x]="Action//"+host+"//killed Process";	
			MinWin.message.setListData(d3);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


	public int sendPacket(Vector v,int nop,String file,int packsize)throws RemoteException
	{
		int flag=9;
		int j=0;
		boolean packs[]=new boolean[nop+1];
		String message="";
	if(packsize>100)
	{
	flag=4;
	}
	else
	{
		for(int i=1;i<=nop;i++)
		{
			packs[i]=false;
		}
		for(int i=0;i<nop;i++)
		{
			try
			{
				int packno=((Integer)v.elementAt(j)).intValue();
				j++;
				int hash=((Integer)v.elementAt(j)).intValue();
				j++;
				String mes=(String)v.elementAt(j);
				j++;
				int hash1=mes.hashCode();

				if(packs[packno]==true)
				{
					warningDisplay("System10","Packet Level Error/packet "+packno+" duplicated"); 
					flag=mw1.myoptionpane("Packets duplicated.\nIntruder Detected.\nDestroy it","Packet Level Agent Warning");
					if(hash!=hash1)
					{
						warningDisplay("System10","Packet Level Error/packet "+packno+" modified"); 
						flag=mw1.myoptionpane("Packets modified.\nIntruder Detected.\nDestroy it","Packet Level Agent Warning");
					}
					break;
				}
				else
				{
					packs[packno]=true;
					if(hash!=hash1)
					{
						warningDisplay("System10","Packet Level Error/packet "+packno+" modified"); 
						flag=mw1.myoptionpane("Packets modified.\nIntruder Detected.\nDestroy it","Packet Level Agent Warning");
						break;
					}
					message=message+mes;
				}
				System.out.println(mes);
			}
			catch(Exception e)
			{
			}
			
		}		
		for(int i=1;i<=nop;i++)
		{
			if(packs[i]==false)
			{
				warningDisplay("System10","Packet Level Error/packet "+i+" Lost"); 
				flag=mw1.myoptionpane("Packets Lost.\nIntruder Detected.\nDestroy it","Packet Level Agent Warning");
				break;
			}
		}
		if(flag!=0)
		{
			try
			{
				FileOutputStream fos=new FileOutputStream(file);
				BufferedReader br=new BufferedReader(new StringReader(message));
				int k;
		            while((k=br.read())!=-1)
				{
					fos.write((char)k);
				}
				fos.close();
				br.close();
			}
			catch(Exception ee)
			{
			}
		}}

		return flag;	
	}

} 
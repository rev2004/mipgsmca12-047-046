import java.rmi.*;
import java.util.Vector;

public interface MyInterface extends Remote
{
	public String getipaddress() throws RemoteException;
	public String getConnection(String username,String password,String host) throws RemoteException;
	public String getConnect(String username,String password) throws RemoteException;
	public String getConnect(String username,String password,int date,int day,String host,String os) throws RemoteException;
	public void warningDisplay(String host,String warn) throws RemoteException;
	public void addHost(String host)throws RemoteException;
	public void delHost(String host)throws RemoteException; 
	public int sendPacket(Vector v,int nop,String file,int nop1,int size)throws RemoteException;
	public String getagent(String agent)throws RemoteException;
	public String getpro(String proid)throws RemoteException;
	public String attackTypes(String type,String ip,String date)throws RemoteException;
	

        
}


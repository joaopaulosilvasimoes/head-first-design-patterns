package _11_proxy.java_implementation;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    
    public String sayHello() throws RemoteException;
 
}

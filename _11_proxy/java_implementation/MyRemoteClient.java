package _11_proxy.java_implementation;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {

    public void go(){

        try {
 
            MyRemote myRemoteServer = (MyRemote) Naming.lookup("rmi://127.0.0.1/MyRemoteServer");
 
            String messageFromServer = myRemoteServer.sayHello();

            System.out.println(messageFromServer);

        } catch (MalformedURLException | RemoteException | NotBoundException exception) {
 
            exception.printStackTrace();
        }

    }
    
}

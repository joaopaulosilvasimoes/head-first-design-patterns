package _11_proxy.java_implementation;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteServer extends UnicastRemoteObject implements MyRemote {

    public MyRemoteServer() throws RemoteException {

    }

    @Override
    public String sayHello() throws RemoteException {

        return "Server says, 'Hey!!!'";

    }

    public static void main(String[] args) {

        try {

            MyRemote myRemote = new MyRemoteServer();

            Naming.rebind("MyRemoteServer", myRemote);

        }
        catch (Exception exception) {

            exception.printStackTrace();

        }

    }
    
}

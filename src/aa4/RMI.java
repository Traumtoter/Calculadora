/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa4;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
/**
 *
 * @author legion
 */
public class RMI extends UnicastRemoteObject implements Claculadora{
    public RMI ()throws RemoteException{super( );
        int a, b;
    }
    public String notifyme (String message){
        String returnMessage = "Call back received: " + message;
        System.out.println(returnMessage);
        return returnMessage;
    }
    public int sum(int a, int b) throws RemoteException{
        return a + b;
    }
    public int res(int a, int b) throws RemoteException{
        return a - b;
    }
    public int mul(int a, int b) throws RemoteException{
        return a * b;
    }
    public int div(int a, int b) throws RemoteException{
        if (b==0) 
        {
            return 0;
            
        }
        return a / b;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa4;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author legion
 */
public class Cliente {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        try{
            Registry miRegistro = LocateRegistry.getRegistry("localhost", 1099);
            Claculadora c = (Claculadora)Naming.lookup("//localhost/Claculadora");
            
            while (true){
               String menu = JOptionPane.showInputDialog("Calculadora de Prueba RMI\n"
                       + "Suma...[1]\n"
                       + "Resta..[2]\n"
                       + "Multiplicacion...[3]\n"
                       + "Division...[4]\n"
                       + "Cancelar para salir");
               switch(menu){
                   case "1":{
                       int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                       int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                                JOptionPane.showMessageDialog(null,"La suma es: " +c.sum(x, y));
                                break;
                                
                   }
                   case "2":{
                         int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                         int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                                JOptionPane.showMessageDialog(null,"La resta es: " +c.res(x, y));
                                break;
                   }
                   case "3":{
                         int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                         int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                                JOptionPane.showMessageDialog(null,"La Multiplicacion es: " +c.mul(x, y));
                                break;
                   }
                   case "4":{
                         int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                         int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                                JOptionPane.showMessageDialog(null,"La Division es: " +c.div(x, y));
                                break;
                   }
               }
               
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "servidor no conectado");
        }
    }
}

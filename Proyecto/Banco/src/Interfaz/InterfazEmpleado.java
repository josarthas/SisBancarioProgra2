package Interfaz;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import sistemabancario.Cliente;


public class InterfazEmpleado extends JFrame {
   
    
    public InterfazEmpleado(){

        ArrayList<Cliente> datosClien = new ArrayList<Cliente>();
        JFrame cuadroClien = new JFrame("Banco Central - Empleado");
        cuadroClien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadroClien.setSize(480, 360);
        
        JButton nuevoCliente= new JButton("Añadir Cliente");

        JPanel panel1 = new JPanel();
        JTextField campoUser = new JTextField(10);
        panel1.add(nuevoCliente);

        nuevoCliente.addActionListener((ActionEvent e) -> {
            String ID = JOptionPane.showInputDialog ("Introduzca un número de cliente");
            String nom;
            nom = JOptionPane.showInputDialog ("Introduzca nombre de cliente");
            String dir = JOptionPane.showInputDialog ("Introduzca Direccion");
            String rfcc = JOptionPane.showInputDialog ("Introduzca RFC");
            String corr = JOptionPane.showInputDialog ("Introduzca eMail");
            String num = JOptionPane.showInputDialog ("Introduzca un número telefonico");
            String pssswd = JOptionPane.showInputDialog ("Introduzca una contraseña");
            datosClien.add(new Cliente(ID,nom,dir,rfcc,corr,num,pssswd));
        });
        
        cuadroClien.getContentPane().add(BorderLayout.NORTH, panel1);
        cuadroClien.setVisible(true);
    }
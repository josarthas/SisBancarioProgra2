package Interfaz;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import sistemabancario.Cliente;
import Sucursal.Sucursal;

public class InterfazEmpleado extends JFrame {
  
    public InterfazEmpleado(){

        ArrayList<Cliente> datosClien = new ArrayList<>();
        ArrayList<Sucursal> sucursalesBanco = new ArrayList<>();
        
        JFrame cuadroClien = new JFrame("Banco Central - Empleado");
        cuadroClien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadroClien.setSize(480, 360);
        
        JButton nuevaSucursal= new JButton("Añadir Sucursal");
        JPanel panelsuc = new JPanel();
        panelsuc.add(nuevaSucursal);

        JFrame sucursales = new JFrame("Banco Central - Sucursales");
        JList sucursBanco = new JList(sucursalesBanco.toArray());
        DefaultListModel modelo = new DefaultListModel();
        
        for(int i = 0; i<sucursalesBanco.size();i++){
        modelo.addElement(sucursalesBanco.get(i).getNumSucursal());
        modelo.addElement(sucursalesBanco.get(i).getDireccion());
        modelo.addElement(sucursalesBanco.get(i).getTipo());
        
        }
        sucursBanco.setModel(modelo);
        sucursales.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sucursales.setSize(480, 360);
        
        JButton nuevoCliente= new JButton("Añadir Cliente");
        JButton verClientes= new JButton("Ver Clientes");
        JButton sucursal= new JButton("Ver Sucursales");

        JPanel panel1 = new JPanel();
        
        panel1.add(nuevoCliente);
        panel1.add(verClientes);
        panelsuc.add(sucursal);
        panelsuc.add(nuevaSucursal);
        cuadroClien.getContentPane().add(BorderLayout.NORTH, panel1);
        cuadroClien.getContentPane().add(BorderLayout.SOUTH, panelsuc);
        cuadroClien.setVisible(true);

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
        
        nuevaSucursal.addActionListener((ActionEvent e) -> {
            String numbe = JOptionPane.showInputDialog ("Introduzca Número de Sucursal");
            String direc = JOptionPane.showInputDialog ("Introduzca Direccion de Sucursal");
            String tipos = JOptionPane.showInputDialog ("Introduzca tipo (Cajero/ATM)");
            sucursalesBanco.add(new Sucursal(numbe,direc,tipos)); 
        });
        
        verClientes.addActionListener((ActionEvent e) -> {
            Object[] dtsClin = datosClien.toArray();
            System.out.println(dtsClin[0]);
            int tamarray=datosClien.size();
            System.out.println(tamarray);
            System.out.println(dtsClin[1]);
        });
        
        sucursal.addActionListener((ActionEvent e) -> {
          sucursales.setVisible(true);  
        });
    }
}
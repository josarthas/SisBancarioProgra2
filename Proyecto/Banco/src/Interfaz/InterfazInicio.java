package Interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Interfaz.InterfazEmpleado.*;

public class InterfazInicio extends JFrame{    
    public InterfazInicio(){

        //cuadro de inicio
        JFrame cuadroInicio = new JFrame("Banco Central");
        cuadroInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadroInicio.setSize(480, 360);
        //cuadro inicio
        
        //cuadro cliente
        JFrame cuadroCliente = new JFrame("Banco Central - Cliente");
        cuadroCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadroCliente.setSize(480, 360);
        //cuadro cliente
        
        //cuadro empleado
        JFrame cuadroEmpleado = new JFrame("Banco Central - Empleado");
        cuadroEmpleado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadroEmpleado.setSize(480, 360);
        //cuadro empleado
                       
        //botones
        JButton inicioCliente= new JButton("Cliente");
        JButton inicioEmpleado= new JButton("Empleado");
        JButton inicioSesion= new JButton("Iniciar Sesión");
        JButton inicioSesion2= new JButton("Iniciar Sesión");
        //botones
        
        //etiquetas
        JLabel labelClien = new JLabel("Cliente");
        JLabel labelPasswd2 = new JLabel("Contraseña");
        JLabel labelUser = new JLabel("Usuario");
        JLabel labelPasswd = new JLabel("Contraseña");
        //etiquetas
        
        //campo de texto
        JTextField campoUser = new JTextField(10);                
        JTextField campoPasswd = new JTextField(10);
        JTextField campoClien = new JTextField(10);        
        JTextField campoPasswd2 = new JTextField(10);
        //campo de texto
        
        //paneles
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel10 = new JPanel();
        JPanel panel20 = new JPanel();
        JPanel panel30 = new JPanel();
        JPanel panel0 = new JPanel();
        //paneles
        
        //acciones de paneles
        panel10.add(labelClien);
        panel10.add(campoClien);
        panel20.add(labelPasswd2);
        panel20.add(campoPasswd2);
        panel30.add(inicioSesion2);
        
        panel1.add(labelUser);
        panel1.add(campoUser);
        panel2.add(labelPasswd);
        panel2.add(campoPasswd);
        panel3.add(inicioSesion);
        
        panel0.add(inicioCliente);
        panel0.add(inicioEmpleado);
        
        //se acomodan los layouts
        cuadroInicio.getContentPane().add(BorderLayout.CENTER, panel0);
        cuadroEmpleado.getContentPane().add(BorderLayout.NORTH, panel10);
        cuadroEmpleado.getContentPane().add(BorderLayout.CENTER, panel20);
        cuadroEmpleado.getContentPane().add(BorderLayout.SOUTH, panel30); 
        cuadroCliente.getContentPane().add(BorderLayout.NORTH, panel1);
        cuadroCliente.getContentPane().add(BorderLayout.CENTER, panel2);
        cuadroCliente.getContentPane().add(BorderLayout.SOUTH, panel3);
        
        cuadroInicio.setVisible(true);
        //accion de los botones
        inicioCliente.addActionListener((ActionEvent e) -> {
            cuadroInicio.setVisible(false);
            cuadroCliente.setVisible(true);
        });
        
        inicioEmpleado.addActionListener((ActionEvent e) -> {
            cuadroInicio.setVisible(false);
            cuadroEmpleado.setVisible(true);

        });
        
        inicioSesion2.addActionListener((ActionEvent e) -> {
            String userValue = campoUser.getText();
            String passwdValue = campoPasswd.getText();
            
            if(userValue.equals(passwdValue)){
                cuadroEmpleado.setVisible(false);
                    SwingUtilities.invokeLater(() -> {
                        
                    InterfazEmpleado InterfazEmpleado = new InterfazEmpleado();
                    });   
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrecto");
                campoUser.setText("");
                campoPasswd.setText("");
            }
        });
        
        inicioSesion.addActionListener((ActionEvent e) -> {
            String userValue2 = campoClien.getText();
            String passwdValue2 = campoPasswd2.getText();
            if(userValue2.equals(passwdValue2)){
                cuadroCliente.setVisible(false);

                    SwingUtilities.invokeLater(() -> {
                    //agregar accion de boton
        });   
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrecto");
                campoClien.setText("");
                campoPasswd2.setText("");
            }
        });
    }
}
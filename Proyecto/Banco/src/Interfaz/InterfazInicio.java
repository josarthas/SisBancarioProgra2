package Interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Interfaz.InterfazEmpleado.*;

public class InterfazInicio extends JFrame{    
    public InterfazInicio(){
        JFrame cuadroInicio = new JFrame("Banco Central");
        cuadroInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadroInicio.setSize(480, 360);
        
        JFrame cuadro1 = new JFrame("Banco Central");
        cuadro1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadro1.setSize(480, 360);
        JButton inicioCliente= new JButton("Empleado");
        JButton inicioEmpleado= new JButton("Cliente");

        JPanel panel0 = new JPanel();
        panel0.add(inicioCliente);
        panel0.add(inicioEmpleado);
        cuadro1.getContentPane().add(BorderLayout.CENTER, panel0);
        cuadro1.setVisible(true);
        
        
        JButton inicioSesion= new JButton("Iniciar Sesión");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JLabel labelUser = new JLabel("Usuario");
        JTextField campoUser = new JTextField(10);
        JLabel labelPasswd = new JLabel("Contraseña");
        JTextField campoPasswd = new JTextField(10);
        panel1.add(labelUser);
        panel1.add(campoUser);
        panel2.add(labelPasswd);
        panel2.add(campoPasswd);
        panel3.add(inicioSesion);

        cuadroInicio.getContentPane().add(BorderLayout.NORTH, panel1);
        cuadroInicio.getContentPane().add(BorderLayout.CENTER, panel2);
        cuadroInicio.getContentPane().add(BorderLayout.SOUTH, panel3);
        
        inicioCliente.addActionListener((ActionEvent e) -> {
            cuadro1.setVisible(false);
            cuadroInicio.setVisible(true);
        });      
        inicioEmpleado.addActionListener((ActionEvent e) -> {
            cuadro1.setVisible(false);
            cuadroInicio.setVisible(true);

        });        
        inicioSesion.addActionListener((ActionEvent e) -> {
            String userValue = campoUser.getText();
            String passwdValue = campoPasswd.getText();
            if(userValue.equals(passwdValue)){
                cuadroInicio.setVisible(false);

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
    }
}
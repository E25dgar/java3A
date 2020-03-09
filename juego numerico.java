
import javax.swing.*;
import java.awt.event.*;

public class home{
 static JTextField ingresarNombre, ingresarIP;
 public static void main(String[] args){
  final JFrame ventanaInicio= new JFrame();
  ventanaInicio.setSize(720,720);
  ventanaInicio.setResizable(false);
  ventanaInicio.setLocationRelativeTo(null);
  ventanaInicio.setDefaultCloseOperation(ventanaInicio.EXIT_ON_CLOSE);
  ventanaInicio.setLayout(null);
  
  JLabel logo= new JLabel("#TABLA");
  logo.setBounds(0,0,75,25);
  JLabel desc1= new JLabel("Inicia una nueva partida");
  desc1.setBounds(200,200,300,25);
  JLabel desc2= new JLabel("Unete a una partida existente");
  desc2.setBounds(200,250,300,25);
  JLabel labelNombre= new JLabel("1. Cant de jugadores: ");
  labelNombre.setBounds(70,60,125,25);
  JLabel labelIP= new JLabel("2. nivel: ");
  labelIP.setBounds(70,100,125,25);
  JLabel selecciona= new JLabel("3. Selecciona una opcion:");
  selecciona.setBounds(70,150,150,25);
  
  ingresarNombre= new JTextField();
  ingresarNombre.setBounds(210,60,125,25);
  ingresarIP= new JTextField();
  ingresarIP.setBounds(210,100,125,25);
  
  JButton crear= new JButton("Crear Partida");
  crear.setBounds(70,200,125,30);
  crear.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
    ventanaInicio.removeAll();
    ventanaInicio.setVisible(false);
    String name=ingresarNombre.getText();
    String ip=ingresarIP.getText();
    new sala(name, ip);
   }
  });
  JButton unirse= new JButton("Unirse");
  unirse.setBounds(70,250,125,30);
  unirse.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
    ventanaInicio.removeAll();
    ventanaInicio.setVisible(false);
    String name=ingresarNombre.getText();
                                String ip=ingresarIP.getText();
    new unirse(name, ip);
   }
  });
  
  ventanaInicio.add(logo);
  ventanaInicio.add(labelNombre);
  ventanaInicio.add(labelIP);
  ventanaInicio.add(selecciona);
  ventanaInicio.add(desc1);
  ventanaInicio.add(desc2);
  ventanaInicio.add(ingresarNombre);
  ventanaInicio.add(ingresarIP);
  ventanaInicio.add(crear);
  ventanaInicio.add(unirse);
  ventanaInicio.setVisible(true);
 }
}

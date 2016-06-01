package es.takomachi.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;


public class pantalla extends JFrame  {
	
	static private JLabel temperatura;
	static private JProgressBar energia;
	static private JTextField nombre;
	static private JLabel peso;
    static private JRadioButton tipomascotaFoca;
    static private JRadioButton tipomascotaPerro;
    static private JRadioButton tipomascotaGato;
    static private JLabel TipoMascota;
    static private JLabel Comer;
    static private JLabel Quitar_Poner;
    static private JLabel Espacio;
    static private JLabel Mover;
    static private JComboBox comer;
    static private JComboBox ropa;
    static private JSlider mover;
    static private JButton cargar;
    static private JButton salir;
    static private JButton guardar;
    static private JButton interaccion;
    static double temperatura_p;
    static int peso_p;
    static 	ButtonGroup grupo;
    
    
    
    public pantalla(){
   temperatura_p=19.5;
   peso_p=10;
   temperatura=new JLabel ("Temperatura:"+temperatura_p+"º");
   TipoMascota=new JLabel("TIPO MASCOTA");
   
   Comer=new JLabel("COMER");
   
   Espacio=new JLabel("");
   Quitar_Poner=new JLabel("QUITAR/PONER ROPA");
   Mover=new JLabel("MOVER EJE X");
  
   energia=new JProgressBar();
   energia.setString("ENERGIA 100%");
   energia.setValue(100);
   energia.setStringPainted(true);
   nombre=new JTextField("nombre",10);
   peso=new JLabel("Peso:"+peso_p+"kg");
   tipomascotaFoca=new JRadioButton("Foca");
   tipomascotaPerro=new JRadioButton("Perro");
   tipomascotaGato=new JRadioButton("Gato");
   grupo=new ButtonGroup();
   grupo.add(tipomascotaFoca);
   grupo.add(tipomascotaPerro);
   grupo.add(tipomascotaGato);
   JPanel panel=new JPanel();
   panel.add(tipomascotaPerro);
   panel.add(tipomascotaGato);
   panel.add(tipomascotaFoca);
   comer=new JComboBox();
   comer.setSize(25,10);
   comer.addItem("");
   comer.addItem("Carne");
   comer.addItem("Leche");
   comer.addItem("Langosta");
   ropa=new JComboBox();
   ropa.addItem("");
   ropa.addItem("Poner Camiseta");
   ropa.addItem("Poner Gorro");
   ropa.addItem("Quitar Camiseta");
   ropa.addItem("Quitar Gorro");
   mover=new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
   mover.setMinorTickSpacing(1);
   mover.setMajorTickSpacing(5);
   mover.setPaintTicks(true);
   mover.setPaintLabels(true);
   cargar=new JButton("Cargar Juego");
   guardar=new JButton("Guardar Juego");
   salir=new JButton("Salir Juego");
   interaccion=new JButton("interaccion");
   JFrame ventana = new JFrame("Pantalla");
   JPanel Pestado=new JPanel(new FlowLayout(FlowLayout.CENTER,120,10));
     Pestado.add(temperatura);
     Pestado.add(energia);
     Pestado.add(nombre);
     Pestado.add(peso);
   JPanel Pinteraccion=new JPanel();
   JPanel Pmascota=new JPanel(new FlowLayout(FlowLayout.CENTER,40,10));
     Pmascota.add(TipoMascota);
     Pmascota.add(panel);
  JPanel Pcomer=new JPanel(new FlowLayout(FlowLayout.CENTER,60,10));
         Pcomer.add(Comer);
         Pcomer.add(comer);
  JPanel Propa=new JPanel(new FlowLayout(FlowLayout.CENTER,40,10));
         Propa.add(Quitar_Poner);
         Propa.add(ropa);
  JPanel Pmover=new JPanel(new FlowLayout(FlowLayout.CENTER,40,10));
         Pmover.add(Mover);
         Pmover.add(mover);
        Pinteraccion.setLayout(new BoxLayout(Pinteraccion,BoxLayout. Y_AXIS));
        Pinteraccion.add(Pmascota);
    	Pinteraccion.add(Pcomer);
    	Pinteraccion.add(Propa);
    	Pinteraccion.add(Pmover);
    
   JPanel Pjuego=new JPanel();
        Pjuego.setLayout(new BoxLayout(Pjuego,BoxLayout. Y_AXIS));
        JPanel Pcargar=new JPanel(new FlowLayout(FlowLayout.CENTER));
               Pcargar.add(cargar);
       JPanel Pguardar=new JPanel(new FlowLayout(FlowLayout.CENTER));
               Pguardar.add(guardar);
       JPanel Psalir=new JPanel(new FlowLayout(FlowLayout.CENTER));
               Psalir.add(salir);
          Pjuego.add(Pcargar);
          Pjuego.add(Pguardar);
          Pjuego.add(Psalir);
    
   JPanel Paccion=new JPanel(new FlowLayout(FlowLayout.CENTER,40,10));
          Paccion.add(interaccion);
    JPanel dibujo=new JPanel();
      dibujo.setLayout(null);
	 
          
        ventana.setLayout(new BorderLayout());
      	ventana.add(Pestado,BorderLayout.NORTH);
		ventana.add(Pjuego,BorderLayout.EAST);
		ventana.add(Paccion,BorderLayout.SOUTH);
		ventana.add(Pinteraccion,BorderLayout.WEST);
		ventana.add(new Lienzoperro(),BorderLayout.CENTER);
		//ventana.setSize(400,600);	
		//ventana.pack();
		ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
		ventana.setVisible(true);
    }
    
    
    
    
    
    
	
}

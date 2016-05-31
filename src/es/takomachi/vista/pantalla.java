package es.takomachi.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;


public class pantalla extends JFrame  {
	
	static private JLabel temperatura;
	static private JProgressBar energia;
	static private JTextField nombre;
	static private JLabel peso;
    static private JRadioButton tipomascotaFoca;
    static private JRadioButton tipomascotaPerro;
    static private JRadioButton tipomascotaGato;
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
   energia=new JProgressBar();
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
   comer.addItem("Carne");
   comer.addItem("Leche");
   comer.addItem("Langosta");
   ropa=new JComboBox();
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
   JPanel Pestado=new JPanel(new FlowLayout());
     Pestado.add(temperatura);
     Pestado.add(energia);
     Pestado.add(nombre);
     Pestado.add(peso);
   JPanel Pinteraccion=new JPanel();
        Pinteraccion.setLayout(new BoxLayout(Pinteraccion,BoxLayout. Y_AXIS));
    	Pinteraccion.add(panel);
    	Pinteraccion.add(comer);
    	Pinteraccion.add(ropa);
    	Pinteraccion.add(mover);
    
   JPanel Pjuego=new JPanel();
        Pjuego.setLayout(new BoxLayout(Pjuego,BoxLayout. Y_AXIS));
          Pjuego.add(cargar);
          Pjuego.add(guardar);
          Pjuego.add(salir);
    
   JPanel Paccion=new JPanel(new FlowLayout());
          Paccion.add(interaccion);
      JPanel dibujo=new JPanel();
       dibujo.setLayout(null);
          
        ventana.setLayout(new BorderLayout());
      	ventana.add(Pestado,BorderLayout.NORTH);
		ventana.add(Pjuego,BorderLayout.EAST);
		ventana.add(Paccion,BorderLayout.SOUTH);
		ventana.add(Pinteraccion,BorderLayout.WEST);
		ventana.add(dibujo,BorderLayout.CENTER);
		ventana.setSize(600,400);		
		//ventana.pack();
		ventana.setVisible(true);
    }
    
    
    
    
    
    
	
}

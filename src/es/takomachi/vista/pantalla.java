package es.takomachi.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.event.ChangeEvent;

import es.takomachi.controller.Tablero;


public class pantalla extends JFrame implements ActionListener {
	
	public static  JLabel temperatura;
	public static  JProgressBar energia;
	public static  JTextField nombre;
	public static  JLabel peso;
    public static  JRadioButton tipomascotaFoca;
    public static  JRadioButton tipomascotaPerro;
    public static  JRadioButton tipomascotaGato;
    public static  JLabel TipoMascota;
    public static  JLabel Comer;
    public static  JLabel Quitar_Poner;
    public static  JLabel Espacio;
    public static  JLabel Mover;
    public static  JComboBox comer;
    public static  JComboBox ropa;
    public static  JSlider mover;
    public static  JButton cargar;
    public static  JButton salir;
    public static  JButton guardar;
    public static  JButton interaccion;
    public static double temperatura_p;
    public static double peso_p;
    public static 	ButtonGroup grupo;
    public static JFrame ventana;
    public static ImageIcon icon;
    public static JLabel DesRopaPoner;
    public static JLabel DesRopaQuitar;
    
    public pantalla(){
   temperatura_p=Tablero.temperatura;
   peso_p=Tablero.peso;
   temperatura=new JLabel ("Temperatura: "+String.valueOf(temperatura_p)+"º");
   
   TipoMascota=new JLabel("TIPO MASCOTA");
   Comer=new JLabel("COMER");
   Espacio=new JLabel("");
   Quitar_Poner=new JLabel("QUITAR/PONER ROPA");
   Mover=new JLabel("MOVER EJE X");
   DesRopaPoner=new JLabel("Poner Ropa: Camiseta1,Gorro1");
   DesRopaQuitar=new JLabel("Quitar Ropa: Camiseta0,Gorro0");
   
   energia=new JProgressBar();
   energia.setString("Energia");
   energia.setValue(100);
   energia.setStringPainted(true);
   nombre=new JTextField("nombre",10);
   peso=new JLabel("Peso: "+String.valueOf(peso_p)+"kg");
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
   tipomascotaGato.addActionListener(this);
   tipomascotaPerro.addActionListener(this);
   tipomascotaFoca.addActionListener(this);
   comer=new JComboBox();
   comer.setSize(25,10);
   comer.addItem("");
   comer.addItem("Carne");
   comer.addItem("Leche");
   comer.addItem("Langosta");
   ropa=new JComboBox();
   ropa.addItem("");
   ropa.addItem("Camiseta1");//Poner camiseta
   ropa.addItem("Gorro1");//Poner gorro
   ropa.addItem("Camiseta0");//Quitar camiseta
   ropa.addItem("Gorro0");//Quitar gorro
   mover=new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
   mover.setMinorTickSpacing(1);
   mover.setMajorTickSpacing(5);
   mover.setPaintTicks(true);
   mover.setPaintLabels(true);
   cargar=new JButton("Cargar Juego");
   cargar.addActionListener(this);//Le añado el mismo evento con el operador this.
   guardar=new JButton("Guardar Juego");
   guardar.addActionListener(this);//Le añado el mismo evento con el operador this.
   salir=new JButton("Salir Juego");
   salir.addActionListener(this);//Le añado el mismo evento con el operador this.
   interaccion=new JButton("EJECUTAR INTERACCION");
   interaccion.setBackground(Color.cyan);
   interaccion.addActionListener(this);
    ventana = new JFrame("Pantalla");
    icon = createImage("images/middle.gif",
            "a pretty but meaningless splat");
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
         Pcomer.add(Comer).setVisible(false);
         Pcomer.add(comer).setVisible(false);
  JPanel Propa=new JPanel(new FlowLayout(FlowLayout.CENTER,40,10));
         Propa.add(Quitar_Poner).setVisible(false);
         Propa.add(ropa).setVisible(false);
  JPanel PdesRopa=new JPanel(new FlowLayout(FlowLayout.CENTER,40,10));
         PdesRopa.add(DesRopaPoner);
         PdesRopa.add(DesRopaQuitar);
  JPanel Pmover=new JPanel(new FlowLayout(FlowLayout.CENTER,40,10));
         Pmover.add(Mover).setVisible(false);
         Pmover.add(mover).setVisible(false);
        Pinteraccion.setLayout(new BoxLayout(Pinteraccion,BoxLayout. Y_AXIS));
        Pinteraccion.add(Pmascota);
    	Pinteraccion.add(Pcomer);
    	Pinteraccion.add(Propa);
    	Pinteraccion.add(PdesRopa);
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
	
		
		//ventana.setSize(400,600);	
		//ventana.pack();
		ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
		ventana.setVisible(true);
    }

    private ImageIcon createImage(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	/***
     *Con un mismo oyente manejo varias fuentes
     *como los botones cargar, guardar y salir 
     * 
     */

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object fuente=e.getSource();
		 JFrame miventana = new JFrame("Panel");
		if(fuente==cargar){
			
		JOptionPane.showMessageDialog(miventana, "Vamos a jugar dale de comer a tu mascotara y ponle a la ropa,"
				+ " pulsa el boton interaccion  despues de ejecutar una accion", "Titulo cargar juego",
		                 JOptionPane.WARNING_MESSAGE);
		
		if (tipomascotaPerro.isSelected()){
			ventana.add(new Lienzoperro(),BorderLayout.CENTER);
			comer.setVisible(true);
			Comer.setVisible(true);
			Quitar_Poner.setVisible(true);
	        ropa.setVisible(true);
	        Mover.setVisible(true);
	        mover.setVisible(true);
	        new Tablero(nombre.getText(),"perro");
	        temperatura_p=Tablero.temperatura;
	        peso_p=Tablero.peso;
	        System.out.println("peso"+peso_p);
	        System.out.println("temperatura_p"+temperatura_p);
	        temperatura.setText("Temperatura: "+String.valueOf(temperatura_p)+"º");
	        peso.setText("Peso: "+String.valueOf(peso_p)+"kg");
	        tipomascotaGato.setVisible(false);
	        tipomascotaGato.setEnabled(false);
	        tipomascotaFoca.setVisible(false);
	        tipomascotaFoca.setEnabled(false); 
	        
	        
		    
		   }
			if(tipomascotaGato.isSelected()){
			  ventana.add(new Lienzogato(),BorderLayout.CENTER);
				comer.setVisible(true);
				Comer.setVisible(true);
				Quitar_Poner.setVisible(true);
		        ropa.setVisible(true);
		        Mover.setVisible(true);
		        mover.setVisible(true);
		        new Tablero(nombre.getText(),"gato");
		        temperatura_p=Tablero.temperatura;
		        peso_p=Tablero.peso;
		        temperatura.setText("Temperatura: "+String.valueOf(temperatura_p)+"º");
		        peso.setText("Peso: "+String.valueOf(peso_p)+"kg");
		        tipomascotaPerro.setVisible(false);
		        tipomascotaPerro.setEnabled(false);
		        tipomascotaFoca.setVisible(false);
		        tipomascotaFoca.setEnabled(false);
		        
		       
				
			}
			if(tipomascotaFoca.isSelected()){
			   ventana.add(new Lienzofoca(),BorderLayout.CENTER);
				comer.setVisible(true);
				Comer.setVisible(true);
				Quitar_Poner.setVisible(true);
		        ropa.setVisible(true);
		        Mover.setVisible(true);
		        mover.setVisible(true);
		        new Tablero(nombre.getText(),"foca");
		        temperatura_p=Tablero.temperatura;
		        peso_p=Tablero.peso;
		        temperatura.setText("Temperatura: "+String.valueOf(temperatura_p)+"º");
		        peso.setText("Peso: "+String.valueOf(peso_p)+"kg");
		        tipomascotaPerro.setVisible(false);
		        tipomascotaPerro.setEnabled(false);
		        tipomascotaGato.setVisible(false);
		        tipomascotaGato.setEnabled(false);
		        
		       
		      }
		
		
		}else if(fuente==guardar){
			
			JOptionPane.showMessageDialog(miventana, "He manejado un evento de forma exitosa!!", "Titulo guardar juego",
	                 JOptionPane.WARNING_MESSAGE);
			
		}else if(fuente==salir){
		    System.exit(0);
		    
		}else if(fuente==interaccion){
			
			Tablero.comida=(String) comer.getSelectedItem();
			System.out.println("comida"+Tablero.comida);
			Tablero.ropa=(String) ropa.getSelectedItem();
			System.out.println("ropa"+Tablero.ropa);
			Tablero.mover=(int) mover.getValue();
			comer.setSelectedIndex(0);
		    ropa.setSelectedIndex(0);
		    
			 if(tipomascotaFoca.isEnabled() && (Tablero.comida.equals("Leche") || Tablero.comida.equals("Carne"))){
					Lienzofoca.accion_comer.setVisible(false);
					Lienzofoca.accion_mover.setVisible(false);
					Lienzofoca.accion_ponerRopa.setVisible(false);
				    Lienzofoca.accion_quitarRopa.setVisible(false);
				    System.out.println("enabledfoca"+Tablero.comida);
				    Tablero.comida="";
			      }
			 
			 if(tipomascotaGato.isEnabled() && (Tablero.comida.equals("Carne") || Tablero.comida.equals("Langosta"))){
					Lienzogato.accion_comer.setVisible(false);
					Lienzogato.accion_mover.setVisible(false);
					Lienzogato.accion_ponerRopa.setVisible(false);
					Lienzogato.accion_quitarRopa.setVisible(false);
					 System.out.println("enabledGato"+Tablero.comida);
					 Tablero.comida="";
			  }
			 
			 if(tipomascotaPerro.isEnabled() && (Tablero.comida.equals("Leche") || Tablero.comida.equals("Langosta"))){
			        Lienzoperro.accion_comer.setVisible(false);
					Lienzoperro.accion_mover.setVisible(false);
					Lienzoperro.accion_ponerRopa.setVisible(false);
					Lienzoperro.accion_quitarRopa.setVisible(false);
					System.out.println("enabledPerro"+Tablero.comida);
					Tablero.comida="";
			     }
			 
		    System.out.println("mover: "+mover.getValue());
		    
		}else{
			
			JOptionPane.showMessageDialog(miventana, "Por favor pulsa el boton Cargar juego", "Inicio Juego",
	                 JOptionPane.WARNING_MESSAGE);
			
		}
		
		
	}
	
	
    
}

package es.takomachi.vista;


import java.awt.*;
import javax.swing.*;

import es.takomachi.controller.Tablero;


public class Lienzoperro extends JPanel {
	public static JLabel accion_mover;
	  public static JLabel accion_ponerRopa;
	  public static JLabel accion_quitarRopa;
	  public static JLabel accion_comer;
    
  Lienzoperro() {
	  this.setBackground(Color.yellow);
	  this.setBounds(0,0,25,50);
	  accion_mover=new JLabel ("Accion: mover   peso:-0.25 kg  energia:-1%");
	  accion_mover.setBounds(new Rectangle(800, 300, 50, 50));
	  this.add(accion_mover);
	  accion_mover.setVisible(false);
	  accion_ponerRopa=new JLabel("Accion: Poner Ropa Prendas puestas:"+Tablero.ropapuestaFoca+" temperatura:-1º");
	  accion_ponerRopa.setBounds(new Rectangle(850, 350, 200,200));
	  this.add(accion_ponerRopa);
	  accion_ponerRopa.setVisible(false);
	  accion_quitarRopa=new JLabel("Accion: Quitar Ropa Prendas puestas:"+Tablero.ropapuestaFoca+" temperatura:-1º");
	  accion_ponerRopa.setBounds(new Rectangle(900,400,150, 150));
	  this.add(accion_quitarRopa);
	  accion_quitarRopa.setVisible(false);
	  accion_comer=new JLabel("Accion: Comer  peso:+0.50kg energia:+2%");
	  accion_comer.setBounds(new Rectangle(950,450,200,200));
	  accion_comer.setVisible(false);
	  this.add(accion_comer);
  }

@Override
public void paint(Graphics r){
	super.paint(r);
//Cabeza
r.setColor(Color.orange);
r.fillOval(200, 130, 100, 100);
r.setColor(Color.blue);
r.fillOval(225, 160, 15, 15);
r.fillOval(260, 160, 15, 15);
r.setColor(Color.black);
r.fillOval(249, 182, 10, 10);
r.setColor(Color.black);
r.fillRect(235, 205, 40, 5);

//Cuerpo
r.setColor(Color.white);
r.fillOval(175, 230, 150, 150);


//Manos
r.setColor(Color.cyan);
r.fillOval(300, 250, 20, 60);
r.fillOval(175, 250, 20, 60);


//Pies
r.setColor(Color.black);
r.fillOval(150, 370, 90, 40);
r.fillOval(260, 370, 90, 40);

  }

}

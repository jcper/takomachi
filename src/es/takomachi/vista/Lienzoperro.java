package es.takomachi.vista;


import java.awt.*;
import javax.swing.*;


public class Lienzoperro extends JPanel {
	
    
  Lienzoperro() {
	  this.setBackground(Color.yellow);
	  this.setBounds(0,0,25,50);
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

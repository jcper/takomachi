package es.takomachi.vista;

import java.awt.*;
import javax.swing.*;


public class Lienzofoca extends JPanel {
	
    
Lienzofoca() {
	  this.setBackground(Color.yellow);
	  this.setBounds(0,0,100,200);
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
r.setColor(Color.MAGENTA);
r.fillRect(210, 230, 20, 90);
r.fillRect(210, 320, 5, 10);
r.fillRect(217, 320, 5, 10);
r.fillRect(225, 320, 5, 10);

r.fillRect(270, 230, 20, 90);
r.fillRect(270, 320, 5, 10);
r.fillRect(277, 320, 5, 10);
r.fillRect(285, 320, 5, 10);
//Manos
r.setColor(Color.cyan);
r.fillOval(300, 250, 20, 60);
r.fillOval(175, 250, 20, 60);




  }

}

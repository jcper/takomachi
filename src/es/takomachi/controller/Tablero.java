package es.takomachi.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import es.takomachi.modelo.Foca;
import es.takomachi.modelo.Gato;
import es.takomachi.modelo.Perro;

public class Tablero implements ActionListener{
	public Timer timer;
	private static Foca foca;
	private static Gato gato;
	private static Perro perro;
	private static String comida;
	private static double temperatura;
	private static int mover;
	private static int energia;
	private static String ropa;
	 public Tablero(String nombre, String mascota){
	  timer=new Timer(40,this);
	  if(mascota.equals("foca")){
	  setFoca(new Foca(nombre));
	  temperatura=foca.getTemperatura();
	  setEnergia(foca.getEnergia());
	  setMover(foca.getPosicion());
	  }
	  if(mascota.equals("perro")){
		  setPerro(new Perro(nombre));
		  temperatura=perro.getTemperatura();
		  setEnergia(perro.getEnergia());
		  setMover(perro.getPosicion());
	   }
	  if(mascota.equals("gato")){
		 setGato(new Gato(nombre));
		  temperatura=gato.getTemperatura();
		  setEnergia(gato.getEnergia());
		  setMover(gato.getPosicion());
	  }
	  comida="";
	  ropa="";
	
	 }

	 
	/**
	 * Establezco mi propias reglas de juego cada 2 minutos de juego debemos
	 * dar de comer a nuestra mascoya sino el peso baja,
	 * si hace frio y no se abriga su temperatura baja y 
	 * su energia desciende.
	 * Si come aumenta su energia y peso.
	 * Establecemos que primero le damos de comer, para realizar las siguientes acciones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(!comida.equals("") ){
		  foca.DarComer(comida);
		  gato.DarComer(comida);
		  perro.DarComer(comida);
		}
		if(temperatura <=19){
		foca.PonerRopa(ropa);
		gato.PonerRopa(ropa);
		perro.PonerRopa(ropa);
		}
		reiniciarInteraccion();
	 }

	public static Perro getPerro() {
		return perro;
	}


	public static void setPerro(Perro perro) {
		Tablero.perro = perro;
	}


	public static Gato getGato() {
		return gato;
	}


	public static void setGato(Gato gato) {
		Tablero.gato = gato;
	}


	public static Foca getFoca() {
		return foca;
	}


	public static void setFoca(Foca foca) {
		Tablero.foca = foca;
	}


    public void reiniciarInteraccion(){
      comida="";
      ropa="";
      
    }


	public static int getMover() {
		return mover;
	}

    public static void setMover(int mover) {
		Tablero.mover = mover;
	}

    public static int getEnergia() {
		return energia;
	}
	
    public static void setEnergia(int energia) {
		Tablero.energia = energia;
	}
}

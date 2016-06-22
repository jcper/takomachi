package es.takomachi.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import es.takomachi.modelo.Foca;
import es.takomachi.modelo.Gato;
import es.takomachi.modelo.Perro;
import es.takomachi.vista.pantalla;

public class Tablero implements ActionListener{
	public Timer timer;
	private static Foca foca;
	private static Gato gato;
	private static Perro perro;
	public static String comida;
	public static double temperatura;
	public static int mover;
	public static int energia;
	public static int peso;
	public static String ropa;
	 public Tablero(String nombre, String mascota){
	  timer=new Timer(40,this);
	  timer.start();
	  if(mascota.equals("foca")){
	  setFoca(new Foca(nombre));
	  temperatura=foca.getTemperatura();
	  peso=foca.getPeso();
	  System.out.println("temperatura"+foca.getTemperatura());
	  setEnergia(foca.getEnergia());
	  setMover(foca.getPosicion());
	  }
	  if(mascota.equals("perro")){
		  setPerro(new Perro(nombre));
		  temperatura=perro.getTemperatura();
		  peso=perro.getPeso();
		  System.out.println("temperatura"+perro.getTemperatura());
		  setEnergia(perro.getEnergia());
		  setMover(perro.getPosicion());
	   }
	  if(mascota.equals("gato")){
		 setGato(new Gato(nombre));
		  temperatura=gato.getTemperatura();
		  peso=gato.getPeso();
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
			if(foca!=null){
		  foca.DarComer(comida);
		  peso=foca.getPeso();
		  
			}
		   if(gato!=null){
		  gato.DarComer(comida);
		  peso=gato.getPeso();
		    }
		  if(perro!=null){
		  perro.DarComer(comida);
		  peso=perro.getPeso();
		   }
		}
		
		if(temperatura <19){
	    if(foca!=null){
		foca.PonerRopa(ropa);
		 temperatura=foca.getTemperatura();
	    }
	    if(gato!=null){
		gato.PonerRopa(ropa);
		 temperatura=gato.getTemperatura();
	    }
	    if(perro!=null){
		perro.PonerRopa(ropa);
		 temperatura=perro.getTemperatura();
	     }
		}
		if(temperatura >=19){
		    if(foca!=null){
			foca.QuitarRopa(ropa);
			 temperatura=foca.getTemperatura();
		    }
		    if(gato!=null){
			gato.QuitarRopa(ropa);
			 temperatura=gato.getTemperatura();
		    }
		    if(perro!=null){
			perro.QuitarRopa(ropa);
			 temperatura=perro.getTemperatura();
		    }
	    
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

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
	public static double peso;
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
		
		if(!ropa.equals("")){
		
	    if(foca!=null){
	    if(Double.compare(foca.getTemperatura(),19.5)<= 0){
		foca.PonerRopa(ropa);
		 temperatura=foca.getTemperatura();
		 ropa="";
	    }
		 System.out.println("t1"+temperatura);
	    }
	    if(gato!=null){
	    if(Double.compare(gato.getTemperatura(),19.5)<= 0){
		gato.PonerRopa(ropa);
		 temperatura=gato.getTemperatura();
		 ropa="";
	      }
		 System.out.println("t1"+temperatura);
	   }
	    if(perro!=null){
	    if(Double.compare(perro.getTemperatura(),19.5)<= 0){
		perro.PonerRopa(ropa);
		 temperatura=perro.getTemperatura();
		 ropa="";
	    }
		 System.out.println("t1"+temperatura);
	  }
	
		    if(foca!=null){
		   if(Double.compare(foca.getTemperatura(),19.5)> 0){
			foca.QuitarRopa(ropa);
			 temperatura=foca.getTemperatura();
			  ropa="";
			  }
		     System.out.println("t1"+temperatura);
		    }
		    if(gato!=null){
		   if(Double.compare(gato.getTemperatura(),19.5)> 0){
			gato.QuitarRopa(ropa);
			temperatura=gato.getTemperatura();
			 pantalla.temperatura.setText("Temperatura: "+String.valueOf(temperatura)+"º");
			 ropa="";
			 }
		     System.out.println("t1"+temperatura);
		    }
		    if(perro!=null){
		    if(Double.compare(perro.getTemperatura(),19.5)> 0){
			perro.QuitarRopa(ropa);
			temperatura=perro.getTemperatura();
			pantalla.temperatura.setText("Temperatura: "+String.valueOf(temperatura)+"º"); 
			 ropa="";
		     }
		    System.out.println("t1"+temperatura);
		    }
		   }
	    
		 reiniciarInteraccion();
		  if(foca!=null && foca.getPosicion()!=50){
			 foca.Moverse(mover); 
		  }
		  if(gato!=null && gato.getPosicion()!=50){
				 gato.Moverse(mover); 
		  }
		  if(perro!=null && perro.getPosicion()!=50){
				 perro.Moverse(mover); 
		  }
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

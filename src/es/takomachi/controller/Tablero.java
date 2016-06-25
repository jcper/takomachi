package es.takomachi.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import es.takomachi.modelo.Foca;
import es.takomachi.modelo.Gato;
import es.takomachi.modelo.Perro;
import es.takomachi.vista.Lienzofoca;
import es.takomachi.vista.Lienzogato;
import es.takomachi.vista.Lienzoperro;
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
	public static int ropapuestaPerro;
	public static int ropapuestaGato;
	public static int ropapuestaFoca;
	
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
      ropapuestaPerro=0;
	  ropapuestaGato=0;
	  ropapuestaFoca=0;
	
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
		
		if(!Tablero.comida.equals("")){
			if(foca!=null ){
		  foca.DarComer(comida);
		  Tablero.peso=foca.getPeso();
		  Tablero.energia=foca.getEnergia();
		  pantalla.energia.setValue(Tablero.energia);
		  pantalla.peso.setText("Peso: "+String.valueOf(Tablero.peso)+"kg");
		  Tablero.comida="";
		  Lienzofoca.accion_comer.setVisible(true);
		  System.out.println("foca"+peso);
		  }
		   if(gato!=null){
		  gato.DarComer(comida);
		  Tablero.peso=gato.getPeso();
		  Tablero.energia=gato.getEnergia();
		  pantalla.energia.setValue(Tablero.energia);
		  pantalla.peso.setText("Peso: "+String.valueOf(Tablero.peso)+"kg");
		  Tablero.comida="";
		  Lienzogato.accion_comer.setVisible(true);
		  System.out.println("gato");
		   }
		  if(perro!=null){
		  perro.DarComer(comida);
		  Tablero.peso=perro.getPeso();
		  Tablero.energia=perro.getEnergia();
		  pantalla.energia.setValue(Tablero.energia);
		  pantalla.peso.setText("Peso: "+String.valueOf(Tablero.peso)+"kg");
		  Tablero.comida="";
		  Lienzoperro.accion_comer.setVisible(true);
		  System.out.println("perro"+peso);
		   }
		}
		
	if(!ropa.equals("")){
		
	    if(foca!=null){
	      if( foca.PonerRopa(ropa) && ropapuestaFoca<2){
			 ropapuestaFoca++;
			 temperatura=foca.getTemperatura();
			 pantalla.temperatura.setText("Temperatura: "+String.valueOf(temperatura)+"º");
			 Lienzofoca.accion_ponerRopa.setVisible(true);
		 }
		 if( foca.QuitarRopa(ropa) && ropapuestaFoca>0){
			 ropapuestaFoca--;
			 temperatura=foca.getTemperatura();
			 pantalla.temperatura.setText("Temperatura: "+String.valueOf(temperatura)+"º");
			 Lienzofoca.accion_quitarRopa.setVisible(true);
		 }
         ropa="";
		 System.out.println("foca"+temperatura);
	   }
	    if(gato!=null){
	    
	    	if( gato.PonerRopa(ropa) && ropapuestaGato<2){
				 Tablero.ropapuestaGato++;
				 temperatura=gato.getTemperatura();
				 pantalla.temperatura.setText("Temperatura: "+String.valueOf(temperatura)+"º");
				 Lienzogato.accion_ponerRopa.setVisible(true);
			 }
			 if( gato.QuitarRopa(ropa) && ropapuestaGato>0){
				 Tablero.ropapuestaGato--;
				 temperatura=gato.getTemperatura();
				 pantalla.temperatura.setText("Temperatura: "+String.valueOf(temperatura)+"º");
				 Lienzogato.accion_quitarRopa.setVisible(true);

			 }
		 ropa="";
		 System.out.println("gato"+temperatura);
	    }
		if(perro!=null){
			 if( perro.PonerRopa(ropa) && ropapuestaPerro<2){
				 ropapuestaPerro++;
				 temperatura=perro.getTemperatura();
				 pantalla.temperatura.setText("Temperatura: "+String.valueOf(temperatura)+"º");
				 Lienzoperro.accion_ponerRopa.setVisible(true);
			 }
			 if( perro.QuitarRopa(ropa) && ropapuestaPerro>0){
				 ropapuestaPerro--;
				 temperatura=perro.getTemperatura();
				 pantalla.temperatura.setText("Temperatura: "+String.valueOf(temperatura)+"º");
				 Lienzoperro.accion_quitarRopa.setVisible(true);
			 }
		 ropa="";
		 System.out.println("perro"+temperatura);
	    }
      }
	
		 reiniciarInteraccion();
		  if(mover!=0){
		  if(foca!=null && foca.getPosicion()!=mover){
			 foca.Moverse(mover);
			 peso=foca.getPeso();
			 energia=foca.getEnergia();
			 Tablero.peso=foca.getPeso();
			 Tablero.energia=foca.getEnergia();
			  pantalla.energia.setValue(Tablero.energia);
			  pantalla.peso.setText("Peso: "+String.valueOf(Tablero.peso)+"kg");
			  mover=0;
			  Lienzofoca.accion_mover.setVisible(true);
		  }
		  if(gato!=null && gato.getPosicion()!=mover){
			gato.Moverse(mover);
			peso=gato.getPeso();
			energia=gato.getEnergia();
			Tablero.peso=gato.getPeso();
			  Tablero.energia=gato.getEnergia();
			  pantalla.energia.setValue(Tablero.energia);
			  pantalla.peso.setText("Peso: "+String.valueOf(Tablero.peso)+"kg");
			mover=0;
			 Lienzogato.accion_mover.setVisible(true);
		  }
		  if(perro!=null && perro.getPosicion()!=mover){
			 perro.Moverse(mover);
			 peso=perro.getPeso();
			 energia=perro.getEnergia();
			 Tablero.peso=perro.getPeso();
			  Tablero.energia=perro.getEnergia();
			  pantalla.energia.setValue(Tablero.energia);
			  pantalla.peso.setText("Peso: "+String.valueOf(Tablero.peso)+"kg");
			 mover=0;
			 Lienzoperro.accion_mover.setVisible(true);
		 }
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

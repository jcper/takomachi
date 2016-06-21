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
	private static String nombre;
	private static String comida;
	private static String mascota;
	private static int temperatura;
	private static String ropa;
	 public Tablero(){
	  timer=new Timer(40,this);
	  setFoca(new Foca(nombre));
	  setGato(new Gato(nombre));
	  setGato(new Gato(nombre));
	  comida="";
	  ropa="";
	  temperatura=19;
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
		if(!comida.equals("") && mascota.equals("foca")){
		foca.DarComer(comida);
		
		if(temperatura <=19){
		foca.PonerRopa(ropa);
		
		}else{
			foca.SetPeso(foca.getPeso()-1);
			foca.SetEnergia(foca.getEnergia()-1);
		  }
		}
		if(!comida.equals("") && mascota.equals("gato")){
		  gato.DarComer(comida);
		  
		  if(temperatura <=19){
	      gato.PonerRopa(ropa);
		}else{
		 gato.SetPeso(gato.getPeso()-1);
		 gato.SetEnergia(gato.getEnergia()-1);
		  }
		}
		if(!comida.equals("") && mascota.equals("perro")){
		perro.DarComer(comida);
		if(temperatura <=19){
		perro.PonerRopa(ropa);
		
		}else{
		perro.SetPeso(perro.getPeso()-1);
		perro.SetEnergia(perro.getEnergia()-1);
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


	public static String getMascota() {
		return mascota;
	}


	public static void setMascota(String mascota) {
		Tablero.mascota = mascota;
	}


}

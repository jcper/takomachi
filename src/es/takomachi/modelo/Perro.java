package es.takomachi.modelo;

public class Perro extends Mascota implements interaccion{

	public Perro(String Nombre) {
		super(Nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DarComer(String comida) {
		if (comida.equals("Carne")){
			 this.SetPeso(this.getPeso()+ 0.50);
			 if(this.getEnergia()!=100){
			 this.SetEnergia(getEnergia()+2);
			 }
		}
	}

	@Override
	public boolean PonerRopa(String Ropa) {
		boolean puesto=false;
		if(Ropa.equals("Gorro1")){
			this.SetTemperatura(this.getTemperatura()+1.0);
			puesto=true;
		 }
		
		if(Ropa.equals("Camiseta1")){
			this.SetTemperatura(this.getTemperatura()+1.0);
			puesto=true;
		 }
		return puesto;
	}

	@Override
	public boolean QuitarRopa(String Ropa) {
		boolean puesto=false;
		if(Ropa.equals("Gorro0")){
			this.SetTemperatura(this.getTemperatura()-1.0);
			puesto=true;
		 }
		
		if(Ropa.equals("Camiseta0")){
			this.SetTemperatura(this.getTemperatura()-1.0);
			puesto=true;
		 }
		return puesto;
	}

	@Override
	public void Moverse(int x) {
       int diferencia=this.getPosicion()-x;// posicion inicial(5)-x
       if(x<this.getPosicion()){
    	   diferencia=x-this.getPosicion();
       }
	   this.SetPosicion(x);
	  
	   double perdida_peso=-diferencia*0.25;
	   int perdida_energia=-diferencia*1;
	   this.SetPeso(this.getPeso()-(perdida_peso));
	   this.SetEnergia(getEnergia()-(perdida_energia));
	}

}

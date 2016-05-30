package es.modelo.takomachi;

public class Perro extends Mascota implements interaccion{

	public Perro(String Nombre) {
		super(Nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DarComer(String comida) {
		if (comida.equals("Carne")){
		 this.SetPeso(this.getPeso()+10);
		}
	}

	@Override
	public void PonerRopa(String Ropa) {
		if(Ropa.equals("Gorro")){
			this.SetTemperatura(this.getTemperatura()+3.0);
		 }
		
		if(Ropa.equals("Camiseta")){
			this.SetTemperatura(this.getTemperatura()+5.0);
		 }
		
	}

	@Override
	public void QuitarRopa(String Ropa) {
		
		if(Ropa.equals("Gorro")){
			this.SetTemperatura(this.getTemperatura()-3.0);
		 }
		
		if(Ropa.equals("Camiseta")){
			this.SetTemperatura(this.getTemperatura()-5.0);
		 }
		
	}

	@Override
	public void Moverse(int x) {
	   this.SetPosicion(this.getPosicion()+x);
		
	}

}

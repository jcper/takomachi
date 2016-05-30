package es.modelo.takomachi;

public class Foca extends Mascota implements interaccion{
  public Foca(String Nombre) {
		super(Nombre);
		}

@Override
public void DarComer(String comida) {
	if (comida.equals("Langosta")){
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

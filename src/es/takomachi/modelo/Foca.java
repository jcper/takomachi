package es.takomachi.modelo;

public class Foca extends Mascota implements interaccion{
  public Foca(String Nombre) {
		super(Nombre);
		}

@Override
public void DarComer(String comida) {
	if (comida.equals("Langosta")){
	 this.SetPeso(this.getPeso()+ 0.50);
	 if(this.getEnergia()!=100){
	 this.SetEnergia(getEnergia()+2);
	 }
   }
}

@Override
public void PonerRopa(String Ropa) {
	if(Ropa.equals("Gorro")){
		this.SetTemperatura(this.getTemperatura()+1.0);
		
	 }
	
	if(Ropa.equals("Camiseta")){
		this.SetTemperatura(this.getTemperatura()+1.0);
	 }
	
}

@Override
public void QuitarRopa(String Ropa) {
	
	if(Ropa.equals("Gorro")){
		this.SetTemperatura(this.getTemperatura()-1.0);
	 }
	
	if(Ropa.equals("Camiseta")){
		this.SetTemperatura(this.getTemperatura()-1.0);
	 }
	
}

@Override
public void Moverse(int x) {
   this.SetPosicion(this.getPosicion()+x);
   this.SetPeso(this.getPeso()-0.25);
   this.SetEnergia(getEnergia()-2);
	
}

	
	
	
	

}

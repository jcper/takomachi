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
   int diferencia=50-x;// posicion inicial(50)-x
   double perdida_peso=diferencia*0.25;
   int perdida_energia=diferencia*2;
   this.SetPeso(this.getPeso()-perdida_peso);
   this.SetEnergia(getEnergia()-perdida_energia);
   
}

	
	
	
	

}

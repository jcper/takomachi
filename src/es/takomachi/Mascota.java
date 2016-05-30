package es.takomachi;

public class Mascota implements interaccion {
	
    private   String  nombre;                       
    private   int     peso;                        
    private   String  ropa;
    private   Double   temperatura;
    private    int    energia;
    private    int    posicion;

    public Mascota(String Nombre){
    	
    this.nombre=Nombre;
    this.peso=15;
    this.ropa="0";
    this.temperatura=19.5;
    this.energia=100;
    this.posicion=50;
    }
   
    public String getNombre(){
    	return nombre;
    }
    
    public  void SetNombre(String nombre){
    	this.nombre=nombre;
    }
    
    public String getRopa(){
    	return ropa;
    }
    
    public  void SetRopa(String ropa){
    	this.ropa=ropa;
    }
    
    public  int getPeso(){
    	return peso;
    }
    
    public  void SetPeso(int peso){
    	this.peso=peso;
    }
 
    public  int getEnergia(){
    	return energia;
    }
    
    public  void SetEnergia(int energia){
    	this.energia=energia;
    }
    
    public  int getPosicion(){
    	return posicion;
    }
    
    public  void SetPosicion(int posicion){
    	this.posicion=posicion;
    }
    
    public double getTemperatura(){
    	return temperatura;
    }
    
    public  void SetTemperatura(double temperatura){
    	this.temperatura=temperatura;
    }
    
    
	@Override
	public void DarComer(String comida) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PonerRopa(String Ropa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void QuitarRopa(String Ropa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Moverse(int x) {
		// TODO Auto-generated method stub
		
	}

}

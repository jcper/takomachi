package es.takomachi.modelo;

public class Mascota {
	
    private   String  nombre;                       
    private   double    peso;                        
    private   String  ropa;
    private   double   temperatura;
    private    int    energia;
    private    int    posicion;

    public Mascota(String Nombre){
    	
    this.nombre=Nombre;
    this.peso=15.0;
    this.ropa="0";
    this.temperatura=19.5;
    this.energia=100;
    this.posicion=5;
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
    
    public  double getPeso(){
    	return peso;
    }
    
    public  void SetPeso(double peso){
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
    
    

}

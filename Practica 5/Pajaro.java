package practica5;

class Pajaro {
	String nombre, color, tamano, poder;
	int dano, alcance;
	public Pajaro(String nombre, String color, String tamano, String poder, int dano, int alcance){
		this.nombre = nombre;
		this.color = color;
		this.tamano = tamano;
		this.poder = poder;
		this.dano = dano;
		this.alcance = alcance;	
	}
	public void setNombre(String nombre) 
	{ this.nombre = nombre; }
	public String getNombre()
	{ return nombre; }
    public void setColor(String color)
    { this.color = color; }
	public String getColor() 
	{ return color; }
    public void setTamano(String tamano) 
    { this.tamano = tamano; }
    public String getTamano() 
    { return tamano; }
    public void setPoder(String poder)
    { this.poder = poder; }
	public String getPoder()
	{ return poder; }
    public void setDano(int dano)
    { this.dano = dano; }	
	public int getDano() 
	{ return dano; }
	 public void setAlcance(int alcance)
	 { this.alcance = alcance; }			
	public int getAlcance()
	{ return alcance; }
   
}
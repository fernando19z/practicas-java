package practica8;

abstract class Veterinaria{
    protected String nombre;
    protected int edad, vacuna;

    public Veterinaria(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void Edad();
    public abstract void Comida();
    public abstract void Sonido();
	public abstract void Vacuna();
	

    public String getNombre(){return nombre;}
}
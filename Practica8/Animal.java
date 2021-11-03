package practica8;

class Animal extends Veterinaria{
    String comida;
    String sonido;
	int vacuna;

    public Animal(String nombre, int edad, String comida, String sonido, int vacuna){
        super(nombre, edad);
        this.comida = comida;
        this.sonido = sonido;
		this.vacuna = vacuna;
    }

    
    public void Edad(){
        System.out.println(nombre + " tiene " + edad + " de edad.");
    }

    
    public void Comida(){
        System.out.println(nombre + " come " + comida);
    }
    
    public void Sonido(){
        System.out.println("El sonido de " + nombre + " es: " + sonido + ".");
    }
	
	
	public void Vacuna(){
		System.out.println(nombre + " tiene " + vacuna + " vacunas.");
	}
}
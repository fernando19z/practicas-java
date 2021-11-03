package practica8;

class Caballo extends Veterinaria{

    public Caballo(String nombre, int edad){
        super(nombre, edad);
    }
	
    
    public void Edad(){
        System.out.println(nombre+" tiene "+edad+" de edad.");
    }

    
    public void Comida(){
        System.out.println(nombre+" come paja.");
    }
	
    
    public void Sonido(){
        System.out.println(nombre+" a relinchado!");
    }
	
	
	public void Vacuna(){
		System.out.println(nombre + " esta vacunado.");
	}
	
}
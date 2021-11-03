package practica8;

class Leon extends Veterinaria{

    public Leon(String nombre, int edad){
        super(nombre, edad);
    }
	
    
    public void Edad(){
        System.out.println(nombre+" tiene "+edad+" de edad.");
    }

   
    public void Comida(){
        System.out.println(nombre+" come carne cruda.");
    }
	
   
    public void Sonido(){
        System.out.println(nombre+" a rugido!");
    }
	

	public void Vacuna(){
		System.out.println(nombre + " esta vacunado.");
	}
	
}
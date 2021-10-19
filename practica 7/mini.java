package practica7;

public class mini extends Robot implements Interfaz{

    public mini(String nombre) {
	   super(nombre);
    }  
	
	public void datos(){
           System.out.println("\n\t\t[ DESCRIPCION ]\n\n El mini Dante 1 es un Robot Chef\n" +" capaz de preparar la carne y las verduras, pero \n" +" completamente inutil para cocinarlo o servirlo.\n"+"se llama mini dante porque es un pequeño ayudante\n");   	
	} 

	public void picar(){
	    System.out.println("\n > Picar y preparar ingredientes");
	}

    public mini(){
        this.nombre = "";
    } 
}

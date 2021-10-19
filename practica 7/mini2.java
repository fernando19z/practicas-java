package practica7;

public class mini2 extends Robot implements Interfaz{

    public mini2(String nombre){
	   super(nombre);
    }  
	
	public void datos(){ 
           System.out.println("\n\t     [ DESCRIPCION ]\n\n El mini Dante 2 es un Robot Chef\n" + " capaz de cocinar a la temperatura adecuadan\n" + " pero terrible con cuchillos o para servir.\n"+"se llama mini dante porque es un mini ayudante");   	
	} 

	public void cocinar(){
	    System.out.println("\n > Cocinar");	
	}

    public mini2(){
        this.nombre = "";
    } 
}
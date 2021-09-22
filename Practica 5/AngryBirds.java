package practica5;

import java.util.*;

public class AngryBirds {
	public static void main(String[] args) {
			
			Random ran = new Random(); //Genera numeros aleatorios.
			
			inicio msn = new inicio(); 
			
			Amarillo arregloAmarillo[] = new Amarillo[6]; //Primer instancia.
				arregloAmarillo[0] = new Amarillo("Chuck","","","",0,0);
				arregloAmarillo[1] = new Amarillo("","Amarillo","","",0,0);
				arregloAmarillo[2] = new Amarillo("","","Normal","",0,0);
				arregloAmarillo[3] = new Amarillo("","","","Aceleracion",0,0);
				arregloAmarillo[4] = new Amarillo("","","","",30,0);
				arregloAmarillo[5] = new Amarillo("","","","",0,ran.nextInt(200));
				
			Negro arregloNegro[] = new Negro[6]; //Segunda instancia.
				arregloNegro[0] = new Negro("Bomb","","","",0,0);
				arregloNegro[1] = new Negro("","Negro","","",0,0);
				arregloNegro[2] = new Negro("","","Grande","",0,0);
				arregloNegro[3] = new Negro("","","","Explosion",0,0);
				arregloNegro[4] = new Negro("","","","",70,0);
				arregloNegro[5] = new Negro("","","","",0,ran.nextInt(300));
				
			Rojo arregloRojo[] = new Rojo[6]; //Tercera instancia.
				arregloRojo[0] = new Rojo("Angry","","","",0,0);
				arregloRojo[1] = new Rojo("","Rojo","","",0,0);
				arregloRojo[2] = new Rojo("","","Normal","",0,0);
				arregloRojo[3] = new Rojo("","","","Ninguna",0,0);
				arregloRojo[4] = new Rojo("","","","",20,0);
				arregloRojo[5] = new Rojo("","","","",0,ran.nextInt(200));
	
			msn.Mensaje(); //Se imprime el mensaje
				
			System.out.println( "\n\n\t [EL PAJARO VELOZ]" +
								"\n\n Nombre: " + arregloAmarillo[0].getNombre() + 
								"\n Color: " + arregloAmarillo[1].getColor() + 
								"\n Tamano: " + arregloAmarillo[2].getTamano() +
								"\n Poder: " + arregloAmarillo[3].getPoder() +
								"\n Dano: " + arregloAmarillo[4].getDano() +
								"\n Alcance: " + arregloAmarillo[5].getAlcance() + " metros");	
								
			System.out.println( "\n\n\t[EL PAJARO EXPLOSIVO]" +
								"\n\n Nombre: " + arregloNegro[0].getNombre() + 
								"\n Color: " + arregloNegro[1].getColor() + 
								"\n Tamano: " + arregloNegro[2].getTamano() +
								"\n Poder: " + arregloNegro[3].getPoder() +
								"\n Dano: " + arregloNegro[4].getDano() +
								"\n Alcance: " + arregloNegro[5].getAlcance() + " metros");
			
			System.out.println( "\n\n\t[EL PAJARO BASE]" +
								"\n\n Nombre: " + arregloRojo[0].getNombre() + 
								"\n Color: " + arregloRojo[1].getColor() + 
								"\n Tamano: " + arregloRojo[2].getTamano() +
								"\n Poder: " + arregloRojo[3].getPoder() +
								"\n Dano: " + arregloRojo[4].getDano() +
								"\n Alcance: " + arregloRojo[5].getAlcance() + " metros");
	
			

	}
}

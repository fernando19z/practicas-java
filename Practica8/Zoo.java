package practica8;

import java.util.*;

public class Zoo{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
		
		String nom;
        int tamano = 1;
        char tecla;
        int aux = 0;

        Veterinaria animal[] = new Veterinaria[10];
		
			animal[0] = new Leon("Alex", 15);
			animal[1] = new Caballo("pegasus", 8);
			
		System.out.print("\n __________________________");
        System.out.print("\n\n     Bienvenido al ZOO");
		System.out.print("\n __________________________");
        System.out.println("\n");
			
        do{
			System.out.print("\n\t[ Menu ]");
            System.out.print("\n\n");
            System.out.println(" 1. Consultar animales");
            System.out.println(" 2. Agregar animal nuevo");
            System.out.println(" 3. Borrar un animal");
            System.out.println(" 4. Salir");
            System.out.print("\nSeleccione una opcion: ");
    
            tecla = sc.next().charAt(0);
            System.out.print("\n");
    
            switch(tecla){
				case '1': for(int i=0; i<=tamano; i++){
							animal[i].Edad();
                            animal[i].Comida();
                            animal[i].Sonido();
							animal[i].Vacuna();
                            System.out.println();
                          }
                          break;

                case '2': sc.nextLine();
                          System.out.print("Ingrese el nombre: ");
                          String nombre = sc.nextLine();
                          System.out.print("Ingrese la edad: ");
					      int edad = sc.nextInt();
                          sc.nextLine();
                          System.out.print("Ingrese la comida que come: ");
                          String comida = sc.nextLine();
                          System.out.print("Ingrese el sonido que hace: ");
                          String sonido = sc.nextLine();
						  System.out.print("Ingrese el total de vacunas que tiene: ");
                          int vacuna = sc.nextInt();
                          System.out.println();      
                          tamano++;
                          animal[tamano] = new Animal(nombre, edad, comida, sonido, vacuna);
                          break;

                case '3': System.out.print("Que animal desea borrar?: ");
                          sc.nextLine();
                          nom = sc.nextLine();
                
                          for(int i=0; i<=tamano; i++){
							  if(animal[i].getNombre().equalsIgnoreCase(nom)){
								  animal[i] = animal[i+1];
                                  tamano--;
                                  aux = 1;
                                        
                              }else{
								  aux = 0;
								  }

                          }
						  
						  if(aux == 1){
							  System.out.println("Borrado exitoso");
                          }else{
							  System.out.println("Borrado fallido, nombre no encontrado");
                            }
						  break;

                case '4': System.exit(0); break;           
                    
            }

                System.out.println("\nDesea seguir jugando con los animales? (Si/No)");
                    tecla = sc.next().charAt(0);      

        }while(tecla == 's' || tecla == 'S');        
    }
}
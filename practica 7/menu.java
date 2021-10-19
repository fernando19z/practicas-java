package practica7;
import java.util.Scanner;
import java.util.InputMismatchException;

public class menu {
public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		boolean salir = false; //Salir del programa
		boolean salir2 = false; //Regresar 
		boolean salir3 = false; //Regresar    
		boolean salir4 = false; //Regresar        
		int opcion;

		Robot rob1 = new Robot("Rob");
		mini rob2 = new mini("Dante 1");  
		mini2 rob3 = new mini2("Dante 2");  

		System.out.print("\n _______________");
		System.out.print("\n\n  ROBOTS CHEF  ");	
	    System.out.print("\n _______________");
	    System.out.print("\n\nPresiona ENTER para continuar...");	
	    sc.nextLine();

		while(!salir){  
			System.out.println("\n\t  ROBOTS \n");
			System.out.println("1. Usar Rob");
			System.out.println("2. Usar mini Dante 1");
			System.out.println("3. Usar Mini Dante 2");
			System.out.println("4. Salir de ROBOTS CHEF");     
			
			try{ 
				System.out.print("\nElije un robot: ");
				opcion = sc.nextInt();
				sc.nextLine();

				switch(opcion){ 
					case 1: System.out.print("\n ___________________");
							System.out.print("\n\n   > Rob <");
							System.out.print("\n ___________________");
							System.out.print("\n\n Presiona ENTER para conocer a Rob...");
							sc.nextLine();

							System.out.println("\n\t  HABILIDAD ");
							rob1.picar();	 
							rob1.cocinar();	
							rob1.servir();  
							
							if (rob1 instanceof Robot)
							((Robot) rob1 ).datos();

							System.out.println("\n Presiona ENTER para entrar a la cocina...");
							sc.nextLine();

							while(!salir2){
								System.out.println("\n\t [ COCINA ]\n");
							    System.out.println("1. Cocinar");
							    System.out.println("2. Regresar");  

							    try{
									System.out.print("\n Elige una opcion: ");
									opcion = sc.nextInt();
									sc.nextLine();

									switch(opcion){ 
										case 1: System.out.println("\n " + rob1.getNombre() + " esta preparando los ingredientes...  ");   
												sc.nextLine();                 
												System.out.println("\n " + rob1.getNombre() + " esta cocinando... ");
												sc.nextLine();                       
												System.out.println("\n " + rob1.getNombre() + " esta sirviendo el platillo... ");
												sc.nextLine();    
												System.out.println("\n El platillo esta TERMINADO!!!  ");  
												System.out.println("\n HURRA!!! - El platillo estaba delicioso!");
											    System.out.println("\n\n Presiona ENTER para salir");
												sc.nextLine();                   
												break;
									
										case 2: salir2 = true; 
												break;
				 
										default: System.out.println("Favor de elegir una opcion entre 1 y 2");
									}
								}
								
								catch(InputMismatchException e){ 
										System.out.println("ERROR!!! - Favor de ingresar un NUMERO");
										System.out.println("Presiona ENTER para continuar...");	
										sc.nextLine();
								}
							} 
							break;

					case 2: System.out.print("\n __________________________");
							System.out.print("\n\n      Dante 1");
							System.out.print("\n __________________________");
						    System.out.print("\n\n Presiona ENTER para conocer al Dante 1 ...");
						    sc.nextLine();
							
							System.out.println("\n\t [ HABILIDAD ]");
							rob2.picar();	 
							if (rob2 instanceof mini)
							((mini) rob2 ).datos(); 

							System.out.println("\n Presiona ENTER para entrar a la cocina...");
							sc.nextLine();

							while(!salir3){
								System.out.println("\n\t [ COCINA ]\n");
							    System.out.println("1. Cocinar");
							    System.out.println("2. Regresar");  

								try{
									System.out.print("\n Elige una opcion: ");
									opcion = sc.nextInt();
									sc.nextLine();

									switch(opcion){ 
										case 1: System.out.println("\n " + rob2.getNombre() + " esta preparando los ingredientes...");   
												sc.nextLine();                 
												System.out.println("\n " + rob2.getNombre() + " solo puede picar!!");
												sc.nextLine();                       
												System.out.println("\n El platillo NO esta terminado!!!");
												System.out.println("\n Necesitamos ayuda!");
												System.out.println("\n\n Presiona ENTER para salir");
												sc.nextLine();                      
												break;
									
										case 2: salir3 = true; 
												break;
				 
										default: System.out.println("Favor de elegir una opcion entre 1 y 2");
									}
								}
								
								catch(InputMismatchException e){ 
									System.out.println("ERROR!!! - Favor de ingresar un NUMERO");
									System.out.println("Presiona ENTER para continuar...");	
									sc.nextLine();
								}
							} 
							break;  

					case 3: System.out.print("\n __________________________");
					        System.out.print("\n\n      Dante 2");
							System.out.print("\n __________________________");
						    System.out.print("\n\n Presiona ENTER para conocer al Dante 2...");
						    sc.nextLine();

							System.out.println("\n\t [ HABILIDAD ]");
							rob3.cocinar();	  
							if (rob3 instanceof mini2)
							((mini2) rob3 ).datos(); 

							System.out.println("\n Presiona ENTER para entrar a la cocina...");
							sc.nextLine();

							while(!salir4){
								System.out.println("\n\t [ COCINA ]\n");
							    System.out.println("1. Cocinar");
							    System.out.println("2. Regresar");  

							    try{
									System.out.print("\n Elige una opcion: ");
								    opcion = sc.nextInt();
								    sc.nextLine();

								    switch(opcion){ 
										case 1: System.out.println("\n " + rob3.getNombre() + " no puede preparar los ingredientes...  ");   
												sc.nextLine(); 
												System.out.println("\n " + rob3.getNombre() + " solo puede cocinar!!");
												sc.nextLine();  
												System.out.println("\n El platillo NO esta terminado!!");  
												System.out.println("\n Necesitamos ayuda!");
												System.out.println("\n\n Presiona ENTER para salir");
												sc.nextLine();                      
												break;
									
										case 2: salir4 = true; 
												break;
				 
										default: System.out.println("Favor de elegir una opcion entre 1 y 2");
									}
								}
								
								catch(InputMismatchException e){ //NO escribir letras//
									System.out.println("ERROR!!! - Favor de ingresar un NUMERO");
									System.out.println("Presiona ENTER para continuar...");	
									sc.nextLine();
								}
							} 
							break;

					case 4: salir = true; 
							break;

					default: System.out.println("Favor de elegir una opcion entre 1 y 4");
				}
			}
			
			catch(InputMismatchException e){
				System.out.println("ERROR!!! - Favor de ingresar un NUMERO");
				System.out.println("Presiona ENTER para continuar...");	
				sc.nextLine();
			}
		}
	}

}

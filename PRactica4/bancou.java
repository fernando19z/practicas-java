package practica4;

import java.util.Scanner;

public class bancou {
	 public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
	        
			int pin, i = 0;
			char tecla;
			boolean salir = false;

			
	        Cuenta usuario = Banco.CapturaDatos();

	        System.out.println("\n 1. Consultar estado de la cuenta existente");
	        System.out.println(" 2. Crear nueva cuenta");
			System.out.println(" 3. Salir");
	        System.out.print("\nSeleccione una opcion: ");
	        tecla = sc.next().charAt(0);
	        System.out.print("\n");
				  
			switch(tecla){
				case '1': do{
							i++;
							if(i == 1){
							System.out.print("Para consultar cuenta Ingrese su PIN: ");
							pin = sc.nextInt();
								}else{
									System.out.print("\n\t____________________");
									System.out.print("\n\t|-SU PIN ES INCORRECTO-|");
									System.out.print("\n\t____________________");
									System.out.print("\n\nIngrese su PIN: ");
									pin = sc.nextInt();
								}	 
							}while(Banco.VerificarPin(usuario,pin) == 0);
									
							if(pin == usuario.getPin()){
								do{
								System.out.print("\n");
								System.out.print("\t\t-- MENU --\n");
								System.out.println("\n 1. Consultar Saldo");
								System.out.println(" 2. Retirar Saldo");
								System.out.println(" 3. Abonar Saldo");
								System.out.println(" 4. Salir");
								System.out.print("\nSeleccione una opcion: ");
								tecla = sc.next().charAt(0);
								System.out.print("\n");
									
							switch(tecla){ 
								case '1': Banco.ConsultaSaldo(usuario); 
								break;
														
								case '2': System.out.print("Ingrese la cantidad que desea retirar: ");
										  float cantidad = sc.nextFloat();
							     		  Banco.RetirarSaldo(usuario,cantidad); 
							     		  break;
									
								case '3': System.out.print("Ingrese la cantidad que desea abonar: ");
										  float cantidad1 = sc.nextFloat();
										  Banco.IngresaSaldo(usuario,cantidad1);
										  break;
									
								case '4': System.exit(0); break;
									}	
					
								System.out.println("\nDesea hacer otra operacion? (S/N)");
								tecla = sc.next().charAt(0);
					
								}while(tecla == 's' || tecla == 'S');
									
							}
											
								break;
											
				case '2': System.out.println("\nIngrese los datos de la nueva cuenta");
						  usuario = Banco.CapturaDatos();
								  
						  System.out.println("\n 1. Consultar estado de la cuenta existente");
						  System.out.println(" 2. Salir");
						  System.out.print("\nSeleccione una opcion: ");
						  tecla = sc.next().charAt(0);
						  System.out.print("\n");
							  
							switch(tecla){
								case '1': do{
											i++;
											if(i == 1){
											System.out.print("Ingrese su PIN: ");
											pin = sc.nextInt();
													}else{
														System.out.print("\n\t____________________");
														System.out.print("\n\t|SU PIN ES INCORRECTO|");
														System.out.print("\n\t____________________");
														System.out.print("\n\nIngrese su PIN: ");
														pin = sc.nextInt();
														}	 
											}while(Banco.VerificarPin(usuario,pin) == 0);
									
											if(pin == usuario.getPin()){
												
											do{
												System.out.print("\n");
												System.out.print("\t\t-- MENU -- \n");
												System.out.println("\n 1. Consultar Saldo");
												System.out.println(" 2. Retirar Saldo");
												System.out.println(" 3. Abonar Saldo");
												System.out.println(" 4. Salir");
												System.out.print("\nSeleccione una opcion: ");
												tecla = sc.next().charAt(0);
												System.out.print("\n");
									
											switch(tecla){
												case '1': Banco.ConsultaSaldo(usuario);
												break;
														
												case '2': System.out.print("Ingrese la cantidad a retirar: ");
														  float cantidad = sc.nextFloat();
														  Banco.RetirarSaldo(usuario,cantidad);
														  break;
									
												case '3': System.out.print("Ingrese la cantidad a abonar: ");
														  float cantidad1 = sc.nextFloat();
														  Banco.IngresaSaldo(usuario,cantidad1);
														  break;
									
												case '4': System.exit(0); 
												break;
												}	
						
												System.out.println("\nDesea hacer otra operacion? (S/N)");
												tecla = sc.next().charAt(0);
							
												}while(tecla == 's' || tecla == 'S');
										
											}
												
											break;
											
								case '2': System.exit(0); ;
										  break;
							}
							  		
				case '3': System.exit(0); ;
							  break;	
			}
		}
	} 

	class Banco{
	    
	    public static Cuenta CapturaDatos(){

	        String nombre;
	        float saldo;
	        int pin;

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Ingrese su Nombre: ");
	        nombre = sc.nextLine();
	        System.out.print("Ingrese su Saldo Inicial: ");
	        saldo = sc.nextFloat();
	        System.out.print("Ingrese su PIN: ");
	        pin = sc.nextInt();

	        Cuenta usuario = new Cuenta(nombre,saldo,pin);

	        return usuario;
	    }

	    public static void ConsultaSaldo(Cuenta usuario){

	        System.out.println("Saldo actual: "+usuario.getSaldo());
	     }

	     public static void RetirarSaldo(Cuenta usuario,float cantidad){

	        if(cantidad > usuario.getSaldo()){

	            System.out.println("Saldo Insuficiente");
	        } 
	        else{
	            
	            usuario.setSaldo(usuario.getSaldo() - cantidad);
	            System.out.println("Nuevo Total: " + usuario.getSaldo());
	        }
	    
	    }

	    public static void IngresaSaldo(Cuenta usuario, float cantidad){

	        usuario.setSaldo(usuario.getSaldo()+cantidad);
	        System.out.println("Nuevo Total: "+usuario.getSaldo());
	    }

	    public static int VerificarPin(Cuenta usuario, int pin){

	        if(pin == usuario.getPin()){

	            return 1;
	        
	        } else return 0;

	    }

	}

	class Cuenta extends Banco {

	    private String nombre;
	    private float saldo;
	    private int pin;

	    public Cuenta(String nombre, float saldo, int pin){
	        this.nombre = nombre;
	        this.saldo = saldo;
	        this.pin = pin;

	    }
		
	    public void setNombre(String nombre){this.nombre = nombre;}
	    public String getNombre(){return nombre;}
	    public void setSaldo(float saldo){this.saldo = saldo;}
	    public float getSaldo(){return saldo;}
	    public void setPin(int pin){this.pin = pin;}
	    public int getPin(){return pin;}    
	}



import java.util.Scanner;

public class generaador {
	
	

	public static void main(String[] args) {
		
		int opc;
		char Am = 0;
		char n = 0;
		char n3 = 0;
		char Ap = 0;
		String detener;
		
		do {
			Scanner scn = new Scanner(System.in);
			System.out.println("---- MENU -------");
			System.out.println("1. CURP");
			System.out.println("2. RFC");
			System.out.println("3. Salir");
			System.out.println("Ingrese opcion");
			opc = scn.nextInt();
			switch(opc) {
				case 1:
					CURP cu = new CURP( CapturaEntrada.capturarCadena("ingrese el nombre sin apellidos"),CapturaEntrada.capturarCadena("ingrese apellido paterno"),CapturaEntrada.capturarCadena("ingrese apellido materno"),CapturaEntrada.capturarCadena("ingrse genero(H o M)"),CapturaEntrada.capturarCadena("ingrese su año de nacimiento"),CapturaEntrada.capturarCadena("ingresa mes de nacimiento en numero"),CapturaEntrada.capturarCadena("ingresa dia de nacimiento"),CapturaEntrada.capturarCadena("ingrese entidad federativa(ejem:BC)"));
					
					 String nom = cu.getNombre().toUpperCase();
					 String app = cu.getApellidop().toUpperCase();
					 String apm = cu.getApellidom().toUpperCase();
					 String sex = cu.getSexo().toUpperCase();
					 
					 
					 for(int y=0;y < 2; y++) {
					
						 for( int i=1; i < nom.length();i++) {
						 	char l = nom.charAt(i);
						 	if(l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U' || l != ' ');{
							 	n =l;
							 	break;
						 	}
					 	}
					 
					 	for( int i=2; i < nom.length();i++) {
						 	char m = nom.charAt(i);
						 	if(m != 'A' || m!= 'E' || m != 'I' || m != 'O' || m != 'U' || m !=' ');{
							 	n3= m;
							 	break;
						 	}
						 
					 	}
					 
					 	for( int i=2; i < app.length();i++) {
						 	char ap = app.charAt(i);
						 	if(ap != 'A' || ap != 'E' || ap != 'I' || ap != 'O' || ap != 'U' || ap != ' ');{
							 	Ap= ap;
							 	break;
						 		}
						 
					 		}
					 
					 	for( int i=2; i < apm.length();i++) {
						 	char am = apm.charAt(i);
						 	if(am != 'A' || am != 'E' || am != 'I' || am != 'O' || am != 'U' || am != ' ');{
							 		Am= am;
							 		break;
						 		}
					 		}
						 
					 	}
					 
					 	int numero = (int)(Math.random()*9+1);
					 		String num= String.valueOf(numero);
							 char nr1=num.charAt(0);
					 
					 	numero = (int)(Math.random()*9+1);
					 			String num2= String.valueOf(numero);
							 char nr2=num2.charAt(0);
							
								System.out.println("CURP:"+nom.charAt(0)+n+app.charAt(0)+apm.charAt(0)+cu.getFechaa().charAt(2)+cu.getFechaa().charAt(3)+cu.getFecham()+cu.getFechad()+cu.getFecham()+cu.getFechad()+sex+cu.getLugarn()+n3+Ap+Am+nr1+nr2);
								System.out.println("ingrese cualquier numero para continuar:");
								detener = scn.next();

						
					
							break;
					case 2:
						RFC rf = new RFC( CapturaEntrada.capturarCadena("ingrese el nombre sin apellidos"),CapturaEntrada.capturarCadena("ingrese apellido paterno"),CapturaEntrada.capturarCadena("ingrese apellido materno"),CapturaEntrada.capturarCadena("ingrese su año de nacimiento"),CapturaEntrada.capturarCadena("ingresa mes de nacimiento en numero"),CapturaEntrada.capturarCadena("ingresa dia de nacimiento"));
		
						String nom1 = rf.getNombre().toUpperCase();
						String app1 = rf.getApellidop().toUpperCase();
						String apm1 = rf.getApellidom().toUpperCase();
						
					
						System.out.println("RFC:"+app1.charAt(0)+app1.charAt(1)+apm1.charAt(0)+nom1.charAt(0)+rf.getFechaa().charAt(2)+rf.getFechaa().charAt(3)+rf.getFecham()+rf.getFechad());
						System.out.println("ingrese cualquier numero para continuar:");
						detener = scn.next();
					
						break;
					case 3:
						break;
				}
		
				
		
		}while(opc !=3);
		
		
 

	}
}

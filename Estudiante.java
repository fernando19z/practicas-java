
public class Estudiante {

	public static void main(String[] args) {
		int dato = 60;
		Alumno als[] = new Alumno[5];
		Alumno als1 = new Alumno("fernando",1257579,"computacion",65);
		Alumno als2 = new Alumno("daniela",1247875,"artes plasticas",95);
		Alumno als3 = new Alumno("hector",1247578,"modelaje 3D",43);
		Alumno als4 = new Alumno("isra",1245754,"derecho romano",59);
		Alumno als5 = new Alumno("katya",1245875,"artes plasticas",69);
		
		System.out.println("Datos para als: ");
		for(int i = 0; i < als.length; i++){
		 als[i] = new Alumno(CapturaEntrada.capturarCadena("Introduce nombre "), CapturaEntrada.capturarEntero("Introduce matricula "), CapturaEntrada.capturarCadena("Introduce Materia "),CapturaEntrada.capturarEntero("Introduce Calificacion"));
		}
			

		System.out.println("Datos de als: ");
		for(int j = 0; j < als.length; j++){
				System.out.println("\nNombre:" + "[" + j + "]: " + als[j].getNombre());
				System.out.println("Matricula" + "[" + j + "]: " + als[j].getMatricula());
				System.out.println("Materia:" + "[" + j + "]: " + als[j].getMateria());
				System.out.println("calificacion:" + "[" + j + "]: " + als[j].getCalificacion());
				if(als[j].getCalificacion() >= dato ) {
				System.out.println("aprovado");
				}else {
					System.out.println("reprovado");
				}
			}
			System.out.println("\nNombre:" + als1.getNombre());
			System.out.println("Matricula" + als1.getMatricula());
			System.out.println("Materia:" + als1.getMateria());
			System.out.println("calificacion:" + als1.getCalificacion());
			if(als1.getCalificacion() >= dato ) {
			System.out.println("aprovado");
			}else {
				System.out.println("reprovado");
			}
			System.out.println("\nNombre:" + als2.getNombre());
			System.out.println("Matricula" + als2.getMatricula());
			System.out.println("Materia:" + als2.getMateria());
			System.out.println("calificacion:" + als2.getCalificacion());
			if(als2.getCalificacion() >= dato ) {
			System.out.println("aprovado");
			}else {
				System.out.println("reprovado");
			}
			System.out.println("\nNombre:" + als3.getNombre());
			System.out.println("Matricula" + als3.getMatricula());
			System.out.println("Materia:" + als3.getMateria());
			System.out.println("calificacion:" + als3.getCalificacion());
			if(als3.getCalificacion() >= dato ) {
			System.out.println("aprovado");
			}else {
				System.out.println("reprovado");
			}
			System.out.println("\nNombre:" + als4.getNombre());
			System.out.println("Matricula" + als4.getMatricula());
			System.out.println("Materia:" + als4.getMateria());
			System.out.println("calificacion:" + als4.getCalificacion());
			if(als4.getCalificacion() >= dato ) {
			System.out.println("aprovado");
			}else {
				System.out.println("reprovado");
			}
			System.out.println("\nNombre:" + als5.getNombre());
			System.out.println("Matricula" + als5.getMatricula());
			System.out.println("Materia:" + als5.getMateria());
			System.out.println("calificacion:" + als5.getCalificacion());
			if(als5.getCalificacion() >= dato ) {
			System.out.println("aprovado");
			}else {
				System.out.println("reprovado");
			}
		

	}

}

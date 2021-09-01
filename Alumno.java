

public class Alumno {
			String nombre;
			int matricula;
			String materia;
			int calificacion;
			
			

			public Alumno(String nombre, int matricula, String materia,int calificacion) {
				setNombre(nombre);
				setMatricula(matricula);
				setMateria(materia);
				setCalificacion(calificacion);
				
				

			}
			
			private void setCalificacion(int calificacion) {
				this.calificacion = calificacion;
				
			}

			

			private void setMateria(String materia) {
				this.materia = materia;
				
			}

		
			private void setMatricula(int matricula) {
				this.matricula = matricula;
				
			}
			
			
			public void setNombre(String nombre){
				this.nombre = nombre;
				
			}
			
			public String getMateria() {
				return materia;
			}
			
			public int getMatricula() {
				return matricula;
			}
			public String getNombre(){
				return nombre;
			}
			public int getCalificacion() {
				return calificacion;
			}
}

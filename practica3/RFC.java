
public class RFC {
	String nombre;
	String apellidop;
	String apellidom;
	String fechaa;
	String fecham;
	String fechad;
	
	
	public RFC(String nombre, String apellidop, String apellidom,String fechaa,String fecham, String fechad) {
		
		setNombre(nombre);
		
		setApellidop(apellidop);
		
		setApellidom(apellidom);
		
	
		
		setFechaa(fechaa);
		
		setFecham(fecham);
		
		setFechad(fechad);
		 
	
	}

	
	
	private void setFechad(String fechad) {
		this.fechad = fechad;
		
	}
	
	public String getFechad() {
		return fechad;
	}



	private void setFecham(String fecham) {
		this.fecham = fecham;
		
	}
	public String getFecham() {
		return fecham;
	}



	private void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setApellidop(String apellidop) {
		this.apellidop = apellidop;
		
	}
	
	public String getApellidop() {
		return apellidop;
	}

	private void setApellidom(String apellidom) {
		this.apellidom = apellidom;
		
	}
	
	public String getApellidom() {
		return apellidom;
	}


	private void setFechaa(String fechaa) {
		this.fechaa = fechaa;
		
	}
	
	public String getFechaa() {
		return fechaa;
	}

	
}

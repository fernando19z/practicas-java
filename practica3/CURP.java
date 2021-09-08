
public class CURP {
	String nombre;
	String apellidop;
	String apellidom;
	String sexo;
	String fechaa;
	String fecham;
	String fechad;
	String lugarn;
	
	public CURP(String nombre, String apellidop, String apellidom, String sexo,String fechaa,String fecham, String fechad, String lugarn) {
		
		setNombre(nombre);
		
		setApellidop(apellidop);
		
		setApellidom(apellidom);
		
		setSexo(sexo);
		
		setFechaa(fechaa);
		
		setFecham(fecham);
		
		setFechad(fechad);
		 
		setLugarn(lugarn);
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

	private void setSexo(String sexo) {
		this.sexo = sexo;
		
	}
	
	public String getSexo() {
		return sexo;
	}

	private void setFechaa(String fechaa) {
		this.fechaa = fechaa;
		
	}
	
	public String getFechaa() {
		return fechaa;
	}

	private void setLugarn(String lugarn) {
		this.lugarn = lugarn;
		
	}
	
	public String getLugarn() {
		return lugarn;
	}

}

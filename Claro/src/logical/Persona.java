package logical;

public abstract class Persona {
	


	private String nombre;
	private int edad;
	private String nacionalidad;
	private String cedula;
	private String sexo;

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	public Persona(String nombre, int edad, String nacionalidad, String cedula, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.cedula = cedula;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}

package logical;

public class Contrato {
	
	private String nombre;
	private String cedula;
	private int edad;
	private String noContrato;
	private String direccion;
	private String sexo;
	
	public Contrato() {
		// TODO Auto-generated constructor stub
	}
	public Contrato(String nombre, String cedula, int edad, String noContrato, String direccion, String sexo) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.noContrato = noContrato;
		this.direccion = direccion;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNoContrato() {
		return noContrato;
	}
	public void setNoContrato(String noContrato) {
		this.noContrato = noContrato;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}

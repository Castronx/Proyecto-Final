package logical;

public class Tecnico extends Empleado {
	
	private String dominio; //puede ser tecnico de datacenter o tecnico de cableado, o tecnico de informatica

	public Tecnico(String nombre, int edad, String nacionalidad, String cedula, String sexo, float sueldo) {
		super(nombre, edad, nacionalidad, cedula, sexo);
		// TODO Auto-generated constructor stub
	}
	
	public Tecnico(String dominio) {
		super();
		this.dominio = dominio;
	}


	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

}

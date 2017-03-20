package logical;

public class Clientes extends Persona {
	


	private String numContrato;

	public Clientes() {
		// TODO Auto-generated constructor stub
	}
	public Clientes(String numContrato) {
	super();
	this.numContrato = numContrato;
	}

	public Clientes(String nombre, int edad, String nacionalidad, String cedula, String sexo) {
		super(nombre, edad, nacionalidad, cedula, sexo);
		// TODO Auto-generated constructor stub
	}

	public String getNumContrato() {
		return numContrato;
	}

	public void setNumContrato(String numContrato) {
		this.numContrato = numContrato;
	}

}

package logical;

public class Contrato extends Clientes {
	
	private String numContrato;

	public Contrato() {
		// TODO Auto-generated constructor stub
	}

	public Contrato(String numContrato) {
		super(numContrato);
		// TODO Auto-generated constructor stub
	}

	public Contrato(String nombre, int edad, String nacionalidad, String cedula, String sexo) {
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

package logical;

public class Clientes extends Persona {
	

    private Planes[] plan;
	private String numContrato;

	public Clientes() {
		// TODO Auto-generated constructor stub
	}
	public Clientes(String numContrato, Planes[] plan) {
	super();
	this.numContrato = numContrato;
	this.plan = plan;
	}

	public Clientes(String nombre, int edad, String nacionalidad, String cedula, String sexo) {
		super(nombre, edad, nacionalidad, cedula, sexo);
		// TODO Auto-generated constructor stub
	}

	public Planes[] getPlan() {
		return plan;
	}
	public void setPlan(Planes[] plan) {
		this.plan = plan;
	}
	public String getNumContrato() {
		return numContrato;
	}

	public void setNumContrato(String numContrato) {
		this.numContrato = numContrato;
	}

}

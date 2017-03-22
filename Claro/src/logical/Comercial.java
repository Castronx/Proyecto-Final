package logical;

public class Comercial extends Empleado {
	private String areaDeTrabajo; //donde que trabaja


	public Comercial(String areaDeTrabajo) {
		super();
		this.areaDeTrabajo = areaDeTrabajo;
	}

	public Comercial(float sueldo) {
		super(sueldo);
		// TODO Auto-generated constructor stub
	}

	public Comercial(String nombre, int edad, String nacionalidad, String cedula, String sexo) {
		super(nombre, edad, nacionalidad, cedula, sexo);
		// TODO Auto-generated constructor stub
	}

	public String getAreaDeTrabajo() {
		return areaDeTrabajo;
	}

	public void setAreaDeTrabajo(String areaDeTrabajo) {
		this.areaDeTrabajo = areaDeTrabajo;
	}


}

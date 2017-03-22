package logical;

public class Empleado extends Persona {
	
	private float sueldo;
	

	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	public Empleado(float sueldo) {
			super();
			this.sueldo = sueldo;
		}

	public Empleado(String nombre, int edad, String nacionalidad, String cedula, String sexo) {
		super(nombre, edad, nacionalidad, cedula, sexo);
		// TODO Auto-generated constructor stub
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}

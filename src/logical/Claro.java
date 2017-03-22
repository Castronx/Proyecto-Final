package logical;

import java.util.ArrayList;

public class Claro {
	
	private ArrayList<Factura> misFacturas;
	private ArrayList<Clientes> misClientes;
	private ArrayList<Empleado> misEmpleados;
	private ArrayList<Contrato> misContratos;

	public Claro() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Claro(ArrayList<Factura> misFacturas, ArrayList<Clientes> misClientes, ArrayList<Empleado> misEmpleados,
			ArrayList<Contrato> misContratos) {
		super();
		this.misFacturas = misFacturas;
		this.misClientes = misClientes;
		this.misEmpleados = misEmpleados;
		this.misContratos = misContratos;
	}


	public ArrayList<Factura> getMisFacturas() {
		return misFacturas;
	}

	public void setMisFacturas(ArrayList<Factura> misFacturas) {
		this.misFacturas = misFacturas;
	}

	public ArrayList<Clientes> getMisClientes() {
		return misClientes;
	}

	public void setMisClientes(ArrayList<Clientes> misClientes) {
		this.misClientes = misClientes;
	}

	public ArrayList<Empleado> getMisEmpleados() {
		return misEmpleados;
	}

	public void setMisEmpleados(ArrayList<Empleado> misEmpleados) {
		this.misEmpleados = misEmpleados;
	}

	public ArrayList<Contrato> getMisContratos() {
		return misContratos;
	}

	public void setMisContratos(ArrayList<Contrato> misContratos) {
		this.misContratos = misContratos;
	}
	public void insertarCliente(Clientes cliente){
		this.misClientes.add(cliente);
	}
	public void removerCliente(Clientes cliente){
		this.misClientes.remove(cliente);
	}
	public void insertarEmpleado(Empleado empleado){
		this.misEmpleados.add(empleado);
	}
	public void removerEmpleado(Empleado empleado){
		this.misEmpleados.remove(empleado);
	}
	public void insertarContrato(Contrato contrato){
		this.misContratos.add(contrato);
	}
	public void removerContrato(Contrato contrato){
		this.misContratos.remove(contrato);
	}
	
}

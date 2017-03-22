package logical;

public class Factura {
	
	
	private Clientes []cliente; //arreglo de clientes
	private String numFactura;

	public Factura() {
		// TODO Auto-generated constructor stub
	}
	public Factura(Clientes[] cliente, String numFactura) {
		super();
		this.cliente = cliente;
		this.numFactura = numFactura;
	}

	public Clientes[] getCliente() {
		return cliente;
	}
	public void setCliente(Clientes[] cliente) {
		this.cliente = cliente;
	}
	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}
	

}

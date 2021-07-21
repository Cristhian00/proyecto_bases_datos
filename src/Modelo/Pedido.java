package Modelo;

public class Pedido {
	private int referencia;
	private int valor;
	private Cliente idCliente; 

	public Pedido(int referencia, int valor) {
		super();
		this.referencia = referencia;
		this.valor = valor;
	}


	//***********************************GETS AND SETS*******************************
	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Pedido [referencia=" + referencia + ", valor=" + valor + ", idCliente=" + idCliente + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (referencia != other.referencia)
			return false;
		if (valor != other.valor)
			return false;
		return true;
	}
	
	

}

/*
 * referencia NUMBER valor NUMBER F * Cliente_cedula NUMBER F *
 * Rutas_Ditribuidor_Distribuidor_numPlaca NUMBER F *
 * Rutas_Ditribuidor_Ruta_refere
 */

package Modelo;

public class Cliente {

	private int cedula;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String direccion;
	private String tipoCliente; // Se refiere si es persona natural o juridica
	private Ciudad Ciudad; 

	
	public Cliente(int cedula, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String direccion, String tipoCliente, Ciudad ciudad) {
		super();
		this.cedula = cedula;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.direccion = direccion;
		this.tipoCliente = tipoCliente;
		Ciudad = ciudad;
	}

	/*
	 * Métodos Gets y sets
	 */
	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}



	public Ciudad getCiudad() {
		return Ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		Ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre
				+ ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", direccion="
				+ direccion + ", tipoCliente=" + tipoCliente + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (Ciudad == null) {
			if (other.Ciudad != null)
				return false;
		} else if (!Ciudad.equals(other.Ciudad))
			return false;
		if (cedula != other.cedula)
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (primerApellido == null) {
			if (other.primerApellido != null)
				return false;
		} else if (!primerApellido.equals(other.primerApellido))
			return false;
		if (primerNombre == null) {
			if (other.primerNombre != null)
				return false;
		} else if (!primerNombre.equals(other.primerNombre))
			return false;
		if (segundoApellido == null) {
			if (other.segundoApellido != null)
				return false;
		} else if (!segundoApellido.equals(other.segundoApellido))
			return false;
		if (segundoNombre == null) {
			if (other.segundoNombre != null)
				return false;
		} else if (!segundoNombre.equals(other.segundoNombre))
			return false;
		if (tipoCliente == null) {
			if (other.tipoCliente != null)
				return false;
		} else if (!tipoCliente.equals(other.tipoCliente))
			return false;
		return true;
	}
	
	

}

/*
 * cedula NUMBER primernombre VARCHAR2 (20) segundoNombre VARCHAR2 (20)
 * primerApellido VARCHAR2 (20) segundoApellido VARCHAR2 (20) direccion VARCHAR2
 * (20) tipoCliente VARCHAR2 (20) Column_8 UNKNOWN F * Ciudad_codigo N
 */
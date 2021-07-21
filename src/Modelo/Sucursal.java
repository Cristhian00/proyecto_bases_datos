package Modelo;

public class Sucursal {

	private int codigo;
	private String nombre;
	private int codigoPostal;
	private Ciudad ciudad;

	public Sucursal(int codigo, String nombre, int codigoPostal, Ciudad ciudad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
	}
	
	//*************************GETS AND SETS**********************************

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}
/*
 * codigo NUMBER 
 * nombre VARCHAR2 (200) 
 * codigoPostal 
 * NUMBER direccion VARCHAR2
 * (20) F * Ciudad_codigo NUMBER
 */
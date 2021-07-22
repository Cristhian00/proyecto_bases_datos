package Controlador;

import java.util.ArrayList;
import java.util.List;

import Modelo.Ciudad;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Pedido;
import Modelo.Sucursal;

public class Principal {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Empleado> empleados = new ArrayList<Empleado>();
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	private List<Sucursal> sucursales = new ArrayList<Sucursal>();
	private List<Ciudad> ciudades = new ArrayList<Ciudad>();

	// ***************************CREATE**************************************
	public Empleado crearEmpleado(int cedula, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String direccion, Ciudad ciudad, int genero, String cargo) {

		if (buscarCliente(cedula) != null) {
			System.out.println("ERROR: Ya existe un empleado con cédula " + cedula);
			return null;
		}
		Empleado nuevoEmpleado = new Empleado(cedula, primerNombre, segundoNombre, primerApellido, segundoApellido, direccion, ciudad, genero, cargo);
		empleados.add(nuevoEmpleado);
		return nuevoEmpleado;
	}
	
	public Cliente crearCliente(int cedula, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String direccion, String tipoCliente, Ciudad ciudad) {

		if (buscarCliente(cedula) != null) {
			System.out.println("ERROR: Ya existe un cliente con cédula " + cedula);
			return null;
		}
		Cliente nuevoCliente = new Cliente(cedula, primerNombre, segundoNombre, primerApellido, segundoApellido,
				direccion, tipoCliente, ciudad);
		clientes.add(nuevoCliente);
		return nuevoCliente;
	}

	public Sucursal crearSucursal(int codigo, String nombre, int codigoPostal, Ciudad ciudad) {

		if (buscarCliente(codigo) != null) {
			System.out.println("ERROR: Ya existe un cliente con cédula " + codigo);
			return null;
		}
		Sucursal nuevaSucursal = new Sucursal (codigo,  nombre, codigoPostal,  ciudad);
		sucursales.add(nuevaSucursal);
		
		return nuevaSucursal;
	}
	
	public Pedido crearPedido(int referencia, int valor) {

		if (buscarCliente(referencia) != null) {
			System.out.println("ERROR: Ya existe un cliente con cédula " + referencia);
			return null;
		}
		Pedido nuevoPedido = new Pedido ( referencia, valor);
		pedidos.add(nuevoPedido);
		
		return nuevoPedido;
	}
	// ***************************READ****************************************
	public Empleado buscarEmpleado(int cedulaEmpleado) {

		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getCedula() == (cedulaEmpleado)) {
				return empleados.get(i);
			}
		}
		return null;
	}

	public Cliente buscarCliente(int cedulaCliente) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCedula() == (cedulaCliente)) {
				return clientes.get(i);
			}
		}
		return null;
	}

	public Ciudad buscarCiudad(int codigoCiudad) {

		for (int i = 0; i < ciudades.size(); i++) {
			if (ciudades.get(i).getCodigo() == (codigoCiudad)) {
				return ciudades.get(i);
			}
		}
		return null;
	}

	public Sucursal buscarSucursal(int codigoSucursal) {

		for (int i = 0; i < sucursales.size(); i++) {
			if (sucursales.get(i).getCodigo() == (codigoSucursal)) {
				return sucursales.get(i);
			}
		}
		return null;
	}

	public Pedido buscarPedido(int codigoPedido) {

		for (int i = 0; i < pedidos.size(); i++) {
			if (pedidos.get(i).getReferencia() == (codigoPedido)) {
				return pedidos.get(i);
			}
		}
		return null;
	}

	// ******************************UPDATE**************************************
	public boolean actualizarEmpleado(int cedula, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String direccion, Ciudad ciudad, int genero, String cargo) {
		Empleado empleado = buscarEmpleado(cedula);

		if (empleado == null) {
			System.out.println("ERROR: No existe un empleado con número de cédula" + cedula);
		}

		empleado.setPrimerNombre(primerNombre);
		empleado.setSegundoNombre(segundoNombre);
		empleado.setPrimerApellido(primerApellido);
		empleado.setSegundoApellido(segundoApellido);
		empleado.setDireccion(direccion);
		empleado.setCargo(cargo);
		empleado.setCiudad(ciudad);
		empleado.setGenero(genero);
		return true;
	}
	
	public boolean actualizarCliente(int cedula, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String direccion, String tipoCliente, Ciudad ciudad) {
		Cliente cliente = buscarCliente(cedula);

		if (cliente == null) {
			System.out.println("ERROR: No existe un cliente con número de cédula" + cedula);
		}

		cliente.setPrimerNombre(primerNombre);
		cliente.setSegundoNombre(segundoNombre);
		cliente.setPrimerApellido(primerApellido);
		cliente.setSegundoApellido(segundoApellido);
		cliente.setDireccion(direccion);
		cliente.setTipoCliente(tipoCliente);
		cliente.setCiudad(ciudad);
		return true;
	}


	public boolean actualizarSucursal(int codigo, String nombre, int codigoPostal, Ciudad ciudad) {
		Sucursal sucursal = buscarSucursal(codigo);

		if (sucursal == null) {
			System.out.println("ERROR: No existe una sucursal con codigo" + codigo);
		}

		sucursal.setNombre(nombre);
		sucursal.setCodigoPostal(codigoPostal);
		sucursal.setCiudad(ciudad);
		return true;
	}
	
	public boolean actualizarPedido(int referencia, int valor) {
		Pedido pedido = buscarPedido(referencia);

		if (pedido == null) {
			System.out.println("ERROR: No existe una sucursal con codigo" + referencia);
		}

		pedido.setReferencia(referencia);
		pedido.setValor(valor);
		return true;
	}


	// ******************************DELETE**************************************

	public  Empleado eliminarEmpleado(int cedulaEmpleado) {

		Empleado empleadoEliminar = buscarEmpleado(cedulaEmpleado);
		
		if (empleadoEliminar != null) {
			getEmpleados().remove(empleadoEliminar);
			return empleadoEliminar;
		}
		else {
			System.out.println("ERROR: No existe un cliente con cédula " + cedulaEmpleado);
			return null;
		}
	}
	
	
	public  Cliente eliminarCliente(int cedulaCliente) {

		Cliente clienteEliminar = buscarCliente(cedulaCliente);
		
		if (clienteEliminar != null) {
			getClientes().remove(clienteEliminar);
			return clienteEliminar;
		}
		else {
			System.out.println("ERROR: No existe un cliente con cédula " + cedulaCliente);
			return null;
		}
	}
	
	public  Sucursal eliminarSucursal(int codigo) {

		Sucursal sucursalEliminar = buscarSucursal(codigo);
		
		if (sucursalEliminar != null) {
			getSucursales().remove(sucursalEliminar);
			return sucursalEliminar;
		}
		else {
			System.out.println("ERROR: No existe un cliente con cédula " + codigo);
			return null;
		}
	}
	
	public  Pedido eliminarPedido(int referencia) {

		Pedido pedidoEliminar = buscarPedido(referencia);
		
		if (pedidoEliminar != null) {
			getPedidos().remove(pedidoEliminar);
			return pedidoEliminar;
		}
		else {
			System.out.println("ERROR: No existe un cliente con cédula " + referencia);
			return null;
		}
	}

	//******************************GETS AND SETS*************************************
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public List<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}

	public List<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	

	
	
}

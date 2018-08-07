package edu.masterd.tiendamusica.servicio.venta.impl;

import edu.masterd.tiendamusica.entidad.venta.Cliente;
import edu.masterd.tiendamusica.servicio.venta.ServicioCliente;

/**
 * Clase que hace la función del servicio de las acciones al cliente. 
 * Se realizan las diferentes acciones del programa referidas a los clientes
 * 
 * @author Alejandro
 */
public class ServicioClienteImpl extends AbstractoServicioVenta<Cliente> implements ServicioCliente{ 
	
	@Override
	public Cliente crear(String nombre, String apellidos, int edad){
		Cliente cliente= new Cliente();
		cliente.setNombre(nombre);
		cliente.setApellidos(apellidos);
		cliente.setEdad(edad);
		return cliente;
	}
}

package edu.masterd.tiendamusica.servicio.venta;

import edu.masterd.tiendamusica.entidad.venta.Cliente;

public interface ServicioCliente  extends ServicioVentaComun<Cliente>{
	/**
	 * Función para la creación del cliente
	 * 
	 * @param nombre> entrada del nombre del cliente
	 * @param apellidos> entrada de los apellidos del cliente
	 * @param edad> entrada de la edad del cliente
	 * @return el objeto cliente con los datos asignados
	 */
	public Cliente crear(String nombre, String apellidos, int edad);
}

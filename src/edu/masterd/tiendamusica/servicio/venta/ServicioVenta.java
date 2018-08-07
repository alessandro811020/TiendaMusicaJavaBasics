package edu.masterd.tiendamusica.servicio.venta;

import edu.masterd.tiendamusica.entidad.venta.Venta;

/**
 * Interface que hace la función del servicio de las acciones de la venta. 
 * Se realizan las diferentes acciones del programa referidas a las ventas
 * 
 * @author Alejandro
 */
public interface ServicioVenta extends ServicioVentaComun<Venta>{

	/**
	 * Función para crear el objeto Venta
	 * @param nombreCancion> entrada del nombre de la canción que se comprará
	 * @param nombreCliente> entrada del nombre del cliente que compra
	 * @return objeto Venta con los datos guardados
	 */
	public Venta crear(String nombreCancion, String nombreCliente);
	
}

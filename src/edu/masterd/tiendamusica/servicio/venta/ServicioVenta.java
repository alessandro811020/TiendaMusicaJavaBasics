package edu.masterd.tiendamusica.servicio.venta;

import edu.masterd.tiendamusica.entidad.venta.Venta;

/**
 * Interface que hace la funci�n del servicio de las acciones de la venta. 
 * Se realizan las diferentes acciones del programa referidas a las ventas
 * 
 * @author Alejandro
 */
public interface ServicioVenta extends ServicioVentaComun<Venta>{

	/**
	 * Funci�n para crear el objeto Venta
	 * @param nombreCancion> entrada del nombre de la canci�n que se comprar�
	 * @param nombreCliente> entrada del nombre del cliente que compra
	 * @return objeto Venta con los datos guardados
	 */
	public Venta crear(String nombreCancion, String nombreCliente);
	
}

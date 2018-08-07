package edu.masterd.tiendamusica.servicio.venta.impl;

import edu.masterd.tiendamusica.entidad.venta.Venta;
import edu.masterd.tiendamusica.servicio.venta.ServicioVenta;

/**
 * Clase que hace la función del servicio de las acciones de la venta. 
 * Se realizan las diferentes acciones del programa referidas a las ventas
 * 
 * @author Alejandro
 */
public class ServicioVentaImpl extends AbstractoServicioVenta<Venta> implements ServicioVenta {
	
	@Override
	public Venta crear(String nombreCancion, String nombreCliente){
		Venta venta= new Venta();
		venta.setCancionVenta(nombreCancion);
		venta.setClienteCompra(nombreCliente);
		return venta;
	}
	
}

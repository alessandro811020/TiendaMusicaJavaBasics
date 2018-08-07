  package edu.masterd.tiendamusica.servicio.operaciontienda.impl;

import edu.masterd.tiendamusica.entidad.operaciontienda.CD;
/**
 * Clase que implementa la Interface OperacionTienda declarando por
 * el genérico a CD e Integer. Por lo que este servicio será a los
 * CDs
 * Se sobreescriben los métodos de la interface, creando las funciones y 
 * procedimientos respectivos.
 * 
 * @author Alejandro 
 */
public final class ServicioCD extends AbstractoServicioOperacion<CD>{

	@Override
	public CD crear(String nombreCancion, String autor, double precio, Integer informacionExtra) {
		CD cds= new CD();
		super.popula(cds, nombreCancion, autor, precio);
		cds.setCapacidad(informacionExtra);
		return cds;
	}
}

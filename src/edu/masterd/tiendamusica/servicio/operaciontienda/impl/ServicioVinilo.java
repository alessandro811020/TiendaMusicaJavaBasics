package edu.masterd.tiendamusica.servicio.operaciontienda.impl;

import edu.masterd.tiendamusica.entidad.operaciontienda.Vinilo;
/**
 * Clase que implementa la Interface OperacionTienda declarando por
 * el gen�rico a Vinilo e Integer. Por lo que este servicio ser� a los
 * vinilos
 * Se sobreescriben los m�todos de la interface, creando las funciones y 
 * procedimientos respectivos.
 * 
 * @author Alejandro
 */
public final class ServicioVinilo extends AbstractoServicioOperacion<Vinilo>{

	@Override
	public Vinilo crear(String nombreCancion, String autor, double precio, Integer informacionExtra) {
		Vinilo vinilo= new Vinilo();
		super.popula(vinilo, nombreCancion, autor, precio);
		vinilo.setVelocidad(informacionExtra);
		return vinilo;
	}
}

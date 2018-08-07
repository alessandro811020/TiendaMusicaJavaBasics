package edu.masterd.tiendamusica.servicio.operaciontienda.impl;

import edu.masterd.tiendamusica.entidad.operaciontienda.Casete;

/**
 * Clase que implementa la Interface OperacionTienda declarando por
 * el gen�rico a Casete e Integer. Por lo que este servicio ser� a los
 * casetes
 * Se sobreescriben los m�todos de la interface, creando las funciones y 
 * procedimientos respectivos.
 * @author Alejandro 
 */
public final class ServicioCasete extends AbstractoServicioOperacion<Casete>{

	@Override
	public Casete crear(String nombreCancion, String autor,double precio, Integer duracion) {
		Casete casete= new Casete();
		super.popula(casete, nombreCancion, autor, precio);
		casete.setDuracion(duracion);
		return casete;
	}
}

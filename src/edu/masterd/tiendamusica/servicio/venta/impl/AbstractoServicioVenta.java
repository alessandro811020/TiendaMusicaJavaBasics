package edu.masterd.tiendamusica.servicio.venta.impl;

import java.util.List;

import edu.masterd.tiendamusica.entidad.venta.EntidadVenta;
import edu.masterd.tiendamusica.servicio.venta.ServicioVentaComun;

public abstract class AbstractoServicioVenta<T extends EntidadVenta> implements ServicioVentaComun<T>{

	@Override
	public void listar(List<T> listaOriginal) {
		for (T cds : listaOriginal) {
			System.out.println(cds);
		}		
	}

	@Override
	public void eliminar(List<T> listaOriginal, Integer objetoEliminar) {
		for (T t : listaOriginal) {
			if(t.getCodigo() == objetoEliminar) {
				listaOriginal.remove(t);
				System.out.println("Se ha eliminado satisfactoriamente el medio con el código:" + objetoEliminar);	
			}
		}
		System.out.println("No ha podido Eliminarse la canción de medio, con código:" + objetoEliminar);	
	}	
}

package edu.masterd.tiendamusica.servicio.operaciontienda.impl;

import java.util.List;

import edu.masterd.tiendamusica.entidad.operaciontienda.ContenedorMusica;
import edu.masterd.tiendamusica.servicio.operaciontienda.OperacionTienda;

public abstract class AbstractoServicioOperacion<T extends ContenedorMusica> implements OperacionTienda<T, Integer>{

	/**
	 * popula medio con datos comunes
	 * 
	 * @param t
	 * @param nombreCancion
	 * @param autor
	 * @param precio
	 */
	protected void popula(T t, String nombreCancion, String autor, double precio) {
		t.setNombreCancion(nombreCancion);
		t.setNombreCantante(autor);
		t.setPrecio(precio);
	}	

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

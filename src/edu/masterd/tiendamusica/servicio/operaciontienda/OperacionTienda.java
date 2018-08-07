package edu.masterd.tiendamusica.servicio.operaciontienda;

import java.util.List;

import edu.masterd.tiendamusica.entidad.operaciontienda.ContenedorMusica;
/**
 * Interface con dos genéricos porque será implementada en los servicios de
 * Vinilo, Casete y CD, por lo que tendrán atributos variados y las tres 
 * acciones principales del programa, crear, listar y eliminar. 
 * 
 * @param <T> Especificará si es Vinilo, Casete o CD
 * @param <K> Atributos que podrían variar por cada uno de los soportes.
 * @author Alejandro
 */

public interface OperacionTienda<T extends ContenedorMusica, K> {
	/**
	 * @param nombreCancion> Nombre de las canciones para cada soporte(String)
	 * @param autor> Autor de las canciones (String)
	 * @param precio> Precio de las canciones (double)
	 * @param informacionExtra> Información específica de cada soporte
	 * @return Todo tipo de soporte en la implementacion del metodo crear,
	 * 			la accion de listar los soportes,
	 * 			el ArrayList del soporte con el soporte eliminado
	 */
	public T crear(String nombreCancion,String autor, double precio, K informacionExtra);
	
	/**
	 * muestra el contenido de la lista
	 * 
	 * @param listaOriginal
	 */
	public void listar(List<T> listaOriginal);
	
	/**
	 * remover un objeto de la lista
	 * 
	 * @param listaOriginal
	 * @param objetoEliminar
	 */
	public void eliminar(List<T> listaOriginal, K objetoEliminar);
}

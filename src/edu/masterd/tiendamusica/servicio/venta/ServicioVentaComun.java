package edu.masterd.tiendamusica.servicio.venta;

import java.util.List;

import edu.masterd.tiendamusica.entidad.venta.EntidadVenta;

public interface ServicioVentaComun<T extends EntidadVenta> {

	/**
	 * Procedimiento que lista las ventas dada la lista introducida.
	 * @param listaOriginal> lista de ventas a listar 
	 */
	public void listar(List<T> listaOriginal);
	
	/**
	 * Procedimiento para eliminar una venta según su código
	 * @param listaOriginal> lista de ventas almacenada en el programa
	 * @param objetoEliminar> código de la venta a eliminar
	 */
	public void eliminar(List<T> listaOriginal, Integer objetoEliminar);	
}

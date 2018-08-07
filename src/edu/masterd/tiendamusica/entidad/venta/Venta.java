package edu.masterd.tiendamusica.entidad.venta;

import java.util.Date;

/**
 * Clase referida a la Venta que realiza la tienda, donde se declaran 
 * atributos y metodos para la realizaci�n de esta. Se agrega el atributo
 * fecha, donde se guardar� la fecha de la realizaci�n de la venta.
 * Cuenta tambi�n con un c�digo que identifica la venta(entero)
 * @author Alejandro 
 */

public class Venta extends EntidadVenta {
	private static int contadorVentas=0;
	/**
	 * atributos de la clase
	 */
	private Date fechaCompra;
	private String clienteCompra;
	private String cancionVenta;
	
	/**
	 * constructor de la clase, inicializa el c�digo y la fecha
	 */
	public Venta() {
		codigo = ++contadorVentas;
		fechaCompra=new Date();
	}

	/**
	 * getters y setters de la clase, a la fecha y c�digo no le declara setters
	 */
	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getClienteCompra() {
		return clienteCompra;
	}

	public void setClienteCompra(String clienteCompra) {
		this.clienteCompra = clienteCompra;
	}

	public String getCancionVenta() {
		return cancionVenta;
	}

	public void setCancionVenta(String cancionVenta) {
		this.cancionVenta = cancionVenta;
	}

	@Override
	public String toString() {
		return "Venta [fechaCompra=" + fechaCompra + ", clienteCompra=" + clienteCompra + ", cancionVenta="
				+ cancionVenta + ", codigo=" + codigo + "]";
	}


	
}

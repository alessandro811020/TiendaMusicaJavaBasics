package edu.masterd.tiendamusica.entidad.venta;
/**
 * Clase referida al cliente de la tienda, donde se le guardan los atributos
 * respectivos a ellos, con un identificador código, donde el 28 especifica
 * que es un cliente de la tienda.
 * 
 * @author Alejandro */

public class Cliente extends EntidadVenta{
	private static int contadorCodigo=28000;
	
	/**
	 * Atributos del cliente
	 */
	private String nombre;
	private String apellidos;
	private int edad;
		
	/**
	 * constructor de la clase
	 */
	public Cliente(){
		super.codigo = ++contadorCodigo;
	}

	/**
	 * getters y setters donde codigoOficial no tiene set, su valor es asignado en el constructor
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCodigo() {
		return codigo;
	}
		
	/**
	 * sobreescritura del método toString()
	 */
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + " ,código= "+codigo+"]";
	}
}


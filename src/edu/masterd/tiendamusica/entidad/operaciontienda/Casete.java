package edu.masterd.tiendamusica.entidad.operaciontienda;

/**
 *Clase de soporte Casete, heredando los atributos y métodos de la
 *superclase ContenedorMusica agregándole atributos propios como 
 *la duración del casete(entero) y un contador con el identificador
 *12 delante, que especifica como soporte Casete, los dos dígitos contiguos 
 *irían contando Casetes y a la vez codificando a cada uno con su número
 *propio
 *
 * @author Alejandro
 */

public final class Casete extends ContenedorMusica {

	/**
	 * atributos de Casete
	 */
	private int duracion;
	private static int contadorCasete=1200;
	
	/**
	 * Constructor de Casete
	 */
	public Casete() {
		codigo = ++contadorCasete;
	}
	
	/**
	 * getters y setters(código solo get, su asignación es en el constructor
	 */
	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	/**
	 * sobreescritura del método toString()
	 */
	@Override
	public String toString() {
		return "Casete [Código= "+codigo+" , Nombre: "
				+ super.getNombreCancion() +" Autor: "+super.getNombreCantante()+ ", Precio=" + super.getPrecio() + ", duración=" + this.getDuracion() +"]";
	}
}

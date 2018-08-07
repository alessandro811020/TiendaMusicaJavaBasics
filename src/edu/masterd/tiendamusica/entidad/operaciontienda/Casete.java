package edu.masterd.tiendamusica.entidad.operaciontienda;

/**
 *Clase de soporte Casete, heredando los atributos y m�todos de la
 *superclase ContenedorMusica agreg�ndole atributos propios como 
 *la duraci�n del casete(entero) y un contador con el identificador
 *12 delante, que especifica como soporte Casete, los dos d�gitos contiguos 
 *ir�an contando Casetes y a la vez codificando a cada uno con su n�mero
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
	 * getters y setters(c�digo solo get, su asignaci�n es en el constructor
	 */
	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	/**
	 * sobreescritura del m�todo toString()
	 */
	@Override
	public String toString() {
		return "Casete [C�digo= "+codigo+" , Nombre: "
				+ super.getNombreCancion() +" Autor: "+super.getNombreCantante()+ ", Precio=" + super.getPrecio() + ", duraci�n=" + this.getDuracion() +"]";
	}
}

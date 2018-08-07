package edu.masterd.tiendamusica.entidad.operaciontienda;
/**
 *Clase de soporte Vinilo, heredando los atributos y m�todos de la
 *superclase ContenedorMusica agreg�ndole atributos propios como 
 *la velocidad del Vinilo(entero) y un contador con el identificador
 *11 delante, que especifica como soporte Vinilo, los dos d�gitos contiguos 
 *ir�an contando Vinilos y a la vez codificando a cada uno con su n�mero
 *propio
 *
 * @author Alejandro
 */

public final class Vinilo extends ContenedorMusica{
	private static int contadorVinilo=1100;
	
	/**
	 * atributos de Vinilo
	 */
	private int velocidad;	
	

	/**
	 * Constructor de Vinilo
	 */
	public Vinilo() {
		codigo = ++contadorVinilo;
	}

	/**
	 * getters y setters(c�digo solo get, su asignaci�n es en el constructor
	 */
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * sobreescritura del m�todo toString()
	 */
	@Override
	public String toString() {
		return "Vinilo [C�digo= "+codigo+" , Nombre: "
				+ super.getNombreCancion() +" Autor: "+super.getNombreCantante()+ ", Precio=" + super.getPrecio() + ", velocidad=" + velocidad +"]";
	}
	
	

}

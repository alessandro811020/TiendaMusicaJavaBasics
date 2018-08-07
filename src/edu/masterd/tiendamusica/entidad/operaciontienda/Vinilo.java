package edu.masterd.tiendamusica.entidad.operaciontienda;
/**
 *Clase de soporte Vinilo, heredando los atributos y métodos de la
 *superclase ContenedorMusica agregándole atributos propios como 
 *la velocidad del Vinilo(entero) y un contador con el identificador
 *11 delante, que especifica como soporte Vinilo, los dos dígitos contiguos 
 *irían contando Vinilos y a la vez codificando a cada uno con su número
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
	 * getters y setters(código solo get, su asignación es en el constructor
	 */
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * sobreescritura del método toString()
	 */
	@Override
	public String toString() {
		return "Vinilo [Código= "+codigo+" , Nombre: "
				+ super.getNombreCancion() +" Autor: "+super.getNombreCantante()+ ", Precio=" + super.getPrecio() + ", velocidad=" + velocidad +"]";
	}
	
	

}

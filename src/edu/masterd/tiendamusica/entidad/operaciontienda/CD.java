package edu.masterd.tiendamusica.entidad.operaciontienda;

/**
 *Clase de soporte CD, heredando los atributos y métodos de la
 *superclase ContenedorMusica agregándole atributos propios como 
 *la duración del capacidad(entero) y un contador con el identificador
 *13 delante, que especifica como soporte CD, los dos dígitos contiguos 
 *irían contando CDs y a la vez codificando a cada uno con su número
 *propio
 *
 * @author Alejandro */

public final class CD extends ContenedorMusica {
	private static int contadorCD=1300;
	/**
	 * atributos de CD
	 */
	private int capacidad;	
	
	/**
	 * Constructor de CD
	 */
	public CD() {
		codigo = ++contadorCD;
	}
	
	/**
	 * getters y setters(código solo get, su asignación es en el constructor)
	 */
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * sobreescritura del método toString()
	 */
	@Override
	public String toString() {
		return "CD [Código= "+codigo+" , Nombre: "
				+ super.getNombreCancion() +" Autor: "+super.getNombreCantante()+ ", Precio=" + super.getPrecio() + ", modelo=" + this.getCapacidad() +"]";
	}
	
	

}

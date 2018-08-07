package edu.masterd.tiendamusica.entidad.operaciontienda;

/**
 *Clase de soporte CD, heredando los atributos y m�todos de la
 *superclase ContenedorMusica agreg�ndole atributos propios como 
 *la duraci�n del capacidad(entero) y un contador con el identificador
 *13 delante, que especifica como soporte CD, los dos d�gitos contiguos 
 *ir�an contando CDs y a la vez codificando a cada uno con su n�mero
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
	 * getters y setters(c�digo solo get, su asignaci�n es en el constructor)
	 */
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * sobreescritura del m�todo toString()
	 */
	@Override
	public String toString() {
		return "CD [C�digo= "+codigo+" , Nombre: "
				+ super.getNombreCancion() +" Autor: "+super.getNombreCantante()+ ", Precio=" + super.getPrecio() + ", modelo=" + this.getCapacidad() +"]";
	}
	
	

}

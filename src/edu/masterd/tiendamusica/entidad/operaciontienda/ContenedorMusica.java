package edu.masterd.tiendamusica.entidad.operaciontienda;

/**
 * Esta clase contiene los Atributos comunes de todos los soportes
 * musicales que contiene la tienda
 * 
 * @author Alejandro
 */
public abstract class ContenedorMusica {
	/**
	 *declaración de atributos
	 */
	protected int codigo;
	private String nombreCancion;
	private String nombreCantante;
	private double precio;	
	
	/**
	 * Constructor(vacío para esta clase)
	 */
	public ContenedorMusica() {
	}
	
	/**
	 * Declaración de getters y setters de los atributos
	 */
	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio=precio;
		
	}
	
	public String getNombreCantante() {
		return nombreCantante;
	}

	public void setNombreCantante(String nombreCantante) {
		this.nombreCantante = nombreCantante;
	}
	

	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * sobreescribir el método toString()
	 */
	@Override
	public String toString() {
		return "Musica [Nombre de Canción:" + nombreCancion +" Cantante: "+nombreCantante+ ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContenedorMusica other = (ContenedorMusica) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}


}

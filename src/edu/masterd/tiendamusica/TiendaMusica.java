package edu.masterd.tiendamusica;

import static edu.masterd.tiendamusica.TiendaMusicaApp.CASETE;
import static edu.masterd.tiendamusica.TiendaMusicaApp.CD;
import static edu.masterd.tiendamusica.TiendaMusicaApp.VINILO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.masterd.tiendamusica.entidad.operaciontienda.CD;
import edu.masterd.tiendamusica.entidad.operaciontienda.Casete;
import edu.masterd.tiendamusica.entidad.operaciontienda.Vinilo;
import edu.masterd.tiendamusica.entidad.venta.Cliente;
import edu.masterd.tiendamusica.entidad.venta.Venta;
import edu.masterd.tiendamusica.servicio.operaciontienda.OperacionTienda;
import edu.masterd.tiendamusica.servicio.operaciontienda.impl.ServicioCD;
import edu.masterd.tiendamusica.servicio.operaciontienda.impl.ServicioCasete;
import edu.masterd.tiendamusica.servicio.operaciontienda.impl.ServicioVinilo;
import edu.masterd.tiendamusica.servicio.venta.ServicioCliente;
import edu.masterd.tiendamusica.servicio.venta.ServicioVenta;
import edu.masterd.tiendamusica.servicio.venta.impl.ServicioClienteImpl;
import edu.masterd.tiendamusica.servicio.venta.impl.ServicioVentaImpl;
/**
 * Clase que se refiere a la Tienda de la Música, donde se almacenarán todos 
 * los elementos que intervienen en la tienda, clientes, vinilos, casetes,
 * cds y ventas. Enlaza a las acciones con el usuario en la clase 
 * TiendaMusicaApp con los servicios que se realizan y elementos que están 
 * en la clase
 * 
 * @author Alejandro
 */
public class TiendaMusica {
	private static final String RUTA_FICHERO="Ventas.txt";
	
	/**
	 * atributos de la tienda
	 */
	OperacionTienda<Vinilo, Integer> servicioVinilo= new ServicioVinilo();
	OperacionTienda<Casete, Integer> servicioCasete= new ServicioCasete();
	OperacionTienda<CD, Integer> servicioCD= new ServicioCD();
	
	ServicioCliente servicioCliente= new ServicioClienteImpl();
	ServicioVenta servicioVenta= new ServicioVentaImpl();

	List<Cliente> clientes= new ArrayList<>();
	List<Vinilo> vinilos= new ArrayList<>();
	List<Casete> casetes= new ArrayList<>();
	List<CD> cds= new ArrayList<>();
	List<Venta> ventas=new ArrayList<>();

	/**
	 * procedimiento de apoyo al listado de opciones en TiendaMusicaApp
	 */
	public void listarOpciones(){
		String[] opciones = {"Escoja una de las siguientes opciones a realizar:",
								"Crear",
								"Listar",
								"Eliminar",
								"Cerrar" };
		imprimeOpciones(opciones);
	}
	
	/**
	 * procedimiento de apoyo al listado de subopciones para cada
	 * una de las opciones en TiendaMusicaApp
	 */
	public void listarSubMenu(String accion){
		String[] opciones = {"¿Qué desea "+accion+"?",
								"Cliente",
								"Musica",
								"Venta",
								"Regresar" };
		imprimeOpciones(opciones);				
	}
	
	/**
	 * procedimiento de apoyo al listado de subopciones de soportes
	 * cuando el cliente siempre escoja música dentro de las subopciones
	 * en TiendaMusicaApp
	 */
	public void listarSoportesMusica(){
		String[] opciones = {"Escoja el soporte de musica:",
				"Vinilo",
				"Casete",
				"CD",
				"Regresar" };
		imprimeOpciones(opciones);					
	}
	
	private void imprimeOpciones(String[] opciones){
		for (String opcion : opciones) {
			System.out.println(opcion);	
		}
	}
	
	/**
	 * Procedimiento que agrega un cliente a la tienda. Se apoya en el
	 * servicio de Cliente creado
	 * 
	 * @param nombre> Nombre del Cliente(String)
	 * @param apellidos> Apellidos del Cliente(String)
	 * @param edad> Edad del Cliente(Entero)
	 */
	public void agregarClienteATienda(String nombre, String apellidos, int edad) {
		clientes.add(servicioCliente.crear(nombre, apellidos, edad));
	}
	
	/**
	 * Apoyándose del servicio al Cliente, listar los clientes que están
	 * registrados en la tienda
	 */
	public void listarClientes(){
		servicioCliente.listar(clientes);
	}
	
	/**
	 * Eliminación de clientes introducidos dentro de la lista de clientes 
	 * registrada
	 * 
	 * @param codigo> Código del cliente a eliminar(entero)
	 */
	public void eliminarCliente(int codigo) {
		servicioCliente.eliminar(clientes, codigo);
	}

	/**
	 * Procedimiento que agrega un vinilo a la tienda enlazando los datos
	 * introducidos por el usuario con el objeto vinilo creado.
	 * 
	 * @param nombreCancion> Nombre de la Çanción de vinilo(String)
	 * @param autorCancion> Autor de la Canción de Vinilo(String)
	 * @param precio> Precio de la canción que se ofrece(entero)
	 * @param velocidad> Velocidad del Vinilo(entero)
	 */
	public void agregarViniloATienda(String nombreCancion, String autorCancion, double precio, int velocidad) {
		vinilos.add(servicioVinilo.crear(nombreCancion, autorCancion, precio, velocidad));
	}
	
	/**
	 * Listar los vinilos guardados dentro de la tienda a ofrecer
	 */
	public void listarVinilos(){
		servicioVinilo.listar(vinilos);
	}
	
	/**
	 * Eliminación del Vinilo según el código introducido por el usuario
	 * @param codigo> Código del Vinilo introducido por el usuario
	 */
	public void eliminarVinilo(int codigo) {
		servicioVinilo.eliminar(vinilos, codigo);
	}
	
	/**
	 * Procedimiento que agrega un casete a la tienda enlazando los datos
	 * introducidos por el usuario con el objeto casete creado.
	 * 
	 * @param nombreCancion> Nombre de la Çanción de Casete(String)
	 * @param autorCancion> Autor de la Canción de Casete(String)
	 * @param precio> Precio de la canción que se ofrece(entero)
	 * @param duracion> Duración en minutos del Casete(entero)
	 */
	public void agregarCaseteATienda(String nombreCancion, String autorCancion, double precio, int duracion) {
		casetes.add(servicioCasete.crear(nombreCancion, autorCancion, precio, duracion));
	}
	/**
	 * Procedimiento para listar los casetes guardados dentro del programa que se ofrecen a la 
	 * venta
	 */
	public void listarCasetes(){
		servicioCasete.listar(casetes);
	}
	/**
	 * Procedimiento para eliminar un casete dentro de la lista ofertada
	 * según el código introducido por el usuario
	 * 
	 * @param codigo> Código introducido por el usuario para eliminar(entero)
	 */
	public void eliminarCasete(int codigo) {
		servicioCasete.eliminar(casetes, codigo);
	}
	
	/**
	 * Procedimiento que agrega un CD a la tienda enlazando los datos
	 * introducidos por el usuario con el objeto CD creado.
	 * 
	 * @param nombreCancion> Nombre de la Çanción de CD(String)
	 * @param autorCancion> Autor de la Canción de CD(String)
	 * @param precio> Precio de la canción que se ofrece(entero)
	 * @param capacidad> capacidad del CD(entero)
	 */
	public void agregarCDATienda(String nombreCancion, String autorCancion, double precio, int capacidad) {
		cds.add(servicioCD.crear(nombreCancion, autorCancion, precio, capacidad));
	}
	/**
	 * Procedimiento para listar los CDs registrados en el programa
	 */
	public void listarCDs(){
		servicioCD.listar(cds);
	}
	/**
	 * Procedimiento para eliminar un CD registrado según el código
	 * introducido por el usuario
	 * @param codigo> Código introducido por el usuario para eliminar
	 * el CD
	 */
	public void eliminarCD(int codigo) {
		servicioCD.eliminar(cds, codigo);
	}
	
	/**
	 * Procedimiento para agregar la realización de una venta por la tienda
	 * introduciendo los datos pertinentes del cliente y la música vendida
	 * 
	 * @param codigoCliente> Código del cliente que va a comprar(entero)
	 * @param soporteMusica> Tipo de soporte de la música comprada(String)
	 * @param codigoMusica> Código de la música que será eliminada(entero)
	 */
	public void agregarVenta(int codigoCliente, String soporteMusica, int codigoMusica) {
		String nombreCancion = null;
		String nombreCliente = null;
		String apellidosCliente = null;
		String nombreCompleto;
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getCodigo()==codigoCliente) {
				nombreCliente=clientes.get(i).getNombre();
				apellidosCliente=clientes.get(i).getApellidos();
			}
		}
		nombreCompleto=nombreCliente+" "+apellidosCliente;
		System.out.println("El cliente es "+nombreCompleto);
		switch (soporteMusica) {
		case VINILO:
			nombreCancion = getNomreCancionVinilo(codigoMusica, nombreCancion);
			break;
		case CASETE:
			nombreCancion = getNomreCancionCasete(codigoMusica, nombreCancion);
			break;
		case CD:
			nombreCancion = getNomreCancionCd(codigoCliente, nombreCancion);
			break;
		default:
			System.out.println("Datos introducidos no correctos");
			break;
		}
		ventas.add(servicioVenta.crear(nombreCancion, nombreCompleto));
		imprimirFichero();
	}

	private String getNomreCancionCd(int codigoCliente, String nombreCancion) {
		for (int i = 0; i < cds.size(); i++) {
			if (cds.get(i).getCodigo()==codigoCliente) {
				nombreCancion=cds.get(i).getNombreCancion();
			}
		}
		return nombreCancion;
	}

	private String getNomreCancionCasete(int codigoMusica, String nombreCancion) {
		for (int i = 0; i < casetes.size(); i++) {
			if (casetes.get(i).getCodigo()==codigoMusica) {
				nombreCancion=casetes.get(i).getNombreCancion();
			}
		}
		return nombreCancion;
	}

	private String getNomreCancionVinilo(int codigoMusica, String nombreCancion) {
		for (int i = 0; i < vinilos.size(); i++) {
			if (vinilos.get(i).getCodigo()==codigoMusica) {
				nombreCancion=vinilos.get(i).getNombreCancion();
			}
		}
		return nombreCancion;
	}
	
	/**
	 * Procedimiento para listar las ventas realizadas registradas y
	 * guardadas dentro del programa
	 */
	public void listarVenta(){
		servicioVenta.listar(ventas);
	}
	
	/**
	 * Procedimiento para eliminar ventas que están registradas en el 
	 * programa según el código de la venta guardada
	 * 
	 * @param codigo> Código introducido que identifica la venta(entero)
	 */
	public void eliminarVenta(int codigo) {
		servicioVenta.eliminar(ventas, codigo);
		imprimirFichero();
	}
	
	/**
	 * Procedimiento por el cual se imprimirá en un fichero las ventas
	 * guardadas en el programa
	 */
	public void imprimirFichero() {
		File file= new File(RUTA_FICHERO);
		try {
			FileWriter writer= new FileWriter(file);
			BufferedWriter bufWrit= new BufferedWriter(writer);
			for (int i = 0; i < ventas.size(); i++) {
				bufWrit.write(ventas.get(i).toString());
				bufWrit.newLine();
			}
			bufWrit.flush();
			bufWrit.close();
		} catch (IOException e) {
			System.out.println("Error al imprimir el fichero");
		}
		
	}
	
}

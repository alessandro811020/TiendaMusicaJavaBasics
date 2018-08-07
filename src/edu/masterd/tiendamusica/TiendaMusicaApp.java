package edu.masterd.tiendamusica;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Principal, donde se encuentra el método main de la aplicación java Esta
 * clase permite el contacto con el usuario, donde toda entrada de datos se
 * realiza en esta clase y son enviados a las demás clases para la realización
 * del programa
 * 
 * @author Alejandro
 */
public class TiendaMusicaApp {
	private static final String CREAR = "crear";
	private static final String LISTAR = "listar";
	private static final String ELIMINAR = "eliminar";
	private static final String CERRAR = "cerrar";
	private static final String CLIENTE = "cliente";
	private static final String MUSICA = "musica";
	private static final String VENTA = "venta";
	protected static final String CD = "cd";
	protected static final String CASETE = "casete";
	protected static final String VINILO = "vinilo";
	private static final String REGRESAR = "regresar";
	private static final String INICIO_CADENA = "lolo";

	/**
	 * Método main de la aplicación, donde se realizan las diferentes acciones e
	 * intercambio con el usuario para la introducción de datos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String accion = INICIO_CADENA;
		TiendaMusica tienda = new TiendaMusica();
		System.out.println("BIENVENIDO A LA TIENDA DE MUSICA");
		while (!accion.equalsIgnoreCase(CERRAR)) {
			tienda.listarOpciones();
			accion = teclado.nextLine();
			accion.toLowerCase();
			switch (accion) {
			case CREAR:
				procesaCrear(teclado, accion, tienda);
				break;
			case LISTAR:
				procesaListar(teclado, accion, tienda);
				break;
			case ELIMINAR:
				procesaEliminar(teclado, accion, tienda);
				break;
			default:
				if (!accion.equalsIgnoreCase(CERRAR)) {
					System.out.println("Escriba una opción correcta");
				}
				break;
			}
		}
		teclado.close();
	}

	private static void procesaEliminar(Scanner teclado, String accion, TiendaMusica tienda) {
		String seleccion13 = INICIO_CADENA;
		while (!seleccion13.equalsIgnoreCase(REGRESAR)) {
			tienda.listarSubMenu(accion);
			seleccion13 = teclado.nextLine();
			switch (seleccion13) {
			case CLIENTE:
				eliminaCliente(teclado, tienda);
				break;
			case MUSICA:
				eliminaMusica(teclado, tienda);
				break;
			case VENTA:
				procesaVenta(teclado, tienda);
				break;
			default:
				break;
			}
		}
	}

	private static void eliminaMusica(Scanner teclado, TiendaMusica tienda) {
		String seleccion6 = INICIO_CADENA;
		while (!seleccion6.equalsIgnoreCase(REGRESAR)) {
			tienda.listarSoportesMusica();
			seleccion6 = teclado.nextLine();
			seleccion6.toLowerCase();
			switch (seleccion6) {
			case VINILO:
				eliminaMusicaVinilo(teclado, tienda);
				break;
			case CASETE:
				eliminaMusicaCasete(teclado, tienda);
				break;
			case CD:
				eliminaMusicaCd(teclado, tienda);
				break;
			default:
				if (!seleccion6.equalsIgnoreCase(REGRESAR)) {
					System.out.println("Escoja una opción adecuada");
				}
				break;
			}
		}
	}

	private static void procesaListar(Scanner teclado, String accion, TiendaMusica tienda) {
		String seleccion4 = INICIO_CADENA;
		while (!seleccion4.equalsIgnoreCase(REGRESAR)) {
			tienda.listarSubMenu(accion);
			seleccion4 = teclado.nextLine();
			switch (seleccion4) {
			case CLIENTE:
				tienda.listarClientes();
				break;
			case MUSICA:
				listaMusica(teclado, tienda);
				break;
			case VENTA:
				tienda.listarVenta();
				break;
			default:
				if (!seleccion4.equalsIgnoreCase(REGRESAR)) {
					System.out.println("Escoja una opción.");
				}
				break;
			}

		}
	}

	private static void procesaCrear(Scanner teclado, String accion, TiendaMusica tienda) {
		String seleccion = INICIO_CADENA;
		while (!seleccion.equalsIgnoreCase(REGRESAR)) {
			tienda.listarSubMenu(accion);
			seleccion = teclado.nextLine();
			seleccion.toLowerCase();
			switch (seleccion) {
			case CLIENTE:
				creaCliente(teclado, tienda);
				break;
			case MUSICA:
				creaMusica(teclado, tienda);
				break;
			case VENTA:
				creaVenta(teclado, tienda);
				break;
			default:
				if (!seleccion.equalsIgnoreCase(REGRESAR)) {
					System.out.println("Escoja la opción que desea " + accion);
				}
				break;
			}
		}
	}

	private static void creaMusica(Scanner teclado, TiendaMusica tienda) {
		String seleccion1 = INICIO_CADENA;
		while (!seleccion1.equalsIgnoreCase(REGRESAR)) {
			tienda.listarSoportesMusica();
			seleccion1 = teclado.nextLine();
			seleccion1.toLowerCase();
			switch (seleccion1) {
			case VINILO:
				creaMusicaVinilo(teclado, tienda);
				break;
			case CASETE:
				creaMusicaCasete(teclado, tienda);
				break;
			case CD:
				creaMusicaCd(teclado, tienda);
				break;
			default:
				if (!seleccion1.equalsIgnoreCase(REGRESAR)) {
					System.out.println("Escoja una de las opciones plantedas");
				}
				break;
			}
		}
	}	
	
	private static void listaMusica(Scanner teclado, TiendaMusica tienda) {
		String seleccion5 = INICIO_CADENA;
		while (!seleccion5.equalsIgnoreCase(REGRESAR)) {
			tienda.listarSoportesMusica();
			seleccion5 = teclado.nextLine();
			seleccion5.toLowerCase();
			switch (seleccion5) {
			case VINILO:
				tienda.listarVinilos();
				break;
			case CASETE:
				tienda.listarCasetes();
				break;
			case CD:
				tienda.listarCDs();
				break;
			default:
				if (!seleccion5.equalsIgnoreCase(REGRESAR)) {
					System.out.println("Escoja una opción adecuada");
				}
				break;
			}
		}
	}
	
	private static void creaVenta(Scanner teclado, TiendaMusica tienda) {
		boolean continuarVenta = false;
		int codigoCliente = 0;
		int codigoCancion = 0;
		String soporteDeMusica = INICIO_CADENA;
		codigoCliente = leeCodigoCliente(teclado, continuarVenta, codigoCliente);
		continuarVenta = false;

		soporteDeMusica = leeSoporteDeCancion(teclado, soporteDeMusica);
		codigoCancion = leeCodigoCancion(teclado, continuarVenta, codigoCancion);

		tienda.agregarVenta(codigoCliente, soporteDeMusica, codigoCancion);
	}

	private static int leeCodigoCancion(Scanner teclado, boolean continuarVenta, int codigoCancion) {
		do {
			System.out.println("Realización de venta, introduzca código de la canción:");
			try {
				codigoCancion = teclado.nextInt();
				continuarVenta = true;
			} catch (InputMismatchException e) {
				System.out.println("El código insertado no es numérico");
			} finally {
				teclado.nextLine();
			}
		} while (!continuarVenta);
		return codigoCancion;
	}

	private static String leeSoporteDeCancion(Scanner teclado, String soporteDeMusica) {
		while (!soporteDeMusica.equalsIgnoreCase(VINILO) && !soporteDeMusica.equalsIgnoreCase(CASETE)
				&& !soporteDeMusica.equalsIgnoreCase(CD)) {
			System.out.println("Escriba el soporte de la canción(Vinilo,Casete,CD)");
			soporteDeMusica = teclado.nextLine();
			soporteDeMusica.toLowerCase();
		}
		return soporteDeMusica;
	}

	private static int leeCodigoCliente(Scanner teclado, boolean continuarVenta, int codigoCliente) {
		do {
			System.out.println("Realización de venta, introduzca código del cliente:");
			try {
				codigoCliente = teclado.nextInt();
				continuarVenta = true;
			} catch (InputMismatchException e) {
				System.out.println("El código insertado no es numérico");
			} finally {
				teclado.nextLine();
			}
		} while (!continuarVenta);
		return codigoCliente;
	}

	private static void creaMusicaVinilo(Scanner teclado, TiendaMusica tienda) {
		String nombreVinilo = null;
		String autorVinilo = null;
		double precioVinilo = 0;
		int velocidadVinilo = 0;
		boolean continuar1 = false;
		System.out.println("Escriba el nombre de la canción de Vinilo: ");
		nombreVinilo = teclado.nextLine();
		System.out.println("Escriba el nombre del Autor de la canción de Vinilo: ");
		autorVinilo = teclado.nextLine();
		precioVinilo = leePrecioCancionVinilo(teclado, precioVinilo, continuar1);
		continuar1 = false;
		
		velocidadVinilo = leeVelocidadVinilo(teclado, velocidadVinilo, continuar1);
		tienda.agregarViniloATienda(nombreVinilo, autorVinilo, precioVinilo, velocidadVinilo);
	}

	private static int leeVelocidadVinilo(Scanner teclado, int velocidadVinilo, boolean continuar1) {
		do {
			try {
				System.out.println("Escriba la velocidad del Vinilo: ");
				velocidadVinilo = teclado.nextInt();
				continuar1 = true;
			} catch (InputMismatchException e) {
				System.out.println("Escriba un número");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar1);
		return velocidadVinilo;
	}

	private static double leePrecioCancionVinilo(Scanner teclado, double precioVinilo, boolean continuar1) {
		do {
			try {
				System.out.println("Escriba el precio de la canción de Vinilo: ");
				precioVinilo = teclado.nextDouble();
				continuar1 = true;
			} catch (InputMismatchException e) {
				System.out.println("Escriba un número");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar1);
		return precioVinilo;
	}

	private static void creaMusicaCasete(Scanner teclado, TiendaMusica tienda) {
		String nombreCasete = null;
		String autorCasete = null;
		double precioCasete = 0;
		int velocidadCasete = 0;
		boolean continuar2 = false;
		System.out.println("Escriba el nombre de la canción de Casete: ");
		nombreCasete = teclado.nextLine();
		System.out.println("Escriba el nombre del Autor de la canción de Casete: ");
		autorCasete = teclado.nextLine();
		leePrecioCancionCasete(teclado, continuar2);
		continuar2 = false;
		
		leeDuracionCasete(teclado, continuar2);
		tienda.agregarCaseteATienda(nombreCasete, autorCasete, precioCasete, velocidadCasete);
	}

	private static void leeDuracionCasete(Scanner teclado, boolean continuar2) {
		do {
			try {
				System.out.println("Escribala duracion del la Casete: ");
				int velocidadVinilo = teclado.nextInt();
				continuar2 = true;
			} catch (InputMismatchException e) {
				System.out.println("Escriba un número");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar2);
	}

	private static void leePrecioCancionCasete(Scanner teclado, boolean continuar2) {
		double precioVinilo;
		do {
			try {
				System.out.println("Escriba el precio de la canción de Casete: ");
				precioVinilo = teclado.nextDouble();
				continuar2 = true;
			} catch (InputMismatchException e) {
				System.out.println("Escriba un número");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar2);
	}

	private static void creaMusicaCd(Scanner teclado, TiendaMusica tienda) {
		boolean continuar2;
		String nombreCD = null;
		String autorCD = null;
		double precioCD = 0;
		int capacidadCD = 0;
		boolean continuar3 = false;
		System.out.println("Escriba el nombre de la canción de CD: ");
		nombreCD = teclado.nextLine();
		System.out.println("Escriba el nombre del Autor de la canción de CD: ");
		autorCD = teclado.nextLine();
		do {
			try {
				System.out.println("Escriba el precio de la canción de CD: ");
				precioCD = teclado.nextDouble();
				continuar3 = true;
			} catch (InputMismatchException e) {
				System.out.println("Escriba un número");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar3);
		continuar2 = false;
		
		capacidadCD = leeCapacidadCd(teclado, capacidadCD, continuar3);
		tienda.agregarCDATienda(nombreCD, autorCD, precioCD, capacidadCD);
	}

	private static int leeCapacidadCd(Scanner teclado, int capacidadCD, boolean continuar3) {
		do {
			try {
				System.out.println("Escriba la Capacidad del la CD: ");
				capacidadCD = teclado.nextInt();
				continuar3 = true;
			} catch (InputMismatchException e) {
				System.out.println("Escriba un número");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar3);
		return capacidadCD;
	}

	private static void creaCliente(Scanner teclado, TiendaMusica tienda) {
		String nombre;
		String apellidos;
		int edad = 0;
		boolean continuar = false;
		System.out.println("Complete los datos del cliente:");
		System.out.println("Nombre:");
		nombre = teclado.nextLine();
		System.out.println("Apellidos:");
		apellidos = teclado.nextLine();
		edad = leeEdadCorrecta(teclado, edad, continuar);
		tienda.agregarClienteATienda(nombre, apellidos, edad);
	}

	private static int leeEdadCorrecta(Scanner teclado, int edad, boolean continuar) {
		do {
			try {
				System.out.println("Edad:");
				edad = teclado.nextInt();
				continuar = true;
			} catch (InputMismatchException e) {
				System.out.println("Escriba la edad correctamente");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar);
		return edad;
	}

	private static void eliminaMusicaCd(Scanner teclado, TiendaMusica tienda) {
		int codigoEliminar2 = 0;
		boolean continuar21 = false;
		do {
			try {
				System.out.println("Indique el código de la canción a eliminar:");
				codigoEliminar2 = teclado.nextInt();
				continuar21 = true;
			} catch (InputMismatchException e) {
				System.out.println("Escriba un número correcto");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar21);
		tienda.eliminarCD(codigoEliminar2);
	}

	private static void eliminaMusicaVinilo(Scanner teclado, TiendaMusica tienda) {
		int codigoEliminar = 0;
		boolean continuar12 = false;
		do {
			try {
				System.out.println("Indique el código de la canción a eliminar:");
				codigoEliminar = teclado.nextInt();
				continuar12 = true;
			} catch (InputMismatchException e) {
				System.out.println("Escriba un número correcto");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar12);
		tienda.eliminarVinilo(codigoEliminar);
	}

	private static void eliminaMusicaCasete(Scanner teclado, TiendaMusica tienda) {
		int codigoEliminar1 = 0;
		boolean continuar20 = false;
		do {
			try {
				System.out.println("Indique el código de la canción a eliminar:");
				codigoEliminar1 = teclado.nextInt();
				continuar20 = true;
			} catch (InputMismatchException e) {
				System.out.println("Escriba un número correcto");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar20);
		tienda.eliminarCasete(codigoEliminar1);
	}

	private static void eliminaCliente(Scanner teclado, TiendaMusica tienda) {
		boolean continuar11 = false;
		int codigo = -1;
		do {
			System.out.println("Escriba el código del cliente que desea eliminar");
			try {
				codigo = teclado.nextInt();
				continuar11 = true;
			} catch (InputMismatchException e) {
				System.out.println("Error en la entrada de datos");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar11);
		tienda.eliminarCliente(codigo);
	}

	private static void procesaVenta(Scanner teclado, TiendaMusica tienda) {
		boolean continuar16 = false;
		int codigoEliminarVenta = -1;
		do {
			System.out.println("Escriba el código de la venta que desea eliminar");
			try {
				codigoEliminarVenta = teclado.nextInt();
				continuar16 = true;
			} catch (InputMismatchException e) {
				System.out.println("Error en la entrada de datos");
			} finally {
				teclado.nextLine();
			}
		} while (!continuar16);
		tienda.eliminarVenta(codigoEliminarVenta);
	}
}

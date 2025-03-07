package Conectores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner pt = new Scanner(System.in);
		int select;

		do {
			System.out.println("\n--- {MENÚ PRINCIPAL} ---");
			System.out.println("1) Listar todos los productos");
			System.out.println("2) Listar todos los productos por sección");
			System.out.println("3) Añadir un producto nuevo");
			System.out.println("4) Eliminar un producto");
			System.out.println("5) Crear un pedido nuevo");
			System.out.println("6) Listar pedidos");
			System.out.println("7) Salir");
			System.out.println();

			System.out.println("Seleccione una opcion: ");
			select = pt.nextInt();

			if (select == 1) {
				listarProductos();
			} else if (select == 2) {
				listarPorSeccion();
			} else if (select == 3) {

			} else if (select == 4) {

			} else if (select == 5) {

			} else if (select == 6) {

			} else if (select == 7) {

			}
		} while (select >= 1 || select <= 7);
	}

	public static void listarProductos() throws InterruptedException {
		// Parametros para la conexion
		Connection conexion = null;
		String urlBbdd = "jdbc:mysql://localhost:3306/tienda";
		String usuario = "root";
		String password = "";

		try {
			// Me conecto al servidor
			conexion = DriverManager.getConnection(urlBbdd, usuario, password);

			// Preparo la query a ejecutar
			String sentenciaSql = "SELECT id, nombre, precio, stock FROM productos";
			PreparedStatement sentencia = null;

			// Preparo el objeto que recogerá el resultado
			ResultSet resultado = null;

			try {
				// Preparo la query y la ejecuto
				sentencia = conexion.prepareStatement(sentenciaSql);
				resultado = sentencia.executeQuery();
				
				System.out.println();
				Thread.sleep(1000);
				System.out.println("Listando...");
				Thread.sleep(1000);
				System.out.println();

				// Recorro todos los resultados
				while (resultado.next()) {
					System.out.println("Id: " + resultado.getInt(1));
					System.out.println("Nombre: " + resultado.getString(2));
					System.out.println("Precio: " + resultado.getFloat(3));
					System.out.println("Stock: " + resultado.getInt(4));
				}

				// Falta cerrar recursos

			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	public static void listarPorSeccion() throws InterruptedException {
		Scanner pt = new Scanner(System.in);
		// Parametros para la conexion
				Connection conexion = null;
				String urlBbdd = "jdbc:mysql://localhost:3306/tienda";
				String usuario = "root";
				String password = "";

				
				try {
					// Me conecto al servidor
					conexion = DriverManager.getConnection(urlBbdd, usuario, password);
					
					System.out.print("Indica la sección: ");
					String selectSeccion = pt.next();
					
					// Preparo la query a ejecutar
					String sentenciaSql = "SELECT id, nombre, precio, stock FROM productos WHERE seccion = "+ selectSeccion;
					PreparedStatement sentencia = null;

					// Preparo el objeto que recogerá el resultado
					ResultSet resultado = null;

					try {
						// Preparo la query y la ejecuto
						sentencia = conexion.prepareStatement(sentenciaSql);
						resultado = sentencia.executeQuery();
						
						System.out.println();
						Thread.sleep(1000);
						System.out.println("Listando...");
						Thread.sleep(1000);
						System.out.println();

						// Recorro todos los resultados
						while (resultado.next()) {
							System.out.println("Id: " + resultado.getInt(1));
							System.out.println("Nombre: " + resultado.getString(2));
							System.out.println("Precio: " + resultado.getFloat(3));
							System.out.println("Stock: " + resultado.getInt(4));
						}

						// Falta cerrar recursos

					} catch (SQLException sqle) {
						sqle.printStackTrace();
					}

				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
	}

	public static void AñadirProducto() throws InterruptedException {
		// Parametros para la conexion
				Connection conexion = null;
				String urlBbdd = "jdbc:mysql://localhost:3306/tienda";
				String usuario = "root";
				String password = "";

				try {
					// Me conecto al servidor
					conexion = DriverManager.getConnection(urlBbdd, usuario, password);

					Scanner pt = new Scanner(System.in);
					String id = pt.next();
					String id = pt.next();
					String id = pt.next();
					String id = pt.next();
					 
					
					// Preparo la query a ejecutar
					String sentenciaSql = "INSERT INTO productos (id, nombre, precio, stock) VALUES (?, )";
					PreparedStatement sentencia = null;

					// Preparo el objeto que recogerá el resultado
					ResultSet resultado = null;

					try {
						// Preparo la query y la ejecuto
						sentencia = conexion.prepareStatement(sentenciaSql);
						resultado = sentencia.executeQuery();
						
						System.out.println();
						Thread.sleep(1000);
						System.out.println("Listando...");
						Thread.sleep(1000);
						System.out.println();

						// Recorro todos los resultados
						while (resultado.next()) {
							System.out.println("Id: " + resultado.getInt(1));
							System.out.println("Nombre: " + resultado.getString(2));
							System.out.println("Precio: " + resultado.getFloat(3));
							System.out.println("Stock: " + resultado.getInt(4));
						}

						// Falta cerrar recursos

					} catch (SQLException sqle) {
						sqle.printStackTrace();
					}

				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
	}
	
}

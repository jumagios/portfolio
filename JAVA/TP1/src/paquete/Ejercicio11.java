package paquete;

/* Realizá un programa que resuelva el siguiente problema:
Deberás solicitar el ingreso de una fecha de compra (String en el siguiente formato:
YYYYMMDD), un nombre de comprador, un nombre de producto y una cantidad y precio del
producto comprado. Mostrá a modo de ticket, la información ingresada y el monto a pagar.
Modelo de Ticket:
Fecha de Compra: YYYYMMDD
Nombre del Comprador: xxxxx xxxxx
Producto solicitado: xxxxx
Cantidad solicitada: xx
Precio Unitario: $xxx
Total a Pagar: $xxxxx 
*/

import java.util.Scanner;

public class Ejercicio11 {
	
	static Scanner ingreso= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fechaCompra;
		String nombre;
		String producto;
		int cantidad;
		double precio;
		
		System.out.println("Bienvenido/a");
		fechaCompra= ingresoTexto("Ingresar una fecha de compra con el formato YYYYMMDD:");
		nombre= ingresoTexto("Ingrese el nombre del comprador:");
		producto= ingresoTexto("Ingrese el nombre del producto:");
		cantidad= ingresoCant("Ingrese la cantidad que desea:");
		precio= ingresoPre("Ingrese el precio del producto:");
		
		mostrarTicket(fechaCompra,nombre, producto, cantidad, precio);
	}
	
	public static void mostrarTicket (String fecha, String nombre, String produc, int cant, double precio) {
		
		System.out.println("-----------------------------");
		System.out.println("Modelo de Ticket: 1");
		System.out.println("Fecha de Compra: " + fecha);
		System.out.println("Nombre del comprador: " + nombre);
		System.out.println("Producto solicitado: " + produc);
		System.out.println("Cantidad solcitada: " + cant);
		System.out.println("Precio Unitario: $" + precio);
		System.out.println("------------------------------");
		System.out.println("TOTAL A PAGAR: $" + (cant*precio));
		
	}
	
	public static String ingresoTexto(String mensaje) {
		String texto;
		
		System.out.println(mensaje);
		texto= ingreso.nextLine();
		
		return texto;
	}
	
	public static int ingresoCant(String mensaje) {
	  int num;
	
	System.out.println(mensaje);
	num= ingreso.nextInt();
	
	return num;
	}
	
	public static double ingresoPre(String mensaje) {
		double num;
		
		System.out.println(mensaje);
		num= ingreso.nextInt();
		return num;
		
	}
}

package paquete;

/* 14. Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros.
En un principio, el usuario debe especificar la operación que desea realizar (s para la suma, r para la resta, p para el producto y d para la división) y 
luego, deberá ingresar dos números enteros para así realizar la operación. Informar el resultado por pantalla.
Nota: Se recomienda el empleo de una sentencia switch.
*/

import java.util.Scanner;

public class Ejercicio14 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String operacion = ingresarOperacion(sc);
		int num1= ingresoNum(sc, 1);
		int num2= ingresoNum(sc, 2);
		Calculadora(sc, num1, num2, operacion);
		
		
	}

	private static void Calculadora(Scanner sc, int num1, int num2, String operacion) {
		switch(operacion) {
		case "s":
			System.out.println("La suma de "+num1+ " y "+num2+ " es: "+(num1+num2));
			break;
		case "r":
			System.out.println("La resta de "+num1+ " y "+num2+ " es: "+(num1-num2));
			break;
		case "d":
			System.out.println("La division de "+num1+ " y "+num2+ " es: "+(num1/num2));
			break;
		case "p":
			System.out.println("El producto de "+num1+ " y "+num2+ " es: "+(num1*num2));
			break;
		default:
			System.out.println("Operacion Invalida");
		}
		
	}

	private static int ingresoNum(Scanner sc, int i) {
		System.out.println("Ingrese numero "+i+":");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public static String ingresarOperacion(Scanner sc) {
		
		System.out.println("------------------");
		System.out.println("Elegir una opcion:");
		System.out.println("s - Suma");
		System.out.println("r - Resta");
		System.out.println("p - Producto");
		System.out.println("d - Division");
		System.out.println("------------------");
		
		
		
		return sc.nextLine();
		
	}


	

	
	}

	

	


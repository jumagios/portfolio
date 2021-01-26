package paquete;

/*Realizar un programa en el cual se pida el ingreso de dos números enteros num1 y num2 y el signo de la operación (“+” para sumar, “-” para restar, “/” para dividir, “*” para multiplicar y 
 * “%” para obtener el resto o módulo). Mientras que la operación no sea “f” (de “fin”) aplicar la operación elegida a n1 y n2. Tener en cuenta que la división por 0 es imposible. 
 * Realizar una función para cada operación, que reciba por parámetros n1 y n2, y retorne el resultado de hacer la operación entre los dos números.
 */

import java.util.Scanner;

public class Ejercicio12 {
	
	static Scanner ingreso =new Scanner(System.in);
	final static String FIN="f";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		String operacion="";
		
		do {
			
		num1=ingresarNum("Ingresar el primer numero:");
		num2=ingresarNum("Ingresar el segundo numero:");
		if (num2==0) {
			System.out.println("No se puede dividir por 0");
		} 
		}
		while (operacion.equals(FIN) || (num2==0)); {
				operacion=ingresarOperacion("");
			}
		switch (operacion) {
		case "+":
			suma(operacion,num1,num2);
			break;
		case "-":
			resta(operacion,num1,num2);
			break;
		case "/":
			division(operacion,num1,num2);
			break;
		case "*":
			multiplicacion(operacion,num1,num2);
			break;
		case "%":
			modulo(operacion,num1,num2);
			break;
		default:
			System.out.println("Operacion Invalida");
		}
		
		
	}

	private static void modulo(String operacion, int num1, int num2) {
			System.out.println("El modulo de "+num1+" % "+num2+" es = "+(num1%num2));
	}

	private static void multiplicacion(String operacion, int num1, int num2) {
		
			System.out.println("La multiplicacion de "+num1+" * "+num2+" es = "+(num1*num2));
	}

	private static void division(String operacion, int num1, int num2) {
			System.out.println("La division de "+num1+" / "+num2+" es = "+(num1/num2));

	}

	private static void resta(String operacion, int num1, int num2) {
			System.out.println("La resta de "+num1+" - "+num2+" es = "+(num1-num2));
	}

	private static void suma(String operacion, int num1, int num2) {
			System.out.println("La suma de "+num1+" + "+num2+" es = "+(num1+num2));
	}

	private static String ingresarOperacion(String string) {
		System.out.println("-------------------------");
		System.out.println("Ingrese una opcion:");
		System.out.println("+ para sumar");
		System.out.println("- para restar");
		System.out.println("/ para dividir");
		System.out.println("* para multiplicar");
		System.out.println("% para modulo");
		System.out.println("f para salir");
		System.out.println("-------------------------");
		
		return ingreso.nextLine();
	}

	private static int ingresarNum(String mensaje) {
		int num;
		System.out.println(mensaje);
		num=ingreso.nextInt();
		ingreso.nextLine();
		
	
		return num;
	}

}

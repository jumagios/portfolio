package paquete;

/* Realizar un programa en el cual se pida al usuario el ingreso de dos n�meros enteros num1 y num2, cuya relaci�n de valores es que el primero es menor o igual al segundo y 
 * mostrar por pantalla la secuencia de n�meros que existe entre ambos:
a) Incluy�ndolos;
b) Excluy�ndolos.
Obs: Validar que el primer n�mero sea menor o igual al segundo. Pedir el ingreso de ambos n�meros las veces que sea necesario hasta que se cumpla dicha condici�n.
�Qu� pasar�a si esta validaci�n no la realiz�ramos y el ingreso es incorrecto?
 */

import java.util.Scanner;

public class Ejercicio4 {

	static Scanner ingreso =new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		
			num1= ingresoNum("Ingresar el primer numero entero:");
			num2= ingresoNum("Ingresar el segundo numero entero:");
			
	while (num1>num2) {
		
		num1= ingresoNum("Ingresar el primer numero entero:");
		num2= ingresoNum("Ingresar el segundo numero entero:");
	}
	
	System.out.println("Excluyendo");
	System.out.println("Los numeros son: " + num1+ " y " +num2);
	int num = num1;
	num++;
	while (num < num2) {
		System.out.println("El numero es: " + num);
		num++;
	}
		
		System.out.println("Incluyendo");
		System.out.println("Los numeros son: " + num1+ " y " +num2);
		num = num1;
		while (num<=num2) {
			System.out.println("El numero es: " + num);
			num++;
	}
		mostraSecuencia(num1,num2);
		
		
		
	}
	
	
	

	
	

	private static void mostraSecuencia(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}







	private static int ingresoNum(String mensaje) {
		
		int num;
		System.out.println(mensaje);
		num=ingreso.nextInt();
		ingreso.nextLine();
	
		return num;
	}

}

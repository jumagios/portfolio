package paquete;

/* Realizá un programa que pida al usuario ingresar dos números enteros num1 y num2. Luego, mostrar el resultado de la suma entre ambos, 
 * utilizando el siguiente formato: “La suma entre “ + num1 + “ y “ + num2 + “ da como resultado “ + num1 + num2
 * */
 

import java.util.Scanner;

public class Ejercicio4 {

	static Scanner ingreso = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		
		
		
		System.out.println("Ingresar el valor del primer numero entero:");
		num1 = ingreso.nextInt();
		System.out.println("Ingresar el valor del segundo numero entero:");
		num2 = ingreso.nextInt();
		
		
		System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + (num1 + num2));
	}

}

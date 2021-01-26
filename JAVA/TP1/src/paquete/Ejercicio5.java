 package paquete;
 
 /*5. Realizá un programa que, dados dos números enteros num1 y num2 cargados desde teclado por el usuario, 
  * muestre el resultado de la división del primero por el segundo siguiendo el formato num1 + “ / “ + num2 + “ = “ + resultado.
En el caso de que el segundo valor num2 sea cero, mostrar el siguiente mensaje de error: “No se puede dividir por cero”.
  */


import java.util.Scanner;

public class Ejercicio5 {
	
	static Scanner ingreso = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		double div;

		System.out.println("Ingrese el valor del primer numero:");
		num1 = ingreso.nextInt();
		System.out.println("Ingrese el valor del segundo numero:");
		num2 = ingreso.nextInt();
		
		if (num2!=0) {
			div= (double) num1/num2;
			System.out.println(num1 + " / "+ num2 + " = " + div);
		}
		
		else {
			System.out.println("No se puede dividir por 0");
		}
		
	}

}

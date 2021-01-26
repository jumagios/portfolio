package paquete;

/* 6. Realizá un programa que solicite al usuario el ingreso por teclado un valor entero mayor que 0 en una variable llamada num1 y 
 * muestre un mensaje por pantalla indicando "el número es par" o "el número es impar". Deberá utilizar el operador “módulo” es el caracter %.
*/

import java.util.Scanner;

public class Ejercicio6 {
	
	static Scanner ingreso = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creamos las variables a usar
		
		int num1;
		
		// en el main, llamamos el metodo definido
		
		num1=ingresoNum("Por favor ingrese un numero entero mayor que 0:");
		
		if (num1>0) {
		if (num1%2==0) {
		System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		}else {
			System.out.println("El numero no puede ser menor o igual a 0");
		}



	}
	//Declaracion de metodo
	public static int ingresoNum(String mensaje) {
		int num;
		
		System.out.println(mensaje);
		num=ingreso.nextInt();
		ingreso.nextLine();
		
		return num; }

}

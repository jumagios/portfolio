package paquete;

import java.util.Scanner;

/*
 13. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
� Si trabaja 40 horas o menos se le paga $16 por hora (crear una constante para almacenar el 16)
� Si trabaja m�s de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra. (crear una constante para almacenar el 20)
Pedir al usuario que ingrese la cantidad de horas trabajadas en la semana, y mostrar por pantalla el salario correspondiente.
 */

public class Ejercicio13 {
	
	static Scanner ingreso =new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		final int primerasHoras=16;
		final int pasadasHoras=20;
		final int maximoHoras=40;
		int horas;
		int salario;
		
		horas=ingreseNumero("Ingrese las horas que trabajo");
		salario= calcularSalario(horas, primerasHoras, pasadasHoras, maximoHoras);
		System.out.println("El salario es de: $" + salario);
	}

	private static int calcularSalario(int horas, int primerasHoras, int pasadasHoras, int maximoHoras) {
		
		int result = 0;
		
		if (horas>maximoHoras) {
			result= (maximoHoras*primerasHoras)+((horas-maximoHoras)*pasadasHoras);
			
		} else { 
			result= (horas*primerasHoras);
		} 
		
		return result;
	}

	private static int ingreseNumero(String mensaje) {
		
		int result;
		
		System.out.println(mensaje);
		result=ingreso.nextInt();
		ingreso.nextLine();
				
		return result;
	}
	
}

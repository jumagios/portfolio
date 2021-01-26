package paquete;

/*Escribí la función booleana esMultiplo(int num1, int num2) que recibirá dos enteros y devolverá verdadero cuando el primero sea múltiplo de segundo 
 * (de lo contrario, devolverá falso). Para saber si un número es múltiplo de otro utilizá el operador % (módulo), que devuelve el resto de la división. 
 * Probá la función desde el main con los lotes de datos (5, 3) y (15, 3).
 * 
 */

import java.util.Scanner;

public class Ejercicio8 {
	static Scanner ingreso =new Scanner(System.in);
	final static int resto=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		boolean esMultiplo;
	
		num1=ingresoNumero("Ingresar el primer numero entero:");
		num2=ingresoNumero("Ingresar el segundo numero entero:");
		
		esMultiplo=devolverFuncion(num1,num2);
		
		System.out.println(esMultiplo);
	
		
	}

	private static boolean devolverFuncion(int num1, int num2) {
		boolean esMultiplo;
		
		if(num1%num2==0) {
			esMultiplo=true;	
		} else {
			esMultiplo=false;
		}
		return false;
	}

	private static int ingresoNumero(String mensaje) {
		int num;
		System.out.println(mensaje);
		num=ingreso.nextInt();
		ingreso.nextLine();
		
		return num;
	}

}

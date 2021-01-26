package paquete;

/*Escrib� la funci�n booleana esMultiplo(int num1, int num2) que recibir� dos enteros y devolver� verdadero cuando el primero sea m�ltiplo de segundo 
 * (de lo contrario, devolver� falso). Para saber si un n�mero es m�ltiplo de otro utiliz� el operador % (m�dulo), que devuelve el resto de la divisi�n. 
 * Prob� la funci�n desde el main con los lotes de datos (5, 3) y (15, 3).
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

package paquete;

/* Realiz� un programa que al ingresar dos n�meros enteros positivos llamados A y B se calcule el producto de �stos a trav�s de sumas sucesivas. 
 * Por ejemplo, si los n�meros son 4 y 2, hacer 4 + 4; si son 5 y 3, hacer 5 + 5 + 5.
�Qu� pasa si la diferencia entre los dos n�meros es muy grande? �Influye cu�l se usa para sumar y cu�l para contar la cantidad de sumas hechas?
 */

import java.util.Scanner;

public class Ejercicio11 {
	
	static Scanner ingreso =new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numA,numB,contador=1,suma=0;
		
		
		numA=ingresarNum("Ingresa el primer numero:");
		numB=ingresarNum("Ingresa el segundo numero:");
		
		for (contador=1; contador<=numB; contador++) {
			
			suma= suma + numA;
			System.out.println(suma);
		}
	}

	

	private static int ingresarNum(String mensaje) {
		int num;
		System.out.println(mensaje);
		num=ingreso.nextInt();
		ingreso.nextLine();
		return num;
	}

}

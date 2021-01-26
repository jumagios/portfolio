package paquete;

/* Realizá un programa que al ingresar dos números enteros positivos llamados A y B se calcule el producto de éstos a través de sumas sucesivas. 
 * Por ejemplo, si los números son 4 y 2, hacer 4 + 4; si son 5 y 3, hacer 5 + 5 + 5.
¿Qué pasa si la diferencia entre los dos números es muy grande? ¿Influye cuál se usa para sumar y cuál para contar la cantidad de sumas hechas?
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

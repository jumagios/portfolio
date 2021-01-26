package paquete;

/*15. Existen dos reglas que identifican dos conjuntos de valores:
- El número es de un solo dígito.
- El número es impar.
A partir de estas reglas, creá un algoritmo que asigne a las variables booleanas estaEnA, estaEnB, estaEnAmbos y noEstaEnNinguno el valor verdadero o falso, 
según corresponda, para indicar si el valor ingresado pertenece al primer conjunto, al segundo, a ambos o a ninguno, respectivamente. Definí un lote de prueba de varios 
números y probá el algoritmo, escribiendo los resultados.
*/

import java.util.Scanner;

public class Ejercicio15 {
	static final int dadoWin=6;
	static Scanner ingreso =new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean estaEnA;
		boolean estaEnB;
		boolean estaEnAmbos;
		boolean noEstaEnNinguno;
		int num;
		
		do {
			num= ingresoNum("Ingrese un numero entero de 1 a 99:");
			
			if (num<10) {
				estaEnA = true;
			} else {
				estaEnA = false;
			}
			
			if (num % 2 == 0) {
				estaEnB = false;
			} else {
				estaEnB =true;
			}
			if (estaEnA && estaEnB) {
				estaEnAmbos = true;
			} else {
				estaEnAmbos = false;
			}
			if (!estaEnA && !estaEnB) {
				noEstaEnNinguno = true;
			} else {
				noEstaEnNinguno = false;
			}
			
			mostrarMensaje(estaEnA, estaEnB, estaEnAmbos, noEstaEnNinguno);
			
		} while (num != 100);
		
		
		
		
		
	}
	
	private static void mostrarMensaje(boolean estaEnA, boolean estaEnB, boolean estaEnAmbos, boolean noEstaEnNinguno) {
		System.out.println("-------------------------------------------------------");
		System.out.println("El numero tiene solo un digito: " +estaEnA);
		System.out.println("El numero es impar: " +estaEnB);
		System.out.println("El numero es impar y tiene solo un digito: " +estaEnAmbos);
		System.out.println("El numero no esta en ninguna de las variables: " +noEstaEnNinguno);
		System.out.println("-------------------------------------------------------");
		
	}

	private static int ingresoNum(String mensaje) {
		// TODO Auto-generated method stub
		int result;
		
		System.out.println(mensaje);
		result= ingreso.nextInt();
		ingreso.nextLine();
		
		return result;
	}

}

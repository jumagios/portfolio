package paquete;

// Realizá un programa que lea una serie de números ingresados por el usuario mientras que el promedio entre todos sea menor a 20. Informar la cantidad de valores leídos.

import java.util.Scanner;

public class Ejercicio5 {
	static Scanner ingreso =new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,promedio = 0,suma = 0,contador;
		contador=0;
		
		while(promedio<20) {
			num=ingresoNum("Ingresar un numero");
			contador++;
			suma= suma+num;
		}
		promedio= suma/contador;
	
		System.out.println("La cantidad de valores leidos son: " + contador);
	}
private static int ingresoNum(String mensaje) {
		
		int num;
		System.out.println(mensaje);
		num=ingreso.nextInt();
		ingreso.nextLine();
	
		return num;
}
}
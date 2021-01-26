package paquete;

import java.util.Scanner;

/* Suponiendo que el primer día de la semana es el Domingo, pedir un número entre 1 y 7 (inclusive) 
 y mostrar el nombre del día correspondiente. Si el día no está en el rango permitido debe emitir por 
 pantalla el mensaje de error "El día ingresado no es válido".
 */

public class Ejercicio8 {
	
	static Scanner ingreso= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int DOM=1;
		final int LUN=2;
		final int MAR=3;
		final int MIE=4;
		final int JUE=5;
		final int VIE=6;
		final int SAB=7;
		final String DOMINGO= "DOMINGO";
		final String LUNES= "LUNES";
		final String MARTES= "MARTES";
		final String MIERCOLES= "MIERCOLES";
		final String JUEVES= "JUEVES";
		final String VIERNES= "VIERNES";
		final String SABADO= "SABADO";
		
		int dia;
		dia= ingresoNum("Ingresa del 1 al 7(inclusive) y te digo que dia es:");
	
		switch(dia) {
		
		case DOM:
			System.out.println(DOMINGO);
			break;
		case LUN:
			System.out.println(LUNES);
			break;
		case MAR:
			System.out.println(MARTES);
			break;
		case MIE:
			System.out.println(MIERCOLES);
			break;
		case JUE:
			System.out.println(JUEVES);
			break;
		case VIE:
			System.out.println(VIERNES);
			break;
		case SAB:
			System.out.println(SABADO);
			break;
		default:
			System.out.println("dato invalido");
				
		}
	}
	
	public static int ingresoNum(String mensaje) {
		int dia;
		
		System.out.println(mensaje);
		dia=ingreso.nextInt();
		ingreso.nextLine();
		
		return dia; }
}

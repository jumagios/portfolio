package paquete;

/*Realizá un programa en el cual se pida el nombre y el promedio de 10 alumnos.
Al finalizar, debe mostrar por pantalla el nombre y el promedio del mejor.
*/

import java.util.Scanner;

public class Ejercicio6 {
	 
	static Scanner ingreso =new Scanner (System.in);
	final static int tope=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int num, i;
		String alumno;
		int maxNota=0;
		String mejorAlum="";
		i=0;
		while (i<tope) {
			i++;
			alumno=ingresoTexto("Ingrese el nombre del alumno:");
			num=ingresoNum("Ingresar promedio: ");	
			if (num>maxNota) {
				maxNota=num;
				mejorAlum=alumno;
			}
			
			
		}
		System.out.println("La mejor nota es: " + maxNota + " y le pertenece a: " + mejorAlum);
		
	}
private static String ingresoTexto(String mensaje) {
		String alumno;
		System.out.println(mensaje);
		alumno=ingreso.next();
		ingreso.nextLine();
		
		return alumno;
	}
private static int ingresoNum(String mensaje) {
		
		int num;
		System.out.println(mensaje);
		num=ingreso.nextInt();
		ingreso.nextLine();
	
		return num;
}
}

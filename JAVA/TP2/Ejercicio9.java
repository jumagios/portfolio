package paquete;

// Realizar un programa que le pida al usuario que ingrese 5 veces 3 valores enteros cada vez. Emití el promedio de cada grupo.

import java.util.Scanner;

public class Ejercicio9 {
	
	static Scanner ingreso =new Scanner(System.in);

	public static void main(String[] args) {
		int num1,num2,num3,suma1=0,prom1=0,suma2=0,prom2=0,suma3=0,prom3=0,contador=0;
		int i;
		
		for (i=0;i<5;i++) {
			num1=ingresoNum("Ingrese el primer valor: ");
			num2=ingresoNum("Ingrese el segundo valor: ");
			num3=ingresoNum("Ingrese el tercer valor: ");
			contador++;
		suma1=suma1+num1;
		prom1=suma1/contador;
		suma2=suma2+num2;
		prom2=suma2/contador;
		suma3=suma3+num3;
		prom3=suma3/contador;
			
		}
		System.out.println("El promedio del primer grupo es: " +prom1);
		System.out.println("El promedio del primer grupo es: " +prom2);
		System.out.println("El promedio del primer grupo es: " +prom3);
	}

	private static int ingresoNum(String mensaje) {
		int num;
		
		System.out.println(mensaje);
		num=ingreso.nextInt();
		ingreso.nextLine();
		return num;
	}

}

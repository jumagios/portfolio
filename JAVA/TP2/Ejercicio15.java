package paquete;

/* Una empresa de telefonía nos pide escribir un programa que le brinde información sobre el consumo de sus clientes residenciales. 
 * Para ello se ingresa, por cada una de las llamadas realizadas en el último mes:
 Código de Cliente (int de 5 dígitos, entre 10001 y 99999, 0 = fin)
 Duración de la llamada nro. (int > 0).
 Tipo de abono (“a”, “b” o “c”).
Para calcular el importe de cada llamada, nos informan que el costo por minuto, de acuerdo al tipo de abono, es el siguiente:
 Abono “a” => $2 el minuto
 Abono “b” => Hasta 5 minutos, $2 el minuto; Más de 5 minutos, $1,5 el minuto.
Abono “c” => $1 el minuto con un máximo de $10 (Ej. si habla 15 minutos paga $10).
Se pide informar:
1. El importe acumulado a recaudar por cada tipo de abono.
2. La cantidad de minutos de la llamada más larga.
3. La cantidad de llamadas de menos de 6 minutos.
4. El precio promedio por llamada.
*/

import java.util.Scanner;

public class Ejercicio15 {
	
	static Scanner ingreso =new Scanner(System.in);
	final static String ABONO_A="a";
	final static String ABONO_B="b";		
	final static String ABONO_C="c";
	
	public static void main(String[] args) {
		
		int codigoCliente, duracionLlamada,max=0,menos6=0,contador=0;
		String tipoAbono;
		double calcularPago, totalA=0,totalB=0,totalC=0,total=0,promedio=0;

		codigoCliente=ingresarNum("Ingresar el Codigo de Cliente [10001-99999] o 0 para salir");
		while (codigoCliente!=0) {
			duracionLlamada=ingresarLlamada("Ingresar la duracion de la llamada en minutos");
			contador++;
			max=llamadaMasLarga(duracionLlamada,max);
			if (duracionLlamada<6) {
					menos6++;
				}			
			tipoAbono=ingresarTexto("Ingresar el Tipo de Abono [a,b,c]");
			calcularPago=calculo(duracionLlamada,tipoAbono);
			if(tipoAbono.equals(ABONO_A)) {
				totalA=totalA+calcularPago;
			} else {
				if(tipoAbono.equals(ABONO_B)) {
					totalB=totalB+calcularPago;
				} else {
					if(tipoAbono.equals(ABONO_C)) {
						totalC=totalC+calcularPago;
					}
				}
			}			
			total=totalA+totalB+totalC;
			codigoCliente=ingresarNum("Ingresar el Codigo de Cliente [10001-99999] o 0 para salir");
		}	
		promedio=(total/contador);
		System.out.println("El importe acumulado del Abono A es de: $" + totalA);
		System.out.println("El importe acumulado del Abono B es de: $" + totalB);
		System.out.println("El importe acumulado del Abono C es de: $" + totalC);
		System.out.println("-------------------------------------------------");
		System.out.println("La llamada mas larga fue de: "+max+" min");
		System.out.println("La cantidad de llamadas de menos de 6 minutos fueron: "+menos6);
		System.out.println("El precio promedio por llamada fue de: $"+promedio);		
	}
	private static int llamadaMasLarga(int llama, int max) {
		int num;		
		if (llama>max) {
			max=llama;
			}
		num=max;		
		return num;
	}
	private static double calculo(int llamada, String tipoAbono) {
		double num;		
		if (tipoAbono.equals(ABONO_A)) {
			num=(llamada*2);
		}  else {
			if (tipoAbono.equals(ABONO_B)){
				if (llamada<5) {
					num=(llamada*2); 
				} else {
					num=(llamada*1.5);
				}
			}else {
					if(tipoAbono.equals(ABONO_C)) {
				}
					if(llamada>10) {
						num=10;
					} else {
						num=(llamada*1);
					}
				}
			}
		return num;
		}	
	private static String ingresarTexto(String mensaje) {
		String tipoAbono;
		System.out.println(mensaje);
		tipoAbono=ingreso.next();
		 while ((!tipoAbono.equals(ABONO_A)) && (!tipoAbono.equals(ABONO_B)) && (!tipoAbono.equals(ABONO_C)) ) {
			 System.out.println("ERROR");
			 System.out.println(mensaje);
			 tipoAbono=ingreso.next();
		 }
		 return tipoAbono;
		}
	private static int ingresarLlamada(String mensaje) {
		int num;
		System.out.println(mensaje);
		num=ingreso.nextInt();
			while (num<0) {
			System.out.println("ERROR");
			System.out.println(mensaje);
			num=ingreso.nextInt();			
		}
		return num;
	}
	private static int ingresarNum(String mensaje) {
		int num;
		System.out.println(mensaje);
		num=ingreso.nextInt();
			if (num==0) {				
				return num;
			} else {			
				while ((num<=10000) || (num>99999)) {
					System.out.println("ERROR");
					System.out.println(mensaje);
					num=ingreso.nextInt();
			}			
		}
		return num;
	}
}

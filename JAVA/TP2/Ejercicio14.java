package paquete;

/* Una empresa dedicada al transporte de documentación necesita procesar su facturación mensual a partir de los resúmenes de viajes realizados para cada uno de sus clientes.
Quieren saber también cuál es el promedio pagado por empresa y el valor de la factura más cara. Para el cálculo de cada factura se sabe que por mes cada empresa tiene 
derecho a dos viajes diarios libres con un abono de $8500, cobrando además por cada viaje adicional $100. En caso de que la empresa supere los 30 viajes adicionales, por promoción, se le hará un descuento del 10% sobre el total mensual facturado. Por cada empresa nos informan el nombre de la misma y la cantidad de viajes adicionales (entero >=0, siempre menor a 1000), y nosotros debemos mostrar en pantalla su nombre y el importe total de la factura.
Por ejemplo: La empresa “Los Nenes”, que necesitó hacer 18 viajes adicionales en el mes, deberá pagar una factura de $10300 (Precio base + viajes adicionales * $100 = $8500 + $1800). Por pantalla, entonces, debe mostrarse: La empresa Los Nenes debe abonar $10300 En cambio, la empresa “Software Industrial SRL”, que realizó 150 viajes adicionales, deberá pagar una factura de $21150
 * (Precio base + viajes adicionales * 100 - bonificación 10% = $8500 + $15000 - $2350). Aquí debe mostrarse: La empresa Software Industrial SRL 
 * debe abonar $21150 Si éstas fueran todas las empresas, al finalizar se mostrará el promedio (acumulado / cantidad de empresas = 34150 / 2): 
 * El promedio pagado por empresa en el pasado mes fue de $15725 La mayor factura es por un total de $21150
 * 
 */

import java.util.Scanner;

public class Ejercicio14 {
	
	static Scanner ingreso =new Scanner(System.in);
	final static int PRECIO_BASE=8500;
	final static int VIAJE_ADIC=100;
	
	public static void main(String[] args) {
		int viajes, calculo, contador=0, promedio=0,suma=0,max=0;
		String empresa;
		String continuar="";
		
		while(!continuar.equals("0")) {
			empresa=ingresarTexto("Ingresar el nombre de la empresa:");
			viajes=ingresarNum("Ingrese la cantidad de viajes adicionales:");
			calculo=obtenerFactura(viajes);
			contador++;
			max=obtenerMayorF(max,calculo);
			suma=suma+calculo;
			System.out.println("La empresa " + empresa + " debe abonar $" + calculo);
			continuar=deseaCont("Presione 1 para continuar o 0 para salir");
		}
		promedio=sacarPromedio(contador,suma);
		System.out.println("El promedio pagado por empresa en el pasado mes fue de $" + promedio);
		System.out.println("La mayor factura es por un total de: $" +max);
		
	}

	private static int obtenerMayorF(int max, int calculo) {
		int num;
		
		if (calculo>max) {
			max=calculo;
			}
		num=max;
		
		return num;
	}

	private static int sacarPromedio(int contador, int suma) {
		int num;
		
		num=(suma/contador);
		
		return num;
	}

	private static int obtenerFactura(int viajes) {
		int num;
		
		if(viajes>30) {
			num=(PRECIO_BASE+(viajes*VIAJE_ADIC))-((viajes*VIAJE_ADIC+PRECIO_BASE)/10);
		} else {	
			num=(PRECIO_BASE+(viajes*VIAJE_ADIC));
		}
		
		return num;
	}

	private static String deseaCont(String mensaje) {
		String continuar;
		
		System.out.println(mensaje);
		continuar=ingreso.next();
		ingreso.nextLine();
		
		return continuar;
	}

	private static int ingresarNum(String mensaje) {
		int num;
		System.out.println(mensaje);
		num=ingreso.nextInt();
			while ((num<=0) || (num>1000)) {
			System.out.println("ERROR");
			System.out.println(mensaje);
			num=ingreso.nextInt();
			
		}
		return num;
	}

	private static String ingresarTexto(String mensaje) {
		String empresa;
		System.out.println(mensaje);
		empresa=ingreso.nextLine();
		
		
		return empresa;
	}

}

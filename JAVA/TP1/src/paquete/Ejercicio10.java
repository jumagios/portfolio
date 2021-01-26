package paquete;

/*10. Realizá un programa que resuelva el siguiente problema: Nos piden desarrollar un programa que informe si un estacionamiento se encuentra o no abierto según la hora ingresada por el usuario.
Nosotros sabemos que el estacionamiento se encuentra abierto entre las 10 y las 18hs. (Crear constante HORA_APERTURA = 10, y HORA_CIERRE = 18).
Al iniciar el programa, se le pedirá al usuario que ingrese la hora, y deberemos setear una variable booleana llamada estaAbierto en true o false, según corresponda, 
e informar por pantalla mediante la misma si el estacionamiento se encuentra abierto o no.
Obs: En el caso de que el usuario ingrese una hora menor a 0 o mayor a 24, mostrar el mensaje: “Ha ingresado una hora incorrecta”
*/
import java.util.Scanner; 

public class Ejercicio10 {
	
	static Scanner ingreso = new Scanner(System.in);

	public static void main(String[] args) {
		
		
	//variables
	    final int HORA_APERTURA = 10;
	    final int HORA_CIERRE = 18;
		int hora;
		boolean estaAbierto;
		
		System.out.println("Bienvenido/a");
		hora= ingresoNum("Por favor ingrese una hora para saber si el estacionamiento esta abierto o no:");
		estaAbierto= (hora >= HORA_APERTURA) && (hora <= HORA_CIERRE);
		
				
	if (hora<24 && hora>0) {
		if (estaAbierto) {
			System.out.println("EL estacionamiento esta abierto");
		}
		else {
			System.out.println("El estacionamiento esta cerrado");
		}		
			
	} else {
		System.out.println("Ha ingresado una hora incorrecta");
	}
		
		
		
		
	
	}
	public static int ingresoNum(String mensaje) {
		int hora;
		
		System.out.println(mensaje);
		hora=ingreso.nextInt();
		ingreso.nextLine();
		
		return hora;
	}
}

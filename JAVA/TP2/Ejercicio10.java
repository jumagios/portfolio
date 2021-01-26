package paquete;
/**
 * 10. El club de corredores nos pide un programa para obtener estadísticas de la carrera de 10
km. El mismo consiste en ingresar, por teclado, el número de corredor, las
horas, los minutos y los segundos que tardo en realizar la carrera. Tener en cuenta que al ingresar 0
como el número de corredor, finaliza el programa y debe mostrar por pantalla:
a) El ganador
b) El promedio en segundos de los corredores.
c) El porcentaje de corredores que realizaron la carrera en menos de una hora.
Programar y utilizar la función devolverSegundos que recibe como parámetros horas, minutos y
segundos
 */
import java.util.Scanner;

public class Ejercicio10 {

	static Scanner ingreso =new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int horas, minutos, segundos, numeroCorredor=0;
		int ganador=0;
		int mejorTiempo=9999999;
		int tiempoSeg=0;
		int suma=0, prom=0;
		int contador=0, contador2=0, menosUnaHora=0; 
		final int CERRAR_PROG=0;
		
		numeroCorredor=ingresoNum("Ingresar el numero del corredor: ");
		
		while (numeroCorredor!=CERRAR_PROG) {
			contador++;
			horas=ingresoNum("Ingresar las horas que tardo en finalizar la carrera: ");
			minutos=ingresoNum("Ingresar los minutos tambien: ");
			segundos=ingresoNum("Ingresar tambien los segundos: ");
			tiempoSeg=devolverSegundos(horas,minutos,segundos);
			if (tiempoSeg<3600) {
				contador2++;
			}
			
			suma=suma+tiempoSeg;	
			if(tiempoSeg<mejorTiempo) {
				ganador=numeroCorredor;
			}
			
			numeroCorredor=ingresoNum("Ingresar el numero del corredor: ");
		}
		menosUnaHora=devolverValor(contador,contador2);
		
		prom=suma/contador;
		
		System.out.println("El ganador es el corredor numero: " + ganador);
		System.out.println("El promedio en segundos de los corredores es: " + prom);
		System.out.println("El porcentaje de corredores que terminaron la carrera en menos de una hora es: " + menosUnaHora + "%");
	}
	

	
	private static int devolverValor(int contador, int contador2) {
		int num;
		
		num=((contador2*100)/contador);
		
		return num;
	}



	private static int devolverSegundos(int horas, int minutos, int segundos) {
		int num;
		
		num=(horas*3600)+(minutos*60)+segundos;
		
		return num;
	}
	private static int ingresoNum(String mensaje) {
		int num;
		
		System.out.println(mensaje);
		num=ingreso.nextInt();
		ingreso.nextLine();
		
		return num;
	}

}

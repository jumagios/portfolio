package paquete;

import java.util.Scanner;

/*En un casino de juegos se desea mostrar los mensajes respectivos por el puntaje obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a los siguientes resultados:
• Si los tres dados son seis, mostrar el mensaje “Excelente”
• Si dos dados son seis, mostrar el mensaje “Muy bien”
• Si un dado es seis, mostrar el mensaje “Regular”
• Si ningún dado se obtiene seis, mostrar el mensaje “Insuficiente” */

public class Ejercicio12 {
	static final int dadoWin=6;
	static Scanner ingreso =new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dado1;
		int dado2;
		int dado3;
		boolean dado1Win;
		boolean dado2Win;
		boolean dado3Win;
		
		dado1= devolverRandom(6);
		dado2= devolverRandom(6);
		dado3= devolverRandom(6);
		
		dado1Win= resultadoJuego(dado1);
		dado2Win= resultadoJuego(dado2);
		dado3Win= resultadoJuego(dado3);
		
		
		if (dado1Win && dado2Win && dado3Win) {
			System.out.println("Excelente");
		} else {
			if ((dado1Win && dado2Win) || (dado1Win && dado3Win) || (dado2Win && dado3Win) ) {
				System.out.println("Muy bien");
			} else {
				if (dado1Win || dado2Win || dado3Win) {
					System.out.println("Regular");
				} else {
					System.out.println("Insuficiente");
				}
			}
		}
		

	}
	
	public static boolean resultadoJuego(int dado) {
		boolean gane=false;
		
		if (dado==dadoWin) {
			gane= true;
		} else {
			gane= false;
		}
		return gane;
	}
	

	public static int devolverRandom(int tope) {
		int valor=0;
	
		valor= (int) (Math.random()*tope+1);
		
		return valor;
}
}

package paquete;

/* Una empresa de catering nos pide desarrollar un programa para calcular el precio que tendrá que cobrar a sus clientes según el menú elegido por los invitados de cada fiesta.
Las alternativas de cubierto ofrecidas y sus precios por persona son (poner como constantes) :
Opción 1. Menú clásico $300
Opción 2. Menú para celíacos $310
Opción 3. Menú Kosher $430
Opción 4. Menu Light $290
A su vez, tenemos que tener en cuenta que se cobra $30 por persona para cubrir las bebidas, indistintamente del menú elegido.
Al comenzar el programa, se le preguntará al usuario si desea calcular el precio total del catering para su fiesta (s/n - Validar). 
En caso afirmativo, se le solicitará al usuario que ingrese la cantidad de invitados total (validar que sea mayor a 0).
Una vez ingresada esa información, se le pedirá que ingresé el tipo de menú (clásico/celiaco/kosher/light/fin - Validar) para luego 
cargar la cantidad de invitados que eligieron ese cubierto. Estos dos datos se le pedirán hasta que en el tipo de menú ingrese ‘fin’.
Una vez finalizado el ingreso de datos, se mostrará por pantalla un resumen detallando lo ingresado y el costo final calculado.
 */

import java.util.Scanner;

public class Ejercicio16 {
	static Scanner ingreso =new Scanner(System.in);
	final static int CLASICO=300;
	final static int CELIAC=310;
	final static int KOSHER=430;
	final static int LIGHT=290;
	final static int BEBIDAS=30;
	final static String FIN="fin";
	
	public static void main(String[] args) {
		String catering,menu;
		int invitados,cantidad,total=0,cantCl=0,cantCe=0,cantKo=0,cantLi=0,bebida,tot=0,clasico=0,celiaco=0,kosher=0,light=0,costo=0;
		
		
		
		catering=ingresoTexto("Bienvenido! ¿Desea calcular el precio total del catering para su fiesta?");
		invitados=ingresoNum("Ingrese la cantidad de invitados:");
		menu=ingresoMenu("Ingrese el tipo de menu(clasico/celiaco/kosher/light.Fin para finalizar");	
		while(!menu.equals(FIN)) {
			cantidad=ingresoNum("Ingrese la cantidad de invitados que eligieron ese menu:");
			if (menu.equals("clasico")) {
				clasico=cantidad*CLASICO;
				cantCl=cantCl+cantidad;
			} else {
				if (menu.equals("celiaco")) {
					celiaco=cantidad*CELIAC;
					cantCe=cantCe+cantidad;
				} else {
					if (menu.equals("kosher")) {
						kosher=cantidad*KOSHER;
						cantKo=cantKo+cantidad;
					} else {
						if(menu.equals("light")) {
							light=cantidad*LIGHT;
							cantLi=cantLi+cantidad;
						}
					}
				}
			}
			total=invitados-cantidad;
			while(total<0) {
				System.out.println("Error. Ha ingresado mas cantidad de platos que de invitados.");
				cantidad=ingresoNum("Ingrese la cantidad de invitados que eligieron ese menu:");
			}
			menu=ingresoMenu("Ingrese el tipo de menu(clasico/celiaco/kosher/light.Fin para finalizar");			
		}	
		costo=clasico+celiaco+kosher+light;
		bebida=invitados*BEBIDAS;
		tot=costo+bebida;
		System.out.println("Usted ha invitado "+invitados+" personas.");
		System.out.println("Clasico: "+cantCl+" "+CLASICO);
		System.out.println("Celiaco: "+cantCe+" "+CELIAC);
		System.out.println("Kosher: "+cantKo+" "+KOSHER);
		System.out.println("Light: "+cantLi+" "+LIGHT);
		
		System.out.println("El costo de comida es de: $"+costo);
		System.out.println("El costo de bebida es de $"+bebida);
		System.out.println("El costo total es de: "+tot);
		
	}
	
	
	private static String ingresoMenu(String mensaje) {
		String menu;
		System.out.println(mensaje);
		menu=ingreso.next();
		if (menu.equals("fin")) {
			return menu;
		} else {			
		while(!menu.equals("clasico") && (!menu.equals("celiaco")) && (!menu.equals("kosher")) && (!menu.equals("light"))) {
			System.out.println("ERROR");
			System.out.println(mensaje);
			menu=ingreso.next();
		}
		}
		return menu;
	}

	private static int ingresoNum(String string) {
		int num;
		System.out.println(string);
		num=ingreso.nextInt();
		while(num<0) {
			System.out.println("ERROR");
			System.out.println(string);
			num=ingreso.nextInt();
		}		
		return num;
	}

	private static String ingresoTexto(String mensaje) {
		String cat;		
		System.out.println(mensaje);
		cat=ingreso.next();
		while(!cat.equals("s") && (!cat.equals("S"))) {
			System.out.println("ERROR");
			System.out.println(mensaje);
			cat=ingreso.next();			
		}		
		return cat;
	}
}

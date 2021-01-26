package paquete;

/* El ingreso a un sitio web se valida por nombre de usuario y contraseña. Realizar un programa que impida que el usuario 
 * ingrese hasta poner los datos correctos. Si intenta más de 3 veces erróneamente, se debe mostrar el mensaje “Se ha bloqueado su cuenta”, de lo contrario, mostrar “Ha ingresado correctamente”.
 */

import java.util.Scanner;

public class Ejercicio7 {

	static Scanner ingreso =new Scanner(System.in);
	final static int TOPE=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user,pass;
		String usuario = "ADMIN";
		String password = "12345";
		int contador=0;
		
		do {
			user=ingresoTexto("Ingrese el nombre de usuario");
			pass=ingresoPassword("Ingrese la contraseña:");
			contador++;
		} while ((!usuario.equals(user))&&(!password.equals(pass))&&(contador<TOPE));
		
		if ((!usuario.equals(user))&&(!password.equals(pass))) {
			System.out.println("Su cuenta ha sido bloqueada");
		} else {
			System.out.println("Ha ingresado correctamente");
		}
		
	}
		

	private static String ingresoPassword(String mensaje) {
		String password;
		
		System.out.println(mensaje);
		password=ingreso.next();
		ingreso.nextLine();
		
		return password;
	}

	private static String ingresoTexto(String mensaje) {
		String usuario;
		
		System.out.println(mensaje);
		usuario=ingreso.next();
		ingreso.nextLine();
		
		return usuario;
	}

}

package paquete;

/* Realizá un programa que muestre por pantalla un mensaje pidiéndole al usuario que ingrese su nombre, y luego muestre un mensaje de bienvenida incluyendo el mismo.
 * 
 */
import java.util.Scanner;

public class Ejercicio3 {
	
	static Scanner ingreso = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String usuario;
		
		System.out.println("Ingrese nombre de usuario: ");
		usuario = ingreso.nextLine();
		System.out.println("Bienvenido "+ usuario);
	}

}

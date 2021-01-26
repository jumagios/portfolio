package paquete;

import java.text.DecimalFormat;
import java.util.Scanner;
/*
Realizá un programa que resuelva el siguiente problema:
Tres personas aportan diferente capital a una sociedad. Se desea saber qué porcentaje del total aportó cada una (indicando nombre y porcentaje) 
y cuál es el monto del total aportado por las tres.
Pedir por pantalla el ingreso del capital aportado por cada una de las personas y luego mostrar lo pedido en el siguiente formato:
Nombre: capital aportado: $ … , Porcentaje del capital: %.... , Monto total aportado: $ ….
*/

public class Ejercicio9 {

	static Scanner ingreso= new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("#.00");

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String socio1;
	    String socio2;
	    String socio3;
	    float capital1;
	    float capital2;
	    float capital3;
	    float porcentaje;
	    float total;
	    
	    
	    socio1= ingresoTexto("Ingrese el nombre del primer socio:");
	    capital1= ingresoNum("Ingrese el capital aportado:");
	    
	    socio2= ingresoTexto("Ingrese el nombre del segundo socio:");
	    capital2= ingresoNum("Ingrese el capital aportado:");
	    		
	    socio3= ingresoTexto("Ingrese el nombre del tercer socio:");
	    capital3= ingresoNum("Ingrese el capital aportado:");
	    
	    porcentaje=  Calculo(capital1, capital2, capital3);
	    total=  suma(capital1, capital2, capital3);
	    
	    System.out.println("----------------------------------------------------------------------------------------------------------");
	    System.out.println("Nombre: " + socio1 + " ,Capital aportado: $" + capital1 + " ,Porcentaje del capital: %" + df.format(porcentaje*capital1)+ " ,Monto total aportado: $" + total);
	    System.out.println("----------------------------------------------------------------------------------------------------------");
	    System.out.println("Nombre: " + socio2 + " ,Capital aportado: $" + capital2 + " ,Porcentaje del capital: %" + df.format(porcentaje*capital2)+ " ,Monto total aportado: $" + total);
	    System.out.println("----------------------------------------------------------------------------------------------------------");
	    System.out.println("Nombre: " + socio3 + " ,Capital aportado: $" + capital3 + " ,Porcentaje del capital: %" + df.format(porcentaje*capital3)+ " ,Monto total aportado: $" + total);
	    
	    
	}
	
	
	public static float suma(float num1, float num2, float num3) {
		float result;
		
		result= (num1+num2+num3);
		
		return result;
	}
	
	public static float Calculo(float num1, float num2, float num3) {
		float result;
		
		result= 100/(num1+num2+num3);
		
		return result;
		
	}
	

	public static String ingresoTexto(String mensaje) {
		String texto;
		
		System.out.println(mensaje);
		texto= ingreso.next();
		
		return texto;
	
	}
	
	public static float ingresoNum(String mensaje) {
		float dia;
		
		System.out.println(mensaje);
		dia=ingreso.nextInt();
		ingreso.nextLine();
		
		return dia; }
}

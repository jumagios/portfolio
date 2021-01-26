package paquete;

import java.util.Scanner;

/* Realizá un programa que al ingresar por teclado tres números enteros num1, num2 y
num3, muestre el valor del mayor de todos.
En caso de igualdad entre los tres imprimir "Los números son iguales".
Test1: num1 = 12, num2 = 4, num3= 7. Resultado esperado: El mayor número es num1
Test2: num1 = 2, num2 = 65, num3= 8. Resultado esperado: El mayor número es num2 
Test3: num1 = 3, num2 = 10, num3= 28. Resultado esperado: El mayor número es num3
Test4: num1 = 5, num2 = 5, num3= 5. Resultado esperado: Los números son iguales
*/

public class Ejercicio7 {
	
	static Scanner ingreso= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		
		int num1;
		int num2;
		int num3;
		int max;
		
		// main
		num1=ingresoNum("Ingresa el primer numero entero:");
		num2=ingresoNum("Ingresa el segundo numero entero:");
		num3=ingresoNum("Ingresa el tercer numero entero:");
		max = MaximoDosNum(num1,num2);
		
		if (max==num1 && max==num2 && max==num3) {
			System.out.println("Los numeros son iguales");
		}
		else {
			if(num3>max) {
				System.out.println("EL numero mas alto es: " + num3);
			}else {
				System.out.println("El numero mas alto es: " + max);
			}
			}
	}
	
	
	//metodos, funcion para tomar el maximo de dos numeros:
	public static int MaximoDosNum(int numA, int numB) {
	int max;
	if (numA>numB) {
		max= numA;}
	else {
		max=numB;
	}
	
	
	return max;
	}
	
	public static int ingresoNum(String mensaje) {
		int num;
		
		System.out.println(mensaje);
		num=ingreso.nextInt();
		ingreso.nextLine();
		
		return num; }
}

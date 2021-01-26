package test;
/*
 * Escribir la clase Cuadrado , la que en su único constructor recibirá la medida de un
lado. Crear el setter y el getter del atributo lado y los métodos perimetro() (lado * 4) y
superficie() (lado * lado). Por último implementar el método toString() que muestre no
solo el tamaño del lado sino también sus campos calculados. Para eso escribiremos
este método de la siguiente manera:
@Override
public String toString () {
return "Cuadrado [lado=" + lado + ", perimetro()=" +
perimetro() + ", superficie()=" + superficie() + "]" ;
}
Escribir la clase Test donde se cree un cuadrado de 10 (diez) unidades de lado; luego
cambiar su medida a 50 (cincuenta) unidades. Después de cada operación mostrar el estado
del cuadrado. La ejecución debería mostrar los siguiente:
Cuadrado [lado=10, perimetro()=40, superficie()=100]
Cambio el tamaño del cuadrado a 50 por lado.
Cuadrado [lado=50, perimetro()=200, superficie()=2500]
 */

import clases.Cuadrado;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado chico = new Cuadrado(10);
		
		
		System.out.println(chico);
		System.out.println("Cambio el tamaño del cuadrado a 50 por lado");
		chico.setLado(50);
		
		System.out.println(chico);
		
		
	}

}

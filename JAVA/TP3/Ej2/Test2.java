package test;
/*
 * Escribir la clase Cuadrado , la que en su �nico constructor recibir� la medida de un
lado. Crear el setter y el getter del atributo lado y los m�todos perimetro() (lado * 4) y
superficie() (lado * lado). Por �ltimo implementar el m�todo toString() que muestre no
solo el tama�o del lado sino tambi�n sus campos calculados. Para eso escribiremos
este m�todo de la siguiente manera:
@Override
public String toString () {
return "Cuadrado [lado=" + lado + ", perimetro()=" +
perimetro() + ", superficie()=" + superficie() + "]" ;
}
Escribir la clase Test donde se cree un cuadrado de 10 (diez) unidades de lado; luego
cambiar su medida a 50 (cincuenta) unidades. Despu�s de cada operaci�n mostrar el estado
del cuadrado. La ejecuci�n deber�a mostrar los siguiente:
Cuadrado [lado=10, perimetro()=40, superficie()=100]
Cambio el tama�o del cuadrado a 50 por lado.
Cuadrado [lado=50, perimetro()=200, superficie()=2500]
 */

import clases.Cuadrado;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado chico = new Cuadrado(10);
		
		
		System.out.println(chico);
		System.out.println("Cambio el tama�o del cuadrado a 50 por lado");
		chico.setLado(50);
		
		System.out.println(chico);
		
		
	}

}

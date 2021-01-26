package test;

/* La clase Cafetera cuenta con los siguientes atributos
capacidadMaxima (entero, la cantidad m�xima de caf� que puede contener la
cafetera en mililitros),
cantidadActual (entero, la cantidad actual de caf� que hay en la cafetera en
mililitros).
Implementar, al menos, los siguientes m�todos:
a. Constructor predeterminado o por defecto : establece la capacidad m�xima en
1000 y la actual en cero (cafetera vac�a).
b. Constructor con la capacidad m�xima de la cafetera: inicializa la capacidad
m�xima con lo recibido y la cantidad actual en cero (vac�a).
c. Constructor con la capacidad m�xima y la cantidad actual. Si la cantidad
actual es mayor que la capacidad m�xima de la cafetera, la ajustar� al
m�ximo.
d. Setters privados y getters p�blicos. El setter de la capacidad nunca debe
permitir un valor menor a 250 (si es menor lo fuerza a 250); la cantidad actual
debe controlar que nunca sea menor a cero ni mayor a la capacidad de la
cafetera.
e. llenar() : iguala la cantidad actual de la cafetera con la capacidad m�xima.
f. servirTaza(int) : simula la acci�n de servir una taza con la capacidad indicada
por par�metro. Si la cantidad actual de caf� no alcanza para llenar la taza, se
sirve lo que haya.
g. vaciar() : setea la cantidad de caf� actual en cero.
h. agregarCafe(int) : a�ade a la cafetera la cantidad de caf� indicada, en el caso
de ser posible. Devuelve la cantidad sobrante.
Realizar la clase Test para probar el correcto funcionamiento de todos los m�todos de
la clase previamente realizada. Crear una cafetera por defecto, otra con medio litro de
capacidad y una tercera con tres cuartos litros de capacidad y una cantidad inicial de
medio litro de caf�. Usar un �nico m�todo testearCafetera(Cafetera) para probar las
tres cafeteras por separado, una cada vez.
*/

import clases.Cafetera;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Cafetera cafe1 = new Cafetera();
		testearCafetera(cafe1);
	
		Cafetera cafe2 = new Cafetera(500);
		testearCafetera(cafe2);
		
		Cafetera cafe3 = new Cafetera(750, 500);
		testearCafetera(cafe3);
		
		
		
	}

	private static void testearCafetera(Cafetera cafe) {
	System.out.println(cafe);
	cafe.llenar();
	System.out.println(cafe);
	cafe.servirTaza(500);
	cafe.vaciar();
	cafe.agregarCafe(200);
	System.out.println(cafe);
	}

}

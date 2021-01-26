package test;

/* Crear la clase TarjetaDeCredito con la siguiente estructura:
Atributos privados:
numero (String),
titular (String),
limiteDeCompra (double),
acumuladoActual (double).
Método:
Constructor parametrizado y público que reciba número, titular y límite
de compra por parámetros y los asigne al atributo correspondiente. El
atributo acumuladoActual se inicializará con 0 (cero).
Los getters de cada uno de sus atributos, públicos, y los setters , todos
privados, menos el método setAcumuladoActual() que no existe.
El método toString() (público), el cual además de los atributos debe
incluir el monto disponible para comprar.
El método público montoDisponible() que devuelve la diferencia entre
el límite de compras y el acumulado actual de gastos, pero si por
alguna razón este valor es inferior a cero devuelve cero. Por ejemplo, si
gastaste determinado monto y luego cambiaron el límite a un valor
menor a éste, el monto disponible debe ser 0 (cero).
El método privado compraPosible() que según el monto recibido por
parámetro devuelve si se puede o no hacer la compra. Para saber si la
compra es posible el monto de la misma no debe superar al monto
disponible para compras.
El método público actualizarLimite() , que recibe un nuevo límite de
compra.
El método privado acumularGastoActual() , que recibe el importe de la
compra y lo suma al acumulado actual.
El método público realizarCompra() , el cual dado un monto comprueba
si esta se puede realizar (si con la compra no se supera el límite), y si
es posible la procesa actualizando los atributos que deba actualizar
siempre usando los métodos que corresponda. Este método devuelve
un booleano que indica si la compra se pudo realizar o no.
En la clase Test , se creará un objeto tarjeta con la siguiente información:
Numero 4145414122221111
Titular Juan Perez
Limite 10000
*/

import clases.TarjetaDeCredito;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TarjetaDeCredito visa = new TarjetaDeCredito("4145414122221111", "Juan Perez", 10000);
		
		pudeComprar(visa.realizarCompra(4000));
		
		System.out.println(visa);
		
		System.out.println("Actualizo limite a 3000");
		visa.actualizarLimite(3000);
		
		pudeComprar(visa.realizarCompra(4000));
		
		System.out.println(visa);
	}

	public static void pudeComprar(boolean exito) {
		if (exito) {
			System.out.println("Compra satisfactoria");
		} 
		else {
			System.out.println("Limite superado, no pude comprar");
		}
	}
}
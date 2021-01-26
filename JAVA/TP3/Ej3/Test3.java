package test;

/* Crear la clase TarjetaDeCredito con la siguiente estructura:
Atributos privados:
numero (String),
titular (String),
limiteDeCompra (double),
acumuladoActual (double).
M�todo:
Constructor parametrizado y p�blico que reciba n�mero, titular y l�mite
de compra por par�metros y los asigne al atributo correspondiente. El
atributo acumuladoActual se inicializar� con 0 (cero).
Los getters de cada uno de sus atributos, p�blicos, y los setters , todos
privados, menos el m�todo setAcumuladoActual() que no existe.
El m�todo toString() (p�blico), el cual adem�s de los atributos debe
incluir el monto disponible para comprar.
El m�todo p�blico montoDisponible() que devuelve la diferencia entre
el l�mite de compras y el acumulado actual de gastos, pero si por
alguna raz�n este valor es inferior a cero devuelve cero. Por ejemplo, si
gastaste determinado monto y luego cambiaron el l�mite a un valor
menor a �ste, el monto disponible debe ser 0 (cero).
El m�todo privado compraPosible() que seg�n el monto recibido por
par�metro devuelve si se puede o no hacer la compra. Para saber si la
compra es posible el monto de la misma no debe superar al monto
disponible para compras.
El m�todo p�blico actualizarLimite() , que recibe un nuevo l�mite de
compra.
El m�todo privado acumularGastoActual() , que recibe el importe de la
compra y lo suma al acumulado actual.
El m�todo p�blico realizarCompra() , el cual dado un monto comprueba
si esta se puede realizar (si con la compra no se supera el l�mite), y si
es posible la procesa actualizando los atributos que deba actualizar
siempre usando los m�todos que corresponda. Este m�todo devuelve
un booleano que indica si la compra se pudo realizar o no.
En la clase Test , se crear� un objeto tarjeta con la siguiente informaci�n:
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
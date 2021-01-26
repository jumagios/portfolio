package objetos;

/* Crear una clase Gato y una clase Raton . Ambos tienen como atributo energía (int) y
un constructor que recibe un valor que completa este dato.
El gato y el ratón recorren la cantidad de metros que permita la energía que
tengan. Un gato puede correr mientras le dé la energía, descontando un punto de
energía por metro recorrido. Al ratón se le descuentan 2 puntos de energía por cada
metro recorrido.
Implementar en Gato el método alcanzar() que reciba como parámetro una
instancia de Raton y la distancia en metros que debe recorrer para alcanzarlo.
Devolverá true o false dependiendo de si lo alcanza o no.
Ejemplo: un gato con 100 de energía puede correr 100 metros, pero un ratón con
los mismos 100 de energía puede correr sólo 50 metros. O sea que si el ratón está a
más de 50 metros del gato y ambos tienen 100 de energía, no lo va a alcanzar.
Crear un gato y un ratón en la clase Test con y probar con 10, 50 y 80 metros,
ambos con 100 de energía.
*/

public class Gato {

	private int energia;

	public Gato(int energia) {
		super();
		this.energia = energia;
	}
	
	public boolean alcanzar(int energiaRaton, int distancia) {
		boolean pude=false;
		
		while(distancia!=0) {
			energia=energia-1;
			energiaRaton=energiaRaton-2;
			distancia--;
		}
		if(energia>energiaRaton) {
			System.out.println("Atrape al raton");
			pude=true;
		} else {
			System.out.println("Se me escapo");
			pude=false;
		}
		
		return pude;
	}
}

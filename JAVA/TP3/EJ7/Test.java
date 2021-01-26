package test;

import objetos.Gato;
import objetos.Raton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gato garfield = new Gato(100);
		Raton pinky = new Raton(100);
		
		garfield.alcanzar(pinky.getEnergia(), 10);
		garfield.alcanzar(pinky.getEnergia(), 50);
		garfield.alcanzar(pinky.getEnergia(), 80);
	}

}

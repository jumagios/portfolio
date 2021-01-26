package test;

import objeto.Automovil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Automovil auto = new Automovil("Ford", "Fiesta", "ABCD123", 40);
		
		System.out.println(auto);
		auto.setRendimientoPorLitro(10);
		System.out.println(auto);
		auto.cargarCombustible(20);
		System.out.println(auto);
		auto.viajar(180);
		System.out.println(auto);
		auto.viajar(50);
		System.out.println(auto);
	}

}

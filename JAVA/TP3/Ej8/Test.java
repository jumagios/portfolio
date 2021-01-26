package test;

import objetos.Superheroe;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Superheroe superheroe1 = new Superheroe("Batman", 90, 70, 0);
		Superheroe superheroe2 = new Superheroe("Superman", 95, 60, 70);
		Superheroe superheroe3 = new Superheroe("Linterna verde", 90, 70, 0);
		Superheroe superheroe4 = new Superheroe("Spiderman", 120, -40, 30);
		
		
		superheroe1.competir(superheroe2);
		superheroe2.competir(superheroe1);
		superheroe1.competir(superheroe3);
		System.out.println(superheroe1);
		System.out.println(superheroe2);
		System.out.println(superheroe3);
		System.out.println(superheroe4);

		
	}

}

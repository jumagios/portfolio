package test;

import objeto.Hotel;

public class Test {
	
	final static String MENSAJE_1= "Intento ocupar 201 habitaciones";
	final static String MENSAJE_2= "Intento ocupar 30 habitacion sin reserva";
	final static String MENSAJE_3= "Intento reservar 50 habitaciones";
	final static String MENSAJE_4= "Intento liberar 200 habitaciones";
	final static String MENSAJE_5= "Intento ocupar 30 habitaciones con reserva";
	final static String MENSAJE_6= "Intento liberar 40 habitaciones";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hotel Hilton = new Hotel("Hilton", "CABA", 200);
		Hotel Astoria = new Hotel("Astoria", "MDQ", 150, 100, 10);

		
		System.out.println("Estado inicial del Hilton:");
		System.out.println(Hilton);
		System.out.println(MENSAJE_1);
		Hilton.ocuparHabitaciones(201, false);
		System.out.println(Hilton);
		System.out.println(MENSAJE_2);
		Hilton.ocuparHabitaciones(30, false);
		System.out.println(Hilton);
		System.out.println(MENSAJE_3);
		Hilton.reservarHabitaciones(50);
		System.out.println(Hilton);
		System.out.println(MENSAJE_4);
		Hilton.desocuparHabitaciones(200);
		System.out.println(Hilton);
		System.out.println(MENSAJE_5);
		Hilton.ocuparHabitaciones(30, true);
		System.out.println(Hilton);
		System.out.println(MENSAJE_5);
		Hilton.ocuparHabitaciones(30, true);
		System.out.println(Hilton);
		System.out.println(MENSAJE_6);
		Hilton.desocuparHabitaciones(40);
		System.out.println(Hilton);
		
		System.out.println("***********************************************************************************************");
		
		System.out.println("Estado inicial del Astoria");
		System.out.println(Astoria);
		System.out.println(MENSAJE_1);
		Astoria.ocuparHabitaciones(201, false);
		System.out.println(Astoria);
		System.out.println(MENSAJE_2);
		Astoria.ocuparHabitaciones(30, false);
		System.out.println(Astoria);
		System.out.println(MENSAJE_3);
		Astoria.reservarHabitaciones(50);
		System.out.println(Astoria);
		System.out.println(MENSAJE_4);
		Astoria.desocuparHabitaciones(200);
		System.out.println(Astoria);
		System.out.println(MENSAJE_5);
		Astoria.ocuparHabitaciones(30, true);
		System.out.println(Astoria);
		System.out.println(MENSAJE_5);
		Astoria.ocuparHabitaciones(30, true);
		System.out.println(Astoria);
		System.out.println(MENSAJE_6);
		Astoria.desocuparHabitaciones(40);
		System.out.println(Astoria);
		
	}

}

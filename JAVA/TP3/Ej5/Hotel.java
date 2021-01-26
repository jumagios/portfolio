package objeto;

/* Crear la clase Hotel con los siguientes atributos:
 nombre (String)
 localidad (String)
 habitacionesTotales (int)
 habitacionesOcupadas (int)
 habitacionesReservadas (int)
La clase tendrá dos constructores parametrizados: el primero recibirá el nombre, la
localidad y el total de habitaciones; el segundo será completo, para setear cada uno
de sus atributos.
Además contará con los siguientes métodos públicos:
 reservarHabitaciones() : recibe por parámetro la cantidad de habitaciones a
reservar. Valida que sea posible realizar por completo la acción y devuelve
true o false según corresponda.
 ocuparHabitaciones() : recibe por parámetro la cantidad de habitaciones a
ocupar y un booleano que indica si son de la reserva o no. Valida que sea
posible realizar por completo la acción (comparando con las reservadas si son
de la reserva y con las libres si no lo son) y devuelve true o false según
corresponda. Para ocupar las habitaciones usará los métodos privados
ocuparConReserva() y ocuparSinReserva() .
 desocuparHabitaciones() : recibe por parámetro la cantidad de habitaciones a
desocupar. Valida que sea posible realizar la acción y devuelve true o false
según corresponda.
 cantidadHabitacionesLibres(): devuelve la cantidad de habitaciones no
ocupadas.
 disponibilidad() : devuelve la cantidad de habitaciones disponibles descontando
las ocupadas y las reservadas.
 Los getters() de todos sus atributos, públicos, y los setters() privados, salvo el
nombre que sí es público (se le puede cambiar el nombre). El hotel debe tener
por lo menos una habitación, y las reservas no pueden ser negativas ni
superar la cantidad de habitaciones del hotel (en todos los casos se ajustará al
límite superado).
 El método toString() que mostrará todos los atributos más los miembros
calculados cantidadDeHabitacionesLibres() y disponibilidad() . Esta vez
modificaremos el formato de salida y escribiremos lo siguiente:
@Override
public String toString () {
return String.format( "Hotel %s %s [habitaciones=%d, ocupadas=%d,
reservadas=%d, libres=%s, disponibles=%d]" , nombre, localidad,
totalHabitaciones, habitacionesOcupadas, habitacionesReservadas,
cantidadHabitacionesLibres(), disponibilidad());
}
En la clase Test crear una instancia de Hotel con los valores "Hilton", "CABA", 200.
Luego realizar las siguientes operaciones mostrando el resultado de la operación y
mostrando al comienzo y luego de cada una el estado del hotel:
1. Ocupar 201 habitaciones sin reserva (no debe dejarnos)
2. Ocupar 30 habitaciones sin reserva. Debe dejarnos y quedar 170 disponibles y
libres.
3. Reservar 50 habitaciones (deben dejarnos y quedar 120 disponibles y 170
libres).
4. Liberar 200 habitaciones (no debe dejarnos y seguir todo igual).
5. Ocupar 30 habitaciones reservadas (debe dejarnos).
6. Ocupar 30 habitaciones reservadas (no debe dejarnos porque quedaban 20
entre las reservadas).
7. Liberar 40 habitaciones (debe dejarnos).
Luego crear el hotel “Astoria”, “MDQ”, 150, 100, 10 e intentar exactamente las mismas
operaciones.
*/



public class Hotel {

	private String nombre;
	private String localidad;
	private int habitacionesTotales;
	private int habitacionesOcupadas;
	private int habitacionesReservadas;
	public String getNombre() {
		return nombre;
	}
	public String getLocalidad() {
		return localidad;
	}
	public int getHabitacionesTotales() {
		return habitacionesTotales;
	}
	public int getHabitacionesOcupadas() {
		return habitacionesOcupadas;
	}
	public int getHabitacionesReservadas() {
		return habitacionesReservadas;
	}
	private void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	private void setHabitacionesTotales(int habitacionesTotales) {
		this.habitacionesTotales = habitacionesTotales;
	}
	private void setHabitacionesOcupadas(int habitacionesOcupadas) {
		this.habitacionesOcupadas = habitacionesOcupadas;
	}
	private void setHabitacionesReservadas(int habitacionesReservadas) {
		this.habitacionesReservadas = habitacionesReservadas;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Hotel(String nombre, String localidad, int habitacionesTotales) {
		super();
		this.nombre = nombre;
		this.localidad = localidad;
		this.habitacionesTotales = habitacionesTotales;
	}
	public Hotel(String nombre, String localidad, int habitacionesTotales, int habitacionesOcupadas,
			int habitacionesReservadas) {
		super();
		this.nombre = nombre;
		this.localidad = localidad;
		this.habitacionesTotales = habitacionesTotales;
		this.habitacionesOcupadas = habitacionesOcupadas;
		this.habitacionesReservadas = habitacionesReservadas;
	}
	
	public boolean reservarHabitaciones(int hab) {
		boolean pude=false;	
		if(hab<cantidadHabitacionesLibres()) {
			this.habitacionesReservadas=this.habitacionesReservadas+hab;
			pude=true;
		} else {
			System.out.println("No pude reservar");
		}
		return pude;
	}
	private void ocuparConReserva(int hab) {
		this.habitacionesOcupadas=this.habitacionesOcupadas+hab;
		this.habitacionesReservadas=this.habitacionesReservadas-hab;
	}
	
	private void ocuparSinReserva(int hab) {
		this.habitacionesOcupadas=this.habitacionesOcupadas+hab;
	}
	
	public boolean ocuparHabitaciones(int hab, boolean reserva) {
		boolean pude=false;
		int disponible = disponibilidad();
		
		if(reserva) {
			if (hab < this.habitacionesReservadas) {
				ocuparConReserva(hab);
			} else {
				pude= false;
				System.out.println("No se pudo ocupar");
			}
		} else if (hab < disponible) {
			ocuparSinReserva(hab);
		} else {
			pude = false;
			System.out.println("No se pudo ocupar");
		}
		
		return pude;
	}
	
	public boolean desocuparHabitaciones(int hab) {
		boolean pude=false;
		
		if (hab<this.habitacionesTotales) {
			pude=true;
			this.habitacionesOcupadas=this.habitacionesOcupadas-hab;
		} else {
			System.out.println("No pude liberar las habitaciones solicitadas");
		}
		
		return pude;
	}
	
	public int cantidadHabitacionesLibres() {
		int num=0;
		
		num=this.habitacionesTotales-this.habitacionesOcupadas;
		
		return num;
	}
	
	public int disponibilidad() {
		int num=0;
		
		num=(this.habitacionesTotales-this.habitacionesOcupadas)-this.habitacionesReservadas;
		
		
		return num;
	}
	
	@Override
	public String toString () {
	return String.format( "Hotel %s %s [habitaciones=%d, ocupadas=%d, reservadas=%d, libres=%s, disponibles=%d]" , 
	nombre, localidad, habitacionesTotales, habitacionesOcupadas, habitacionesReservadas, 
	cantidadHabitacionesLibres(), disponibilidad());
	}
	
	
	
	
}

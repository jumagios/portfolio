package clases;

/* La clase Cafetera cuenta con los siguientes atributos
 capacidadMaxima (entero, la cantidad máxima de café que puede contener la
cafetera en mililitros),
 cantidadActual (entero, la cantidad actual de café que hay en la cafetera en
mililitros).
Implementar, al menos, los siguientes métodos:
a. Constructor predeterminado o por defecto : establece la capacidad máxima en
1000 y la actual en cero (cafetera vacía).
b. Constructor con la capacidad máxima de la cafetera: inicializa la capacidad
máxima con lo recibido y la cantidad actual en cero (vacía).
c. Constructor con la capacidad máxima y la cantidad actual. Si la cantidad
actual es mayor que la capacidad máxima de la cafetera, la ajustará al
máximo.
d. Setters privados y getters públicos. El setter de la capacidad nunca debe
permitir un valor menor a 250 (si es menor lo fuerza a 250); la cantidad actual
debe controlar que nunca sea menor a cero ni mayor a la capacidad de la
cafetera.
e. llenar() : iguala la cantidad actual de la cafetera con la capacidad máxima.
f. servirTaza(int) : simula la acción de servir una taza con la capacidad indicada
por parámetro. Si la cantidad actual de café no alcanza para llenar la taza, se
sirve lo que haya.
g. vaciar() : setea la cantidad de café actual en cero.
h. agregarCafe(int) : añade a la cafetera la cantidad de café indicada, en el caso
de ser posible. Devuelve la cantidad sobrante.
Realizar la clase Test para probar el correcto funcionamiento de todos los métodos de
la clase previamente realizada. Crear una cafetera por defecto, otra con medio litro de
capacidad y una tercera con tres cuartos litros de capacidad y una cantidad inicial de
medio litro de café. Usar un único método testearCafetera(Cafetera) para probar las
tres cafeteras por separado, una cada vez.
*/

public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;
	
	private void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = valorMinCapacidad(capacidadMaxima);
	}
	private void setCantidadActual(int cantidadActual) {
		if(Controlador(cantidadActual)) {
			
		}
		this.cantidadActual=cantidadActual;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		if(this.cantidadActual<this.capacidadMaxima) {
			this.capacidadMaxima=this.capacidadMaxima+this.cantidadActual;
		}
		this.cantidadActual = cantidadActual;
	}
	public Cafetera(int capacidadMaxima) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual=0;
	}
	public Cafetera() {
		super();
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	
	public int agregarCafe(int monto) {
		int num=0;
		
		if (Controlador(monto)) {
			this.cantidadActual=this.cantidadActual+monto;	
		} else {
			this.cantidadActual=this.cantidadActual;
		}
		
		return num;
	}
	
	public void vaciar() {
		System.out.println("Vaciamos la cafetera");
		this.cantidadActual=0;
	}
	
	public int servirTaza(int monto) {
		int num=0;
		int contador=1;
		while(monto>=250) {
			System.out.println("Sirviendo " + contador + " taza de cafe");
			contador++;
			monto=monto-250;
		}
		if(monto<250) {
			System.out.println("Cantidad insuficiente para llenar la taza");
			System.out.println("Sirviendo una taza de cafe con el resto");
		}
		
		return num;
	}
	
	public void llenar() {
		System.out.println("Llenamos la cafetera");
		this.cantidadActual=this.capacidadMaxima;
	}
	
	public int valorMinCapacidad (int monto) {
		int num;
		
		if (monto<250) {
			System.out.println("Solo se pueden poner valores mayores a 250");
			System.out.println("Forzando valor a 250.");
			num=250;
		} else {
			num=monto;
		}
		
		return num;
		
	}
	
	//Metodo que controla que la cantidad nunda debe ser menor a cero ni mayor que la capacidad
	public boolean Controlador(int monto) {
		boolean exito=false;
		if (monto>this.capacidadMaxima) {
			System.out.println("ERROR, la cantidad no debe superar la capacidad");
			exito=false;
		}
		
		
		return exito;
	}
	
	
	
}

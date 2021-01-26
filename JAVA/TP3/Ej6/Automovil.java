package objeto;

/*Crear la clase Automovil con los siguientes atributos: marca (String), modelo (String),
patente (String), capacidadTanque (double), cantidadDeCombustible (double) y
rendimientoPorLitro (double, indica cuantos kilometros recorre con un litro de
combustible).
Implementar los siguientes métodos y constructores:
a. Constructor parametrizado: recibe marca, modelo, patente y la capacidad del
tanque de combustible.
b. Método público viajar() : recibe la cantidad de kilómetros. Actualiza la cantidad
de combustible consumido invocando al método consumirCombustible() y
devuelve la cantidad de kilómetros que efectivamente se realizaron con el
combustible existente en el tanque. Debe descartar valores negativos (no
puede “desviajar” kilómetros).
c. Método privado consumirCombustible() : recibe la cantidad de kilómetros que
se quiere recorrer y actualiza la cantidad combustible en el tanque según los
kilómetros requeridos y el rendimiento por litro. Devuelve un double indicando
los litros consumidos.
d. Método público cargarCombustible() : recibe por parámetro la cantidad que se
quiere cargar, que nunca debe ser menor o igual que cero o mayor al espacio
disponible. Si puede, actualiza el atributo correspondiente. Devuelve true o
false dependiendo del éxito de la acción.
e. Método privado espacioDisponible() , que devuelve la diferencia entre el
tamaño del tanque y los litros de combustible almacenados.
f. Método público pocoCombustible() , booleano, que devuelve verdadero
siempre que la cantidad de combustible sea menor al 15% de la capacidad del
tanque.
g. Todos los getters públicos, todos los setters privados salvo setPatente() y
setRendimientoPorLitro() .
h. El método toString() que mostrará todos los valores de estado de la clase
incluyendo espacioDisponible() y pocoCombustible() .
En la clase test, crear el objeto a través del constructor. "Ford","Fiesta", "ABCD123",
capacidad tanque:40. Setear el rendimiento por litro en 10 y llenar el tanque con 20
(veinte) litros de combustible.
Probar todos los métodos recorriendo 180 kilómetros primero e intentando recorrer
50 después, mostrando siempre la cantidad de kilómetros que devuelve viajar() .
*/

public class Automovil {
	
	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTanque;
	private double cantidadDeCombustible;
	private double rendimientoPorLitro;
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public double getRendimientoPorLitro() {
		return rendimientoPorLitro;
	}
	public void setRendimientoPorLitro(double rendimientoPorLitro) {
		System.out.println("Seteo el rendimiento por litro en "+rendimientoPorLitro+" (km)");
		this.rendimientoPorLitro = rendimientoPorLitro;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public double getCapacidadTanque() {
		return capacidadTanque;
	}
	public double getCantidadDeCombustible() {
		return cantidadDeCombustible;
	}
	private void setMarca(String marca) {
		this.marca = marca;
	}
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	private void setCapacidadTanque(double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}
	private void setCantidadDeCombustible(double cantidadDeCombustible) {
		this.cantidadDeCombustible = cantidadDeCombustible;
	}
	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.capacidadTanque = capacidadTanque;
	}
	
	
	public double viajar(double distancia) {
		double km=0;
		double nafta;
		nafta=consumirCombustible(distancia);
		km=nafta*this.rendimientoPorLitro;
		System.out.println("Intente recorrer " +distancia+ " y recorri "+km);
		
		return km;
	}
	
	private double consumirCombustible(double distancia) {
		double nafta=0;		
		nafta=distancia/this.rendimientoPorLitro;				
		if (nafta>this.cantidadDeCombustible) {
			nafta=this.cantidadDeCombustible;
			this.cantidadDeCombustible=this.cantidadDeCombustible-nafta;
		} else {
			this.cantidadDeCombustible=this.cantidadDeCombustible-nafta;			
		}
		
		return nafta;
	}
	
	public boolean cargarCombustible(double nafta) {
		boolean pude=false;
		
		if(nafta<=0) {
			System.out.println("ERROR, la carga debe ser mayor a 0");
			pude=false;
		} else {
			if(nafta>espacioDisponible()) {
				System.out.println("ERROR, la carga debe ser menor que el espacio disponible");
				pude=false;
			} 	else {
				System.out.println("Cargo "+ nafta+ " litros de combustible");
				this.cantidadDeCombustible=this.cantidadDeCombustible+nafta;
				pude=true;					
			}
		} 	
		return pude;
	}
	
	private double espacioDisponible() {
		double num=0;
		
		num=this.capacidadTanque-this.cantidadDeCombustible;
		
		return num;
	}
	
	public boolean pocoCombustible() {
		boolean reserva=false;
		
		if (this.cantidadDeCombustible<(this.capacidadTanque*15/100)) {
			reserva=true;
		}
		
		return reserva;
	}
	
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", capacidadTanque="
				+ capacidadTanque + ", cantidadDeCombustible=" + cantidadDeCombustible + ", rendimientoPorLitro="
				+ rendimientoPorLitro + ", espacioDisponible()=" + espacioDisponible() + ", pocoCombustible()="
				+ pocoCombustible() + "]";
	}
	
	
}

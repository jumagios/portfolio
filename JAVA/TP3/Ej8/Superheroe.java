package objetos;

/* Crear la clase Superheroe con los atributos nombre (String), fuerza (int), resistencia
(int) y superpoderes (int). Todos los atributos numéricos deberán aceptar valores
entre 0 y 100; en caso de que el setter correspondiente reciba un valor fuera de rango deberá setear el valor límite correspondiente (si recibe un valor negativo asignar cero
y si recibe un valor superior a cien asignar cien).
El constructor de la clase recibirá todos los valores de sus atributos por parámetro
y usará los setters (todos privados) para validar el rango correcto de los poderes del
superhéroe.
También habrá el método toString() para mostrar el estado completo de la
instancia y un método competir() , ambos públicos. Este último recibirá otro
superhéroe como parámetro y, comparando los poderes de uno con otro, devolverá
“TRIUNFO”, “EMPATE” o “DERROTA”, dependiendo del resultado. Para triunfar un
superhéroe debe superar al otro en al menos 2 de los 3 ítems.
Escribir la clase Test que contenga el método main() para probar el correcto
funcionamiento de la clase previamente realizada con el siguiente ejemplo:
superHeroe1 : Nombre: “Batman”, Fuerza: 90, Resistencia: 70, Superpoderes: 0
superHeroe2 : Nombre: “Superman”, Fuerza: 95, Resistencia: 60, Superpoderes: 70.
Hacer jugar al superheroe1 pasándole el objeto superheroe2 y mostrar el resultado
por pantalla. Chequear el resultado (debería ser “DERROTA”).
Hacer jugar al superheroe2 contra el superheroe1 y mostrar el resultado por
pantalla. Chequear el resultado (debería ser “TRIUNFO”).
*/

public class Superheroe {

	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	private void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	private void setSuperpoderes(int superpoderes) {
		this.superpoderes = superpoderes;
	}
	public String getNombre() {
		return nombre;
	}
	public int getFuerza() {
		return fuerza;
	}
	public int getResistencia() {
		return resistencia;
	}
	public int getSuperpoderes() {
		return superpoderes;
	}
	
	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		super();
		this.nombre = nombre;
		this.fuerza =  valoresAceptados(fuerza);
		this.resistencia = valoresAceptados(resistencia);
		this.superpoderes = valoresAceptados(superpoderes);
	}
	
	public String competir(Superheroe heroe) {
		String resultado="";
		
		if((heroe.fuerza<this.fuerza)&&(heroe.resistencia<this.resistencia)||(heroe.fuerza<this.fuerza)&&(heroe.superpoderes<this.superpoderes)||(heroe.resistencia<this.resistencia)&&(heroe.superpoderes<this.superpoderes) ) {
			resultado="TRIUNFO";
			System.out.println("TRIUNFO");
		} else {
			if((heroe.fuerza==this.fuerza)&&(heroe.resistencia==this.resistencia)&&(heroe.superpoderes==this.superpoderes)) {
				resultado="EMPATE";
				System.out.println("EMPATE");
			} else {
				resultado="DERROTA";
				System.out.println("DERROTA");
			}
		}
		
		return resultado;
	}
	
	
	private int valoresAceptados(int valor) {
		int resul=0;
		
		if (valor>100) {
			resul=100;
		} else {
			resul=valor;
		} if (valor<0) {
			resul=0;
		} else {
			resul=valor;
		}	
		return resul;
	}
	
	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	
	
	

	
}



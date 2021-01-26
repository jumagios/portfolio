package test;

/* 
 *  * Crear una clase llamada Persona , la cual estará compuesta de la siguiente manera:
 Atributos privados:
 nombre (String),
 apellido (String),
 direccion (String).
 Métodos públicos:
 Persona() , que es su constructor .
 Los setters y getters de cada uno de sus atributos.
 El método toString() .
El constructor Persona() se encargará de inicializar cada uno de los atributos de la
clase con su valor por defecto; como en este caso todos son Strings los inicializará
con “” (string vacío).
Cada uno de los setters recibirá como parámetro un valor con tipo de dato acorde
al atributo con el que está relacionado y lo asignará al mismo. Los setters no
devuelven nada, por lo que su tipo siempre es void . Los getters , en cambio,
devuelven el valor del atributo asociado, son del mismo tipo de dato que el atributo, y
nunca reciben parámetros.
El método toString() debe implementarse tal como se muestra a continuación:
@Override
public String toString () {
return "Persona [nombre=" + nombre + ", apellido=" + apellido + ",
direccion=" + direccion + "]" ;
}
Crear la clase Test con su función main() . En esta función se crearán dos instancias
de Persona asignando valores a sus atributos mediante sus setters .
Finalmente deberás mostrar por pantalla los objetos completos utilizando
System.out.println(objeto) y también cada uno de sus atributos por separado usando
los getters .
Observación: Para cargar los objetos y luego mostrarlos debés implementar los
métodos completarDatos(...) , que recibe una instancia de Persona y los valores a
asignarle, y el método mostrarPersona(...) , que sólo recibe una instancia de Persona .
 */
 
import clases.Persona;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona pers1 = new Persona();
		Persona pers2 = new Persona();
		
		completarDatos(pers1, "Diego","Diaz","Yatay 240");
		completarDatos(pers2, "Pablo","Gomez","Av. del Libertador 6796");
		
		mostrarDatos(pers1);
		mostrarDatos(pers2);
		
		
	}

	public static void completarDatos(Persona p1, String nombre, String ape, String dire) {
		p1.setNombre(nombre);
		p1.setApellido(ape);
		p1.setDireccion(dire);
	}
	public static void mostrarDatos(Persona p1) {
		System.out.println(p1);
		System.out.println("Nombre:		" + p1.getNombre());
		System.out.println("Apellido:	" + p1.getApellido());
		System.out.println("Direccion:	" + p1.getDireccion());
	}
	

}

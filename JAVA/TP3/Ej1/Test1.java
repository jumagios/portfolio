package test;

/* 
 *  * Crear una clase llamada Persona , la cual estar� compuesta de la siguiente manera:
 Atributos privados:
 nombre (String),
 apellido (String),
 direccion (String).
 M�todos p�blicos:
 Persona() , que es su constructor .
 Los setters y getters de cada uno de sus atributos.
 El m�todo toString() .
El constructor Persona() se encargar� de inicializar cada uno de los atributos de la
clase con su valor por defecto; como en este caso todos son Strings los inicializar�
con �� (string vac�o).
Cada uno de los setters recibir� como par�metro un valor con tipo de dato acorde
al atributo con el que est� relacionado y lo asignar� al mismo. Los setters no
devuelven nada, por lo que su tipo siempre es void . Los getters , en cambio,
devuelven el valor del atributo asociado, son del mismo tipo de dato que el atributo, y
nunca reciben par�metros.
El m�todo toString() debe implementarse tal como se muestra a continuaci�n:
@Override
public String toString () {
return "Persona [nombre=" + nombre + ", apellido=" + apellido + ",
direccion=" + direccion + "]" ;
}
Crear la clase Test con su funci�n main() . En esta funci�n se crear�n dos instancias
de Persona asignando valores a sus atributos mediante sus setters .
Finalmente deber�s mostrar por pantalla los objetos completos utilizando
System.out.println(objeto) y tambi�n cada uno de sus atributos por separado usando
los getters .
Observaci�n: Para cargar los objetos y luego mostrarlos deb�s implementar los
m�todos completarDatos(...) , que recibe una instancia de Persona y los valores a
asignarle, y el m�todo mostrarPersona(...) , que s�lo recibe una instancia de Persona .
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

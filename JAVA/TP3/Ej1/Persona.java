package clases;

/*
 * Crear una clase llamada Persona , la cual estar� compuesta de la siguiente manera:
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


public class Persona {
	
	// Variables
		
	private String nombre;
	private String apellido;
	private String direccion;
	private String dni;
	// Getter y Setters
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	
	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
	
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
	
		this.direccion = direccion;
		
	}
	
	public String retornarDni() {
		return this.dni;
	}
	
	//toString
	
	public Persona() {
		super();
		this.nombre = "";
		this.apellido = "";
		this.direccion = "";
		
	}
	
	
	
	public Persona(String nombre, String apellido, String direccion, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", dni=" + dni
				+ "]";
	}

	
	


	
}

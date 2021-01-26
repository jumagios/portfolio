package clases;

/*
 * Crear una clase llamada Persona , la cual estará compuesta de la siguiente manera:
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

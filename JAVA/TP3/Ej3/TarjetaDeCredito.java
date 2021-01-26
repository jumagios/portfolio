package clases;

/* Crear la clase TarjetaDeCredito con la siguiente estructura:
 Atributos privados:
 numero (String),
 titular (String),
 limiteDeCompra (double),
 acumuladoActual (double).
 Método:
 Constructor parametrizado y público que reciba número, titular y límite
de compra por parámetros y los asigne al atributo correspondiente. El
atributo acumuladoActual se inicializará con 0 (cero).
 Los getters de cada uno de sus atributos, públicos, y los setters , todos
privados, menos el método setAcumuladoActual() que no existe.
 El método toString() (público), el cual además de los atributos debe
incluir el monto disponible para comprar.
 El método público montoDisponible() que devuelve la diferencia entre
el límite de compras y el acumulado actual de gastos, pero si por
alguna razón este valor es inferior a cero devuelve cero. Por ejemplo, si
gastaste determinado monto y luego cambiaron el límite a un valor
menor a éste, el monto disponible debe ser 0 (cero).
 El método privado compraPosible() que según el monto recibido por
parámetro devuelve si se puede o no hacer la compra. Para saber si la
compra es posible el monto de la misma no debe superar al monto
disponible para compras.
 El método público actualizarLimite() , que recibe un nuevo límite de
compra.
 El método privado acumularGastoActual() , que recibe el importe de la
compra y lo suma al acumulado actual.
 El método público realizarCompra() , el cual dado un monto comprueba
si esta se puede realizar (si con la compra no se supera el límite), y si
es posible la procesa actualizando los atributos que deba actualizar
siempre usando los métodos que corresponda. Este método devuelve
un booleano que indica si la compra se pudo realizar o no.
En la clase Test , se creará un objeto tarjeta con la siguiente información:
 Numero 4145414122221111
 Titular Juan Perez
 Limite 10000
*/

public class TarjetaDeCredito {

	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.acumuladoActual = 0;
	}

	public String getNumero() {
		return numero;
	}
	public String getTitular() {
		return titular;
	}
	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}
	public double getAcumuladoActual() {
		return acumuladoActual;
	}
	private void setNumero(String numero) {
		this.numero = numero;
	}
	private void setTitular(String titular) {
		this.titular = titular;
	}
	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}	
	public double montoDisponible() {
		double monto;
		
		monto=this.limiteDeCompra-this.acumuladoActual;
		if (monto<0) {
			monto=0;
		}
		return monto;
		
	}

	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=$" + limiteDeCompra
				+ ", acumuladoActual=$" + acumuladoActual + ", montoDisponible()=$" + montoDisponible() + "]";
	}
	
	public void actualizarLimite(double limite) {	
		this.setLimiteDeCompra(limite);
		
	}
	
	private void acumularGastoActual(double importe) {
		
		this.acumuladoActual=(this.acumuladoActual+importe);	
		
	}
	
	public boolean realizarCompra(double valor) {
		boolean exito=false;
		
		if (this.compraPosible(valor)) {
			this.acumularGastoActual(valor);
			exito = true;
		}
		
		return exito;
	}
	
	private boolean compraPosible(double monto) {
		boolean compra=false;
		
		if (monto<=montoDisponible()) {
			compra=true;
		}
		
		return compra;
		
	}
	
}

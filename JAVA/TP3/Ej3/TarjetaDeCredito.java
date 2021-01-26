package clases;

/* Crear la clase TarjetaDeCredito con la siguiente estructura:
 Atributos privados:
 numero (String),
 titular (String),
 limiteDeCompra (double),
 acumuladoActual (double).
 M�todo:
 Constructor parametrizado y p�blico que reciba n�mero, titular y l�mite
de compra por par�metros y los asigne al atributo correspondiente. El
atributo acumuladoActual se inicializar� con 0 (cero).
 Los getters de cada uno de sus atributos, p�blicos, y los setters , todos
privados, menos el m�todo setAcumuladoActual() que no existe.
 El m�todo toString() (p�blico), el cual adem�s de los atributos debe
incluir el monto disponible para comprar.
 El m�todo p�blico montoDisponible() que devuelve la diferencia entre
el l�mite de compras y el acumulado actual de gastos, pero si por
alguna raz�n este valor es inferior a cero devuelve cero. Por ejemplo, si
gastaste determinado monto y luego cambiaron el l�mite a un valor
menor a �ste, el monto disponible debe ser 0 (cero).
 El m�todo privado compraPosible() que seg�n el monto recibido por
par�metro devuelve si se puede o no hacer la compra. Para saber si la
compra es posible el monto de la misma no debe superar al monto
disponible para compras.
 El m�todo p�blico actualizarLimite() , que recibe un nuevo l�mite de
compra.
 El m�todo privado acumularGastoActual() , que recibe el importe de la
compra y lo suma al acumulado actual.
 El m�todo p�blico realizarCompra() , el cual dado un monto comprueba
si esta se puede realizar (si con la compra no se supera el l�mite), y si
es posible la procesa actualizando los atributos que deba actualizar
siempre usando los m�todos que corresponda. Este m�todo devuelve
un booleano que indica si la compra se pudo realizar o no.
En la clase Test , se crear� un objeto tarjeta con la siguiente informaci�n:
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

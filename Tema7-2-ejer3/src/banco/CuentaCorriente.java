package banco;

public class CuentaCorriente {


	private String titular, numero;
	static private int codigo=0;
	private float saldo;
	
	public CuentaCorriente(String titular, String numero, float saldo) {

		this.titular = titular;
		this.numero = numero;
		this.codigo++;
		this.saldo = saldo;
		
	}
	
	
}

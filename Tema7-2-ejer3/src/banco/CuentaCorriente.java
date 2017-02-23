package banco;

public class CuentaCorriente {


	
	private String titular, numero;
	static private int codigo=0;
	private float saldo;
	
	public CuentaCorriente(String titular, String numero, float saldo) {

		this.titular = titular;
		this.numero = numero;
		codigo++;
		this.saldo = saldo;
		
	}


	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}

	public String getNumero() {
		return numero;
	}

	public static int getCodigo() {
		return codigo;
	}

	
	public void ingresarDinero(float ingreso) {
	    float saldoFinal;
		saldoFinal=getSaldo()+ingreso;
		setSaldo(saldoFinal);
	}
	
	public boolean retirarDinero(float retirar) {
	    boolean puede=true;
		float saldoFinal=getSaldo();
		if (saldoFinal<retirar)
			puede=false;
		else
			setSaldo(saldoFinal-retirar);
		
		return puede;
	}
	
}

package banco;


public class Cuentas {


	private CuentaCorriente[] lista;
	static private int nCuentas;
	
	public Cuentas() {
		
		this.lista=new CuentaCorriente[100];
	}
	
	
	
	
	public Cuentas(int numeroCuentas){//Crea una cantidad de cuentas con datos aleatorios.
		int saldo, random;
		String titular="", numero="", caracteres="0123456789";
		String[] palabras=new String[5];
		palabras[0]="Marta";
		palabras[1]="Javier";
		palabras[2]="Sandra";
		palabras[3]="David";
		palabras[4]="Juan";


		//(int)(Math.random()*(hasta-desde+1)+desde)
	
	

		for (int i=0;i<numeroCuentas;i++){

			random=(int)(Math.random()*(4-0+1)+0);
			titular=palabras[random];

			random=(int)(Math.random()*(10000-0+1)+0);
			saldo=random;
			
			for(int j=0;j<4;j++){
			random=(int)(Math.random()*(9-0+1)+0);
			numero+=caracteres.charAt(random);
			
			}
			
			CuentaCorriente defecto=new CuentaCorriente(titular, numero, saldo);
			lista[i]=defecto;
			titular="";
			numero="";
		}

	}
	
}

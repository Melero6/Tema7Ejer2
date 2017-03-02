package banco;

import java.util.*;

public class Cuentas {


	private CuentaCorriente[] lista;
	static private int nCuentas;
	private int[] posiciones;


	public static void setnCuentas(int nCuentas) {
		Cuentas.nCuentas = nCuentas;
	}

	public static int getnCuentas() {
		return nCuentas;
	}
	public  CuentaCorriente getCuenta(int posicion) {
		CuentaCorriente Cuenta = lista[posicion];

		return Cuenta;
	}

	public Cuentas() {

		lista=new CuentaCorriente[100];
		posiciones=new int[100];

	}

	public void ingresar(int seleccion, float ingreso){ 

		lista[seleccion].setSaldo(lista[seleccion].getSaldo()+ingreso);
		ordenar();

	}

	public void retirar(int seleccion, float retiro){

		lista[seleccion].setSaldo(lista[seleccion].getSaldo()-retiro);
		ordenar();

	}


	public void mostrar(){
		for (int i=0;i<nCuentas;i++){
			System.out.println("Codigo lista: "+ nCuentas);
			System.out.println("Codigo: "+CuentaCorriente.getCodigo());
			System.out.println("Titular: "+this.lista[i].getTitular());
			System.out.println("Saldo: "+this.lista[i].getSaldo());
			System.out.println("Numero: "+this.lista[i].getNumero());
			System.out.println();

		}

	}
	public void mostrarMayor(){
		for (int i=0;i<nCuentas;i++){

			if(this.lista[i].getSaldo()==this.lista[0].getSaldo()){
				System.out.println("Codigo lista: "+ nCuentas);
				System.out.println("Codigo: "+CuentaCorriente.getCodigo());
				System.out.println("Titular: "+this.lista[i].getTitular());
				System.out.println("Saldo: "+this.lista[i].getSaldo());
				System.out.println("Numero: "+this.lista[i].getNumero());
				System.out.println();
			}
		}	
	}


	public void  añadirCuentas(int numeroCuentas){//Crea una cantidad de cuentas con datos aleatorios.
		float saldo; 
		int random;
		String titular="", numero="", caracteres="0123456789";
		String[] palabras=new String[5];
		palabras[0]="Marta";
		palabras[1]="Javier";
		palabras[2]="Sandra";
		palabras[3]="David";
		palabras[4]="Juan";
		boolean valida;

		//(int)(Math.random()*(hasta-desde+1)+desde)


		for (int i=0;i<numeroCuentas;i++){

			random=(int)(Math.random()*(4-0+1)+0);
			titular=palabras[random];

			random=(int)(Math.random()*(10000-0+1)+0);
			saldo=random;

			do{
				for(int j=0;j<20;j++){
					random=(int)(Math.random()*(9-0+1)+0);
					numero+=caracteres.charAt(random);
				}
				valida=comprobarNumero(numero);
			}while(!valida);

			CuentaCorriente defecto=new CuentaCorriente(titular, numero, saldo);
			lista[i]=defecto;
			Cuentas.setnCuentas(CuentaCorriente.getCodigo());
			numero="";

		}
		ordenar();

	}
	public boolean comprobarNumero(String numeroCuenta){
		boolean cuentaValida=true;

		for (int i=0; i<nCuentas; i++)
			if (lista[i].getNumero().equals(numeroCuenta))
				cuentaValida=false;


		return cuentaValida;
	}

	public void ordenar(){
		CuentaCorriente[] aux=new CuentaCorriente[1];

		//	System.arraycopy(lista, 0, aux, 0,nCuentas); DOS FORMAS DE COPIAR ARRAYS
		//  aux=Arrays.copyOf(lista ,nCuentas);

		for (int i=0; i<nCuentas-1; i++){
			for (int j=0;j<nCuentas-1-i; j++){
				if (lista[j].getSaldo()<lista[j+1].getSaldo()){
					aux[0]=lista[j];
					lista[j]=lista[j+1];
					lista[j+1]=aux[0];
				}
			}



		}


	}
}

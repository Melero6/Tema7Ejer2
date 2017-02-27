package herencia;

import java.util.Scanner;

public class Empleado extends Personas {


	private int nEmpleado;
	private int antiguedad;
	private static float salarioBase=1000.00F;


	public int getnEmpleado() {
		return nEmpleado;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public static float getSalarioBase() {
		return salarioBase;
	}
	public Empleado() {
		super();
		int nEmpleado =(int)(Math.random()*(100000-0+1)+0);
		int antiguedad =(int)(Math.random()*(20-0+1)+0);
		this.nEmpleado = nEmpleado;
		this.antiguedad = antiguedad;
	}
	public void imprimeRecibo(){
		
		System.out.printf("Salario base:               %7.2f €\n",salarioBase );
		System.out.printf("Antiguedad: %2d             %7.2f €\n", antiguedad ,(antiguedad*(20+salarioBase*0.01F)));
		System.out.printf("Total:                      %7.2f €\n",calculo());
		System.out.println();
	}
	
	public float calculo(){
		float salario=0;
		
		salario=(antiguedad*(20+salarioBase*0.01F))+salarioBase;
		
		return salario;
	}

//	public  Personas añadir(int selector){
//		Scanner teclado=new Scanner(System.in);
//		int nEmpleado=0;
//		String  nombre="", dni="";
//
//		Personas defecto;
//
//		System.out.print("nEmp");
//		nEmpleado=teclado.nextInt();
//		System.out.print("nombre");
//		nombre=teclado.nextLine();
//		teclado.next();
//		System.out.print("dni");
//		dni=teclado.nextLine();
//		teclado.next();
//
//		defecto= new Empleado(nEmpleado, nombre, dni);
//		return defecto;
//
//	}
	
	

	public void mostrar(){

		System.out.println("EMPLEADO");
		super.mostrar();
//		imprimeRecibo();

	}
	
	public void sup(){
		super.mostrar();
	}


}

package herencia;

import java.util.Scanner;

public class Jefe extends Empleado {

	private String departamento;
	private static float salarioJefe=500;
	private float plusJefe;

	public Jefe() {
		super();
		String departamento="Madera";
		float plusJefe=(float)(Math.random()*(100-0+1)+0);
		this.departamento = departamento;
		this.plusJefe = plusJefe;
		
		
	//	(
	}
	
	public void imprimeRecibo(){
		
		System.out.printf("Salario base:              %7.2f €\n",Empleado.getSalarioBase());
		System.out.printf("Antiguedad: %2d             %7.2f €\n",getAntiguedad() ,(getAntiguedad()*(20+Empleado.getSalarioBase()*0.01F)));
		System.out.printf("Salario jefe:              %7.2f €\n",salarioJefe);
		System.out.printf("Total:                     %7.2f €\n",calculo());
		System.out.println();
		
	}
	
	public float calculo(){
		float salario=0;
		
		salario=(getAntiguedad()*(20+Empleado.getSalarioBase()*0.01F))+Empleado.getSalarioBase()+plusJefe+salarioJefe;
		
		return salario;
	}

//	public  Personas añadir(int selector){
//		Scanner teclado=new Scanner(System.in);
//		int nEmpleado=0;
//		String departamento="", nombre="", dni="";
//
//		Personas defecto;
//
//		System.out.print("depart");
//		departamento=teclado.nextLine();
//		System.out.print("nEmp");
//		nEmpleado=teclado.nextInt();
//		System.out.print("nombre");
//		nombre=teclado.nextLine();
//		teclado.next();
//		System.out.print("dni");
//		dni=teclado.nextLine();
//		teclado.next();
//
//		defecto= new Jefe(departamento, nEmpleado, nombre, dni);
//		return defecto;
//
//	}
	

	
	public void mostrar(){

		System.out.println("JEFE");
		super.sup();
		//imprimeRecibo();

	}



}

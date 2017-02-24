package herencia;

import java.util.Scanner;

public class Jefe extends Empleado {

	private String departamento;

	public Jefe(String departamento,int nEmpleado,String nombre,String dni) {
		super(nEmpleado, nombre, dni);
		this.departamento = departamento;
	}
	public Jefe() {

	}

	public  Personas añadir(int selector){
		Scanner teclado=new Scanner(System.in);
		int nEmpleado=0;
		String departamento="", nombre="", dni="";

		Personas defecto;

		System.out.print("depart");
		departamento=teclado.nextLine();
		System.out.print("nEmp");
		nEmpleado=teclado.nextInt();
		System.out.print("nombre");
		nombre=teclado.nextLine();
		teclado.next();
		System.out.print("dni");
		dni=teclado.nextLine();
		teclado.next();

		defecto= new Jefe(departamento, nEmpleado, nombre, dni);
		return defecto;

	}
	public void mostrar(){

		System.out.println("Jefe");

	}



}

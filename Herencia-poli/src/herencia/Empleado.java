package herencia;

import java.util.Scanner;

public class Empleado extends Personas {


	private int nEmpleado;


	public Empleado(int nEmpleado, String nombre,String dni) {
		super(nombre, dni);
		this.nEmpleado = nEmpleado;
	}
	public Empleado() {

	}

	public  Personas añadir(int selector){
		Scanner teclado=new Scanner(System.in);
		int nEmpleado=0;
		String  nombre="", dni="";

		Personas defecto;

		System.out.print("nEmp");
		nEmpleado=teclado.nextInt();
		System.out.print("nombre");
		nombre=teclado.nextLine();
		teclado.next();
		System.out.print("dni");
		dni=teclado.nextLine();
		teclado.next();

		defecto= new Empleado(nEmpleado, nombre, dni);
		return defecto;

	}
	public void mostrar(){

		System.out.println("Empleado");

	}


}

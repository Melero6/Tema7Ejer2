package herencia;

import java.util.Scanner;

public class Personas {

	private String nombre, dni;


	public Personas(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	public Personas() {

	}

	public  Personas añadir(int selector){
		Scanner teclado=new Scanner(System.in);
		String  nombre="", dni="";

		Personas defecto;

		System.out.print("nombre");
		nombre=teclado.nextLine();
		System.out.println();
		System.out.print("dni");
		dni=teclado.nextLine();
		System.out.println();

		defecto= new Personas(nombre, dni);
		return defecto;

	}

	public void mostrar(){
		System.out.println("Persona");

	}


}

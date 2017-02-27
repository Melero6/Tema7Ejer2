package herencia;

import java.util.Scanner;


public class Personas implements CalculoSalario {

	private String nombre, dni;


	public Personas() {
		
		int random;
		String[] palabras=new String[5];
		palabras[0]="Marta";
		palabras[1]="Javier";
		palabras[2]="Sandra";
		palabras[3]="David";
		palabras[4]="Juan";
		
		random=(int)(Math.random()*(4-0+1)+0);
		String nombre=palabras[random];
		
		String dni="3456124Z";
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public void imprimeRecibo(){
		System.out.println();
	
	}
	
	
	public float calculo(){
		return 0;
	}

//	public  Personas añadir(int selector){
//		Scanner teclado=new Scanner(System.in);
//		String  nombre="", dni="";
//
//		Personas defecto;
//
//		System.out.print("nombre");
//		nombre=teclado.nextLine();
//		System.out.println();
//		System.out.print("dni");
//		dni=teclado.nextLine();
//		System.out.println();
//
//		defecto= new Personas(nombre, dni);
//		return defecto;
//
//	}

	public void mostrar(){
		
		System.out.println("DATOS");
		System.out.println("Nombre: "+nombre);
		System.out.println("DNI: "+dni);
		imprimeRecibo();

	}


}

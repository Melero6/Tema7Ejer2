package Discos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		

		
		int  seleccion=0, i;
		String eAN, repe;
		Fecha fechaCompra=new Fecha(1,1,1);
		ColeccionDiscos coleccionDisc=new ColeccionDiscos();
		Disco disco=new Disco(0,0,"","","",fechaCompra);

		do{
			eAN=null;
		System.out.println("*Escribe el numero de la opcion que desees seleccionar para modificar tu coleccion*\n1- Mostrar un disco\n2- Eliminar un disco\n3- Añadir un disco");
		seleccion=teclado.nextInt();
		switch(seleccion){
		case 1://Mostrar
			System.out.println("Introduce el EAN del disco que quieras mostrar, escribe 'todo' para ver todos los discos.");
			eAN=teclado.nextLine();
			
			if(eAN.equals("todo")||eAN.equals("Todo")||eAN.equals("TODO"))
				coleccionDisc.mostrar();
			else
				coleccionDisc.mostrar(eAN);
		
			do{
			System.out.print("¿Desea realizar otra operacion? Y/N:");
			repe=teclado.next();
			}while(repe.compareToIgnoreCase("Y")!=0&&repe.compareToIgnoreCase("N")!=0);
			
			break;
		case 2://Eliminar
			
			System.out.println("Introduce el EAN del disco que quieras borrar");
			eAN=teclado.nextLine();
			coleccionDisc.borrar(eAN);
			
			do{
			System.out.print("¿Desea realizar otra operacion? Y/N:");
			repe=teclado.next();
			}while(repe.compareToIgnoreCase("Y")!=0&&repe.compareToIgnoreCase("N")!=0);
		
			break;
		case 3://Añadir
			
			do{
			disco.visualCrearDisco();
			i=coleccionDisc.existeEAN(disco.geteAN());
			if(i!=-1)
				System.out.println("Existe un disco con el EAN: "+disco.geteAN());
			}while(i!=-1);
			
			coleccionDisc.añadir(disco);
			System.out.println("Disco añadido");
			
			do{
			System.out.print("¿Desea realizar otra operacion? Y/N:");
			repe=teclado.next();
			}while(repe.compareToIgnoreCase("Y")!=0&&repe.compareToIgnoreCase("N")!=0);
			
			break;
		default:
			repe="Y";
		}
		
		}while(repe.compareToIgnoreCase("Y")==0);
		
	
		
	}

}

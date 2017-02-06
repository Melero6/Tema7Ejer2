package Discos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);


		int  seleccion;
		boolean existeEAN, borrado;
		String eAN, repe;

		Fecha fechaCompra=new Fecha(1,1,1);
		ColeccionDiscos coleccionDisc=new ColeccionDiscos();

		do{
			eAN=null;
			System.out.println("*Escribe el numero de la opcion que desees seleccionar para modificar tu coleccion*\n1- Mostrar un disco\n2- Eliminar un disco\n3- Añadir un disco");
			seleccion=teclado.nextInt();

			switch(seleccion){
			case 1://Mostrar
				System.out.print("Introduce el EAN del disco que quieras mostrar, escribe 'todo' para ver todos los discos: ");
				eAN=teclado.next();

				if(eAN.equals("todo")||eAN.equals("Todo")||eAN.equals("TODO"))
					coleccionDisc.mostrarTodo();
				else
					coleccionDisc.mostrar(eAN);

				do{
					System.out.print("¿Desea realizar otra operacion? Y/N:");
					repe=teclado.next();
				}while(repe.compareToIgnoreCase("Y")!=0&&repe.compareToIgnoreCase("N")!=0);

				break;

			case 2://Eliminar
				System.out.print("Introduce el EAN del disco que quieras borrar: ");
				eAN=teclado.next();

				borrado=coleccionDisc.borrar(eAN);
				if (borrado)
					System.out.println("No se ha borrado ningun disco, EAN no encontrado.");
				else
					System.out.println("Disco borrado.");

				do{
					System.out.print("¿Desea realizar otra operacion? Y/N:");
					repe=teclado.next();
				}while(repe.compareToIgnoreCase("Y")!=0&&repe.compareToIgnoreCase("N")!=0);

				break;

			case 3://Añadir

				Disco disco=new Disco(0,0,"","","",fechaCompra);
				
				do{
					disco.visualCrearDisco();
					existeEAN=coleccionDisc.existeEAN(disco.geteAN());
					if(existeEAN){
						System.out.println("Existe un disco con el EAN: "+disco.geteAN());
						System.out.println("Introduce otro disco: ");
					}
				}while(existeEAN);

				coleccionDisc.añadir(disco);
				System.out.println("Disco añadido.");

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

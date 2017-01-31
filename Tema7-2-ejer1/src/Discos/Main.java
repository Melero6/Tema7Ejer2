package Discos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int  nCanciones, precio, dia, mes, a�o, seleccion=0, indice=0;
		String eAN, titulo, artista, repe;
		Fecha fechaCompra;
		ColeccionDiscos coleccionDisc=new ColeccionDiscos();
		Disco disco;

		do{
		System.out.print("*Escribe el numero de la opcion que desees seleccionar para modificar tu coleccion*\n1- Mostrar un disco\n2- Eliminar un disco\n3- A�adir un disco");
		seleccion=teclado.nextInt();
		switch(seleccion){
		case 1://Mostrar
			do{
				System.out.print("�En que posicion de la coleccion se encuentra el disco que quieres mostrar?(Min=1 Max=100): ");
				indice=teclado.nextInt();
				indice-=1;
			}while(indice<-1||indice>99);
			if(indice==-1)
				coleccionDisc.mostrar();
			else
				coleccionDisc.mostrar(indice);
			
			
			System.out.print("�Desea realizar otra operacion? Y/N:");
			repe=teclado.next();
			
			break;
		case 2://Eliminar
			do{
				System.out.print("�En que posicion de la coleccion se encuentra el disco que quieres eliminar?(Min=1 Max=100): ");
				indice=teclado.nextInt();
				indice-=1;
			}while(indice<-1||indice>99);
			coleccionDisc.borrar(indice);
			
			System.out.print("�Desea realizar otra operacion? Y/N:");
			repe=teclado.next();
			
			break;
		case 3://A�adir
			do{
				System.out.print("�En que posicion de la coleccion quieres a�adir el disco?(Min=1 Max=100): ");
				indice=teclado.nextInt();
				indice-=1;
			}while(indice<-1||indice>99);
			disco=new Disco();
			coleccionDisc.a�adir(disco, indice);
			System.out.println("Disco a�adido en la posicion "+indice+1);
			
			System.out.print("�Desea realizar otra operacion? Y/N:");
			repe=teclado.next();
			
			break;
		default:
			repe="Y";
		}
		
		}while(repe.compareToIgnoreCase("Y")==0);
		

		
		
		
//		System.out.println(titulo+" "+artista+" "+eAN+" "+nCanciones+" "+precio+" "+fechaCompra.getDia()+" "+fechaCompra.getMes()+" "+fechaCompra.getAnio()+" ");
		
	}

}

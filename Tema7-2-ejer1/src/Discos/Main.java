package Discos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		

		
		int  nCanciones, precio, dia, mes, a�o, seleccion=0, indice=0, i;
		String eAN, titulo, artista, repe;
		Fecha fechaCompra=new Fecha(1,1,1);
		ColeccionDiscos coleccionDisc=new ColeccionDiscos();
		Disco disco=new Disco(0,0,"","","",fechaCompra);

		do{
		System.out.println("*Escribe el numero de la opcion que desees seleccionar para modificar tu coleccion*\n1- Mostrar un disco\n2- Eliminar un disco\n3- A�adir un disco");
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
			
			do{
			System.out.print("�Desea realizar otra operacion? Y/N:");
			repe=teclado.next();
			}while(repe.compareToIgnoreCase("Y")!=0&&repe.compareToIgnoreCase("N")!=0);
			
			break;
		case 2://Eliminar
			do{
				System.out.print("�En que posicion de la coleccion se encuentra el disco que quieres eliminar?(Min=1 Max=100): ");
				indice=teclado.nextInt();
				indice-=1;
			}while(indice<-1||indice>99);
			coleccionDisc.borrar(indice);
			
			System.out.println("Se ha borrado el disco en la posicion: "+(indice+1));
			
			do{
			System.out.print("�Desea realizar otra operacion? Y/N:");
			repe=teclado.next();
			}while(repe.compareToIgnoreCase("Y")!=0&&repe.compareToIgnoreCase("N")!=0);
		
			break;
		case 3://A�adir
			do{
				System.out.print("�En que posicion de la coleccion quieres a�adir el disco?(Min=1 Max=100): ");
				indice=teclado.nextInt();
				indice-=1;
			}while(indice<-1||indice>99);
			
			do{
			disco.visualCrearDisco();
			i=coleccionDisc.existeEAN(disco.geteAN());
			if(i!=-1)
				System.out.println("Existe un disco con ese EAN en la posicion: "+(i+1)+"\nIntroduce otro disco:");
			}while(i!=-1);
			
			coleccionDisc.a�adir(disco, indice);
			System.out.println("Disco a�adido en la posicion "+(indice+1));
			
			do{
			System.out.print("�Desea realizar otra operacion? Y/N:");
			repe=teclado.next();
			}while(repe.compareToIgnoreCase("Y")!=0&&repe.compareToIgnoreCase("N")!=0);
			
			break;
		default:
			repe="Y";
		}
		
		}while(repe.compareToIgnoreCase("Y")==0);
		
	
		
	}

}

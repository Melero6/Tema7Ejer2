package Discos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int  nCanciones, precio, dia, mes, año;
		String eAN, titulo, artista;
		Fecha fechaCompra;
		System.out.print("Titulo:");
		titulo=teclado.nextLine();
		System.out.print("Artista:");
		artista=teclado.nextLine();
		System.out.print("EAN:");
		eAN=teclado.nextLine();
		System.out.print("Nº de canciones:");
		nCanciones=teclado.nextInt();
		System.out.print("Precio:");
		precio=teclado.nextInt();


		
		fechaCompra=new Fecha();
		fechaCompra=fechaCompra.validador();
		
		
		System.out.println(titulo+" "+artista+" "+eAN+" "+nCanciones+" "+precio+" "+fechaCompra.getDia()+" "+fechaCompra.getMes()+" "+fechaCompra.getAnio()+" ");
		
	}

}

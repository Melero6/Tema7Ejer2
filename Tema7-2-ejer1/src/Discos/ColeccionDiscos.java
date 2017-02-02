package Discos;

import java.util.Scanner;

public class ColeccionDiscos {

	private Disco[] coleccion;


	public ColeccionDiscos(){

		Fecha fech=new Fecha(1,1,1);
		coleccion=new Disco[100];
		for(int i=0;i<100;i++){
			coleccion[i]=new Disco(0,0,"","","",fech);
		}

	}



	public void añadir(Disco disc, int indice){
		Scanner teclado = new Scanner(System.in);
		
		boolean llave=true;
		String seleccion;
	
		if(coleccion[indice].getTitulo().compareToIgnoreCase("")!=0){
			do{
			System.out.println("Existe un disco en esta posicion, ¿desea sobreescribirlo? Y/N");
		seleccion=teclado.nextLine();
		
		}while(seleccion.compareToIgnoreCase("N")!=0&&seleccion.compareToIgnoreCase("Y")!=0);
			if(seleccion.compareToIgnoreCase("N")==0)
				llave=false;
		}
			if(llave)
			coleccion[indice]=disc;
			else
				System.out.println("No se ha sobreescrito el disco.");
	}
	
	public void borrar(int indice){
		
		Fecha fech=new Fecha(1,1,1);
		coleccion[indice]=new Disco(0,0,"","","",fech);

		
	}

	public void mostrar(int indice){
		System.out.println();
		if(coleccion[indice].getTitulo().compareToIgnoreCase("")!=0){
		Fecha fech;
		System.out.println("Titulo: "+coleccion[indice].getTitulo());

		System.out.println("Artista: "+coleccion[indice].getArtista());

		System.out.println("EAN: "+coleccion[indice].geteAN());

		System.out.println("Nº de canciones: "+coleccion[indice].getnCanciones());

		System.out.println("Precio: "+coleccion[indice].getPrecio());
		
		System.out.print("Fecha: ");
		fech=coleccion[indice].getFechaCompra();
		fech.mostrar();
		
		System.out.println();
		}
		else
			System.out.println("Vacio.");
		
	}
	public void mostrar(){
		for(int indice=0;indice<100;indice++){
		System.out.println("Disco "+(indice+1)+":");
		if(coleccion[indice].getTitulo().compareToIgnoreCase("")!=0){
		Fecha fech;
		System.out.println("Titulo: "+coleccion[indice].getTitulo());

		System.out.println("Artista: "+coleccion[indice].getArtista());

		System.out.println("EAN: "+coleccion[indice].geteAN());

		System.out.println("Nº de canciones: "+coleccion[indice].getnCanciones());

		System.out.println("Precio: "+coleccion[indice].getPrecio());
		
		System.out.print("Fecha: ");
		fech=coleccion[indice].getFechaCompra();
		fech.mostrar();
		
		System.out.println();
		}
		else
			System.out.println("Vacio.");
		}
	}
	
	public int existeEAN(String EAN){
		int i=-1;
		for(int indice=0;indice<100;indice++){
			
			if (EAN.equals(coleccion[indice].geteAN()))
					i=indice;
		}
		return i;
	}


}

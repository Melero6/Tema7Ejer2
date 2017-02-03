package Discos;

import java.util.Scanner;

public class ColeccionDiscos {

	private Disco[] coleccion;
	private int nDiscos;

	public ColeccionDiscos(){
		coleccion=new Disco[100];
		this.nDiscos=0;
	}

	public int getnDiscos() {
		return nDiscos;
	}

	public void setnDiscos(int nDiscos) {
		this.nDiscos = nDiscos;
	}

	public void añadir(Disco disc){
	
			coleccion[this.nDiscos]=disc;
			setnDiscos((getnDiscos()+1));
	}
	
	public void borrar(String id){		
		boolean llave=true;
		for(int i=0;i<getnDiscos();i++){
			if (id.equals(coleccion[i].geteAN())){
				coleccion[i]=null;
				setnDiscos((getnDiscos()-1));
				llave=false;
			}
		}
		if (llave)
			System.out.println("No se ha borrado ningun disco");
	}

	public void mostrar(String id){
		boolean llave=true;
		System.out.println();
		for(int i=0;i<getnDiscos();i++){
			if (id.equals(coleccion[i].geteAN())){
		Fecha fech;
		System.out.println("Titulo: "+coleccion[i].getTitulo());

		System.out.println("Artista: "+coleccion[i].getArtista());

		System.out.println("EAN: "+coleccion[i].geteAN());

		System.out.println("Nº de canciones: "+coleccion[i].getnCanciones());

		System.out.println("Precio: "+coleccion[i].getPrecio());
		
		System.out.print("Fecha: ");
		fech=coleccion[i].getFechaCompra();
		fech.mostrar();
		llave=false;
		System.out.println();
			}
			if (llave)
				System.out.println("No se ha encontrado ningun disco con el EAN: "+id);
		}
		
	}
	public void mostrar(){
		
		for(int indice=0;indice<getnDiscos();indice++){
		System.out.println("Disco "+(indice+1)+":");
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
		
	}
	
	public int existeEAN(String EAN){
		int i=-1;
		for(int indice=0;indice<getnDiscos();indice++){
			if (EAN.equals(coleccion[indice].geteAN()))
					i=indice;
		}
		return i;
	}


}

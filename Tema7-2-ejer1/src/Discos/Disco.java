package Discos;

import java.util.Scanner;

public class Disco {

	private int  nCanciones;
	private String eAN, titulo, artista;
	private Fecha fechaCompra;
	private float precio;
	
	public Disco(int nCanciones, float precio, String eAN, String titulo, String artista, Fecha fechaCompra) {
		
		this.nCanciones = nCanciones;
		this.precio = precio;
		this.eAN = eAN;
		this.titulo = titulo;
		this.artista = artista;
		this.fechaCompra = fechaCompra;
	}
	public Disco visualCrearDisco(){
		Scanner teclado = new Scanner(System.in);
	
		int  nCanciones1;
		String eAN1, titulo1, artista1;
		Fecha fechaCompra1;
		float precio1;
		
		Disco temp;
		System.out.print("Titulo:");
		titulo1=teclado.nextLine();
		System.out.print("Artista:");
		artista1=teclado.nextLine();
		System.out.print("EAN:");
		eAN1=teclado.nextLine();		
		System.out.print("Nº de canciones:");
		nCanciones1=teclado.nextInt();
		System.out.print("Precio:");
		precio1=teclado.nextFloat();
		
		
		fechaCompra1=new Fecha();
		fechaCompra1=fechaCompra1.validador();
		temp=new Disco(nCanciones1, precio1, eAN1, titulo1, artista1, fechaCompra1);
		
		return temp;
	}
	
	
	public int getnCanciones() {
		return nCanciones;
	}
	public void setnCanciones(int nCanciones) {
		this.nCanciones = nCanciones;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String geteAN() {
		return eAN;
	}
	public void seteAN(String eAN) {
		this.eAN = eAN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public Fecha getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Fecha fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public Fecha getDia() {
		return fechaCompra;
	}
	public Fecha getMes() {
		return fechaCompra;
	}
	public Fecha getAño() {
		return fechaCompra;
	}
	
	
	
	
	
	
}

package Discos;

import java.util.Scanner;

public class Disco {

	private int  nCanciones;
	private String eAN, titulo, artista;
	private Fecha fechaCompra;
	float precio;
	
	public Disco(int nCanciones, float precio, String eAN, String titulo, String artista, Fecha fechaCompra) {
		
		this.nCanciones = nCanciones;
		this.precio = precio;
		this.eAN = eAN;
		this.titulo = titulo;
		this.artista = artista;
		this.fechaCompra = fechaCompra;
	}
	public Disco(){
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Titulo:");
		titulo=teclado.nextLine();
		System.out.print("Artista:");
		artista=teclado.nextLine();
		System.out.print("EAN:");
		eAN=teclado.nextLine();
		System.out.print("Nº de canciones:");
		nCanciones=teclado.nextInt();
		System.out.print("Precio:");
		precio=teclado.nextFloat();
		
		fechaCompra=new Fecha();
		fechaCompra=fechaCompra.validador();
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

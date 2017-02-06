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

	public void visualCrearDisco(){
		Scanner teclado = new Scanner(System.in);

		Fecha fechaCompra1;

		System.out.print("Titulo:");
		setTitulo(teclado.nextLine());
		System.out.print("Artista:");
		setArtista(teclado.nextLine());
		System.out.print("EAN:");
		seteAN(teclado.nextLine());		
		System.out.print("Nº de canciones:");
		setnCanciones(teclado.nextInt());
		System.out.print("Precio:");
		setPrecio(teclado.nextFloat());

		fechaCompra1=new Fecha();
		fechaCompra1=fechaCompra1.validador();
		setFechaCompra(fechaCompra1);

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

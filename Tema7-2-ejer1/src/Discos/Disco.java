package Discos;


public class Disco {

	private int  nCanciones, precio;
	private String eAN, titulo, artista;
	private Fecha fechaCompra;
	
	public Disco(int nCanciones, int precio, String eAN, String titulo, String artista, Fecha fechaCompra) {
		
		this.nCanciones = nCanciones;
		this.precio = precio;
		this.eAN = eAN;
		this.titulo = titulo;
		this.artista = artista;
		this.fechaCompra = fechaCompra;
	}
	
	
	
	
}

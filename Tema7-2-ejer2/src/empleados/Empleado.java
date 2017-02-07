package empleados;

import java.util.Scanner;

public class Empleado {
	
	private int id, titulo, añosEmpresa;
	private String nombre;
	private String estadoC;
	private String turno;
	

	public Empleado(int id, int titulo, int añosEmpresa, String nombre, String estadoC, String turno) {

		this.id = id;
		this.titulo = titulo;
		this.añosEmpresa = añosEmpresa;
		this.nombre = nombre;
		this.estadoC = estadoC;
		this.turno = turno;
	}
	
	public Empleado() {

		this.id = 101;
		this.titulo = 5;
		this.añosEmpresa = -1;
		this.nombre = "";
		this.estadoC = "";
		this.turno = "";
	}
	
	public boolean comprobar(){
		boolean correcto=true;
		
		if (this.id<1||this.id>100){
			System.out.println("El id no esta entre 1 y 100.");
			correcto=false;
		}
		if (this.titulo<0||this.titulo>4){
			System.out.println("La titualcion no esta entre 0 y 4.");
			correcto=false;
		}
		if ((this.turno.charAt(0)!='N'&&this.turno.charAt(0)!='n')&&
			(this.turno.charAt(0)!='D'&&this.turno.charAt(0)!='d')){
			System.out.println("El turno no es 'D' o 'N'.");
			correcto=false;
		}
		if (this.estadoC.charAt(0)!='S'&&this.estadoC.charAt(0)!='s'&&
			this.estadoC.charAt(0)!='C'&&this.estadoC.charAt(0)!='c'&&
			this.estadoC.charAt(0)!='D'&&this.estadoC.charAt(0)!='d'&&
			this.estadoC.charAt(0)!='V'&&this.estadoC.charAt(0)!='v'){
			System.out.println("El estado civil no es 'S','C','V' o 'D'.");
			correcto=false;
		}
		
		return correcto;
	}
	
	public Empleado menu(){
		Empleado emp;
		Scanner teclado = new Scanner(System.in);
		int id, titulo, añosEmpresa;
		String nombre, estadoC, turno;
		boolean correcto=true;
		
		do{
		System.out.print("Id");
		id=teclado.nextInt();
		System.out.print("Nombre");
		teclado.nextLine();
		nombre=teclado.nextLine();
		System.out.print("Titulacion");
		titulo=teclado.nextInt();
		System.out.print("Años");
		añosEmpresa=teclado.nextInt();
		System.out.print("Estado");
		estadoC=teclado.next();	
		System.out.print("Turno");
		turno=teclado.next();
		
		emp=new Empleado(id,titulo,añosEmpresa,nombre,estadoC,turno);
		correcto=emp.comprobar();
		}while(!correcto);
		
		
		return emp;
		
	}
	
	public void mostrar(){
		
		System.out.println("ID: "+this.id);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Titulacion: "+this.titulo);
		System.out.println("Estado civil: "+this.estadoC);
		System.out.println("Años en la empresa: "+this.añosEmpresa);
		System.out.println("Turno: "+this.turno);
		
	}
	
}

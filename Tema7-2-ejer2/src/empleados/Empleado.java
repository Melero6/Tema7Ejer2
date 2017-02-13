package empleados;

import java.util.Scanner;

public class Empleado {
	
	private int id, titulo, a�osEmpresa;
	private String nombre;
	private String estadoC;
	private String turno;
	static private int salario = 425;
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}

	public void setA�osEmpresa(int a�osEmpresa) {
		this.a�osEmpresa = a�osEmpresa;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEstadoC(String estadoC) {
		this.estadoC = estadoC;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getId() {
		return id;
	}

	public int getTitulo() {
		return titulo;
	}

	public int getA�osEmpresa() {
		return a�osEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEstadoC() {
		return estadoC;
	}

	public String getTurno() {
		return turno;
	}
	
	//Constructos del empleado con valores
	public Empleado(int id, int titulo, int a�osEmpresa, String nombre, String estadoC, String turno) {

		this.id = id;
		this.titulo = titulo;
		this.a�osEmpresa = a�osEmpresa;
		this.nombre = nombre;
		this.estadoC = estadoC;
		this.turno = turno;
	}
	
	public Empleado() { //Constructor de empleado por defecto

		this.id = 101;
		this.titulo = -1;
		this.a�osEmpresa = -1;
		this.nombre = "";
		this.estadoC = "";
		this.turno = "";
	}
	
	public boolean comprobar(){//comprueba que los valores introducidos para el empleado no esten fuera de los predeterminados.
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
		if (this.a�osEmpresa<0){
			System.out.println("Los a�os en la empresa no pueden ser negativos.");
			correcto=false;
		}
		
		return correcto;
	}
	
	public Empleado menuA�adir(){//si el objeto empleado tiene los valores correctos, entonces continua.
		Empleado emp;
		Scanner teclado = new Scanner(System.in);
		int id, titulo, a�osEmpresa;
		String nombre, estadoC, turno;
		boolean correcto;
		
		do{
		
		System.out.print("Id");
		id=teclado.nextInt();
		System.out.print("Nombre");
		teclado.nextLine();
		nombre=teclado.nextLine();
		System.out.print("Titulacion");
		titulo=teclado.nextInt();
		System.out.print("A�os");
		a�osEmpresa=teclado.nextInt();
		System.out.print("Estado");
		estadoC=teclado.next();	
		System.out.print("Turno");
		turno=teclado.next();
		
		emp=new Empleado(id,titulo,a�osEmpresa,nombre,estadoC,turno);
		correcto=emp.comprobar();
		}while(!correcto);
		
		return emp;
		
	}
	
	public void mostrar(){//Muestra un empleado.
		
		System.out.println("ID: "+this.id);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Titulacion: "+this.titulo);
		System.out.println("Estado civil: "+this.estadoC);
		System.out.println("A�os en la empresa: "+this.a�osEmpresa);
		System.out.println("Turno: "+this.turno);
		
	}
	public void modificarDato(){
		
		
	}
	
	
	
}

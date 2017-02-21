package empleados;

import java.util.Scanner;

public class Empleado {

	private int id, titulo, añosEmpresa, salario;
	private String nombre;
	private String estadoC;
	private String turno;
	static private int salariobase = 425;


	public static int getSalariobase() {
		return salariobase;
	}

	public static void setSalariobase(int salariobase) {
		Empleado.salariobase = salariobase;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}

	public void setAñosEmpresa(int añosEmpresa) {
		this.añosEmpresa = añosEmpresa;
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

	public int getAñosEmpresa() {
		return añosEmpresa;
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
	public Empleado(int id, int titulo, int añosEmpresa, String nombre, String estadoC, String turno) {

		this.id = id;
		this.titulo = titulo;
		this.añosEmpresa = añosEmpresa;
		this.nombre = nombre;
		this.estadoC = estadoC;
		this.turno = turno;

	}


	public Empleado() { //Constructor de empleado por defecto

		this.id = 101;
		this.titulo = -1;
		this.añosEmpresa = -1;
		this.nombre = "";
		this.estadoC = "";
		this.turno = "";
	}


	public boolean comprobarEstado(String estadoC){//comprueba que los valores introducidos para el empleado no esten fuera de los predeterminados.
		boolean correcto=true;

		if (estadoC.charAt(0)!='S'&&estadoC.charAt(0)!='s'&&
				estadoC.charAt(0)!='C'&&estadoC.charAt(0)!='c'&&
				estadoC.charAt(0)!='D'&&estadoC.charAt(0)!='d'&&
				estadoC.charAt(0)!='V'&&estadoC.charAt(0)!='v'){
			System.out.println("El estado civil no es 'S','C','V' o 'D'.");
			correcto=false;
		}


		return correcto;
	}


	public boolean comprobarId(int id){//comprueba que los valores introducidos para el empleado no esten fuera de los predeterminados.
		boolean correcto=true;

		if (id<0||id>99){
			System.out.println("El id no esta entre 1 y 100.");
			correcto=false;
		}

		return correcto;
	}


	public boolean comprobarTitulo(int titulo){//comprueba que los valores introducidos para el empleado no esten fuera de los predeterminados.
		boolean correcto=true;

		if (titulo<0||titulo>4){
			System.out.println("La titualcion no esta entre 0 y 4.");
			correcto=false;
		}

		return correcto;
	}


	public boolean comprobarTurno(String turno){//comprueba que los valores introducidos para el empleado no esten fuera de los predeterminados.
		boolean correcto=true;

		if ((turno.charAt(0)!='N'&&turno.charAt(0)!='n')&&
				(turno.charAt(0)!='D'&&turno.charAt(0)!='d')){
			System.out.println("El turno no es 'D' o 'N'.");
			correcto=false;
		}

		return correcto;
	}


	public boolean comprobarAñosEmpresa(int añosEmpresa){//comprueba que los valores introducidos para el empleado no esten fuera de los predeterminados.
		boolean correcto=true;

		if (añosEmpresa<0){
			System.out.println("Los años en la empresa no pueden ser negativos.");
			correcto=false;
		}

		return correcto;
	}


	public Empleado menuAñadir(){//si el objeto empleado tiene los valores correctos, entonces continua.
		Empleado emp;
		Scanner teclado = new Scanner(System.in);
		int id, titulo, añosEmpresa;
		String nombre, estadoC, turno;
		boolean correcto=true;
		
		System.out.println("Escriba los datos del nuevo empleado:");
		do{
			System.out.print("Id: ");
			id=teclado.nextInt();
			correcto=comprobarId(id);
		}while(!correcto);

		System.out.print("Nombre: ");
		teclado.nextLine();
		nombre=teclado.nextLine();

		do{
			System.out.print("Titulacion: ");
			titulo=teclado.nextInt();
			correcto=comprobarTitulo(titulo);
		}while(!correcto);

		do{
			System.out.print("Años: ");
			añosEmpresa=teclado.nextInt();
			correcto=comprobarAñosEmpresa(añosEmpresa);
		}while(!correcto);	

		do{
			System.out.print("Estado: ");
			estadoC=teclado.next();	
			correcto=comprobarEstado(estadoC);
		}while(!correcto);	

		do{
			System.out.print("Turno: ");
			turno=teclado.next();
			correcto=comprobarTurno(turno);
		}while(!correcto);


		emp=new Empleado((id-1),titulo,añosEmpresa,nombre,estadoC,turno);
		emp.sumaSalario();
		return emp;
	}


	public void sumaSalario(){//calcula el salario de los empleados en funcion de sus datos
		int salario=0;

		salario+=75*this.añosEmpresa;

		switch (this.titulo){
		case 0:
			salario+=250;
			break;
		case 1:
			salario+=500;
			break;
		case 2:
			salario+=1000;
			break;
		case 3:
			salario+=1250;
			break;
		case 4:
			salario+=1500;
			break;
		}

		if (this.turno.charAt(0)=='N'||this.turno.charAt(0)=='n')
			salario+=100;

		if (this.estadoC.charAt(0)=='C'||this.estadoC.charAt(0)=='c')
			salario=salario-(int)((float)salario*0.10);
		else
			salario=salario-(int)((float)salario*0.12);

		setSalario(salario);

	}


	public void mostrar(){//Muestra un empleado.

		System.out.println("------------------------------------");
		System.out.println("ID: "+(this.id+1));
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Titulacion: "+this.titulo);
		System.out.println("Estado civil: "+this.estadoC);
		System.out.println("Años en la empresa: "+this.añosEmpresa);
		System.out.println("Turno: "+this.turno);
		System.out.println("Salario: "+this.salario);
		System.out.println("------------------------------------");
		System.out.println();

	}
}

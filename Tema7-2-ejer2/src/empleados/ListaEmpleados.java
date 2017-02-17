package empleados;

import java.util.Scanner;

public class ListaEmpleados {

	private Empleado[] lista;


	public ListaEmpleados(){//Crea la lista de empleados con los valores del empleado por defecto
		Empleado defecto=new Empleado();
		lista=new Empleado[100];
		for (int i=0;i<100;i++)
			lista[i]=defecto;

	}

	public void setEmpleado(Empleado nuevo){
		this.lista[nuevo.getId()]=nuevo;

	}

	public boolean repetido(Empleado nuevo){
		boolean existe=false;

		for(int i=0;i<100;i++)
			if (this.lista[i].getId()==nuevo.getId())
				existe=true;

		return existe;
	}
	public ListaEmpleados(int numeroEmpleadosAleatorios){
		int id, titulo, añosEmpresa;
		String nombre, estadoC, turno;

		lista=new Empleado[100];
		for (int i=0;i<numeroEmpleadosAleatorios;i++){
			
			
			
			
			
			
			
			Empleado defecto=new Empleado(id, titulo, añosEmpresa, nombre, estadoC, turno);
			defecto.sumaSalario();
			lista[i]=defecto;
		}
		
		
		
		
		
		
	}
	

	public int buscar(int busca){//busca un id en la lista de empleados
		int indice=-1;

		for(int i=0;i<100;i++)
			if (this.lista[i].getId()==busca)
				indice=i;

		return indice;
	}

	public int consultaSalario(int busca){//busca un id en la lista de empleados
		int salario=0;

		for(int i=0;i<100;i++)
			if (this.lista[i].getId()==busca)
				salario=this.lista[i].getSalario();

		return salario;
	}

	public void borrar(int id){
		Empleado defecto=new Empleado();
		lista[id]=defecto;
	}

	public boolean comprobarDuplicados(int id){//comprueba si existe el id que vamos a introducir
		boolean duplicado=false;

		for(int i=0;i<100;i++)
			if (this.lista[i].getId()==id)
				duplicado=true;

		return duplicado;
	}

	public int sumaSalarios(){//suma total de todos los salarios
		int sumaSalarios=0;

		for (int i=0;i<100;i++)
			sumaSalarios+=lista[i].getSalario();

		return sumaSalarios;

	}

	public void actualizacionSalarios(){

		for(int i=0;i<100;i++)
			if (this.lista[i].getId()!=101)
				this.lista[i].sumaSalario();
	}

	public void mostrar(){
		for (int i=0;i<100;i++)
			if (this.lista[i].getId()!=101)
				this.lista[i].mostrar();
	}

	public void mostrar(int id){
		boolean Existe=false;
		for (int i=0;i<100;i++)
			if (this.lista[i].getId()==(id-1)){
				this.lista[i].mostrar();
				Existe=true;
			}
		if (!Existe)
			System.out.println("*Error: no existe un empleado con ese identificador*");

	}

	public void modificar(int busca){

		Empleado emp;

		Scanner teclado = new Scanner(System.in);
		int id, titulo, añosEmpresa, seleccion;
		String nombre, estadoC, turno;
		boolean correcto=true, existe=true, bucleSeleccion;

		for(int i=0;i<100;i++){
			if (this.lista[i].getId()==busca);{
				existe=false;
				emp=this.lista[i];

				do{
					bucleSeleccion=true;
					System.out.println("Escribe el numero del campo que quieres modificar:\n1-ID.\n2-Nombre.\n3-Titulacion.\n4-Años en la empresa.\n5-Estado civil.\n6-Turno de trabajo.");
					seleccion=teclado.nextInt();
					switch (seleccion){
					case 1:
						do{
							System.out.print("Id: ");
							id=teclado.nextInt();
							emp.setId(id);
							correcto=emp.comprobarId(id);
						}while(!correcto);
						break;

					case 2:
						System.out.print("Nombre: ");
						teclado.nextLine();
						nombre=teclado.nextLine();
						emp.setNombre(nombre);
						break;

					case 3:
						do{
							System.out.print("Titulacion: ");
							titulo=teclado.nextInt();
							emp.setTitulo(titulo);
							correcto=emp.comprobarTitulo(titulo);
						}while(!correcto);
						break;

					case 4:
						do{
							System.out.print("Años en la empresa: ");
							añosEmpresa=teclado.nextInt();
							emp.setAñosEmpresa(añosEmpresa);
							correcto=emp.comprobarAñosEmpresa(añosEmpresa);
						}while(!correcto);	
						break;

					case 5:
						do{
							System.out.print("Estado: ");
							estadoC=teclado.next();	
							emp.setEstadoC(estadoC);
							correcto=emp.comprobarEstado(estadoC);
						}while(!correcto);	
						break;

					case 6:
						do{
							System.out.print("Turno: ");
							turno=teclado.next();
							emp.setTurno(turno);
							correcto=emp.comprobarTurno(turno);
						}while(!correcto);

					default:
						bucleSeleccion=false;
						System.out.println("*ERROR: Seleccione una opcion del 1 al 6.*");

					}
				}while(!bucleSeleccion);

				this.lista[i]=emp;
			}
		}

		if(!existe)
			System.out.println("*ERROR: No se ha encontrado un empleado con el ID: "+busca+"*");


	}

}

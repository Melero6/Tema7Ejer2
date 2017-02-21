package empleados;

import java.util.Scanner;

import java.util.Arrays;

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

	public boolean repetido(Empleado nuevo){//comprueba si existe un empleado
		boolean existe=false;

		for(int i=0;i<100;i++)
			if (this.lista[i].getId()==nuevo.getId())
				existe=true;

		return existe;
	}
	public ListaEmpleados(int numeroEmpleadosAleatorios){//Crea una cantidad de empleados con datos aleatorios, dentro de los limites.
		int id, titulo, añosEmpresa, random;
		String nombre="", estadoC="", turno="", caracteres="scvdn";
		String[] palabras=new String[5];
		palabras[0]="Marta";
		palabras[1]="Javier";
		palabras[2]="Sandra";
		palabras[3]="David";
		palabras[4]="Juan";


		//(int)(Math.random()*(hasta-desde+1)+desde)
		Empleado defecto1=new Empleado();
		lista=new Empleado[100];
		for (int i=0;i<100;i++)
			lista[i]=defecto1;

		for (int i=0;i<numeroEmpleadosAleatorios;i++){

			id=i;

			random=(int)(Math.random()*(4-0+1)+0);
			nombre=palabras[random];

			random=(int)(Math.random()*(3-0+1)+0);
			estadoC+=caracteres.charAt(random);

			random=(int)(Math.random()*(4-3+1)+3);
			turno+=caracteres.charAt(random);

			random=(int)(Math.random()*(4-0+1)+0);
			titulo=random;

			random=(int)(Math.random()*(20-0+1)+0);
			añosEmpresa=random;


			Empleado defecto=new Empleado(id, titulo, añosEmpresa, nombre, estadoC, turno);
			defecto.sumaSalario();
			lista[i]=defecto;
			estadoC="";
			turno="";
		}

	}



	public int consultaSalario(int busca){//busca un id en la lista de empleados
		int salario=0;

		for(int i=0;i<100;i++)
			if (this.lista[i].getId()==(busca-1))
				salario=this.lista[i].getSalario();

		return salario;
	}

	public boolean borrar(int id){//Borra un empleado

		boolean estado=false;

		for(int i=0;i<100;i++)
			if (this.lista[i].getId()==(id-1)){
				this.lista[i].setId(101);//el id 101 esta fuera del indice
				this.lista[i].setSalario(0);//quita el salario para que no se sume en la total
				estado=true;
			}

		return estado;

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

	public void actualizacionSalarios(){//actualiza los salarios de todos los empleados

		for(int i=0;i<100;i++)
			if (this.lista[i].getId()!=101)
				this.lista[i].sumaSalario();
	}

	public void mostrar(){//Muestra todos los empleados
		for (int i=0;i<100;i++)
			if (this.lista[i].getId()!=101)
				this.lista[i].mostrar();
	}

	public boolean mostrar(int id){//muestra un empleado en concreto
		boolean existe=false;
		for (int i=0;i<100;i++)
			if (this.lista[i].getId()==(id-1)){
				this.lista[i].mostrar();
				existe=true;
			}

		return existe;
	}

	public boolean modificar(int busca){//Permite modificar los datos de un empleado

		Empleado emp=new Empleado();
		Empleado defecto=new Empleado();
		Scanner teclado = new Scanner(System.in);
		int titulo, añosEmpresa, seleccion;
		String nombre, estadoC, turno;
		boolean correcto=true, existe=false, bucleSeleccion;

		for(int i=0;i<100;i++){
			if (this.lista[i].getId()==(busca-1)){
				existe=true;
				emp=this.lista[i];
				System.out.println("Este es el empleado:");
				emp.mostrar();
				do{
					bucleSeleccion=true;
					System.out.println("- Escribe el numero del campo que quieres modificar:\n1-Turno de trabajo.\n2-Nombre.\n3-Titulacion.\n4-Años en la empresa.\n5-Estado civil.");
					seleccion=teclado.nextInt();
					switch (seleccion){
					case 1:
						do{
							System.out.print("Turno: ");
							turno=teclado.next();
							emp.setTurno(turno);
							correcto=emp.comprobarTurno(turno);
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


					default:
						bucleSeleccion=false;
						System.out.println("*ERROR: Seleccione una opcion del 1 al 6.*");

					}
				}while(!bucleSeleccion);
				
				emp.sumaSalario();
				this.setEmpleado(emp);
			}
		}
		return existe;


	}

}

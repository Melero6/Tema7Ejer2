package empleados;
import java.util.Scanner;





public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		boolean bucle=true, existe, llave;
		int seleccion, id, salario, salarioBase;

		ListaEmpleados listado=new ListaEmpleados();

		Empleado trabajador= new Empleado();



		do{
			//Menu de seleccion
			System.out.println("-*Elige el numero de opearacion que quiere realizar*-\n1-Añadir empleado.\n2-Mostrar un empleado.\n3-Mostrar todos los empleados.\n4-Eliminar un empleado.\n5-Consultar salario de un empleado.\n6-Consultar la suma de las nominas.n\7-Modificar un dato de un empleado.\n8-Modificar el salario base.\n9-Salir del programa.");
			seleccion=teclado.nextInt();
			switch(seleccion){
			case 1:
				do{
					trabajador=trabajador.menuAñadir();
					existe=listado.repetido(trabajador);
					if(existe)
						System.out.println("*ERROR: Existe un trabajador con el id "+trabajador.getId()+" escriba otro id.*");
				}while(existe);
				
				listado.setEmpleado(trabajador);
				break;

			case 2:

				System.out.print("Escribe el id del empleado que quiere buscar:");
				do{
					id=teclado.nextInt();
					if(!(id<=100&&id>=1))
						System.out.println("Escriba un Valor entre 1 y 100");
				}while(!(id<=100&&id>=1));
				
				listado.mostrar(id);
				break;

			case 3:
				listado.mostrar();
				break;

			case 4:
				System.out.print("Escribe el id del empleado que quiere eliminar:");
				do{
					id=teclado.nextInt();
					if(!(id<=100&&id>=1))
						System.out.println("Escriba un Valor entre 1 y 100");
				}while(!(id<=100&&id>=1));
				
				listado.borrar(id);
				System.out.println("Se ha borrado el empleado con el id: "+id);
				break;

			case 5:
				System.out.print("Escribe el id del empleado al que quiere consultar el salario:");
				do{
					id=teclado.nextInt();
					if(!(id<=100&&id>=1))
						System.out.println("Escriba un valor entre 1 y 100");
				}while(!(id<=100&&id>=1));
				
				salario=listado.consultaSalario(id);
				if(salario==0)
					System.out.println("*ERROR: No existe un empleado con ese id*");
				else
					System.out.println("El salario del empleado "+id+" es:"+salario);
				break;

			case 6:
				System.out.println("La suma total de los salarios de los empleados es: "+listado.sumaSalarios());
				break;

			case 7:
				System.out.print("Escribe el id del empleado del que quieres modicar datos:");
				do{
					id=teclado.nextInt();
					if(!(id<=100&&id>=1))
						System.out.println("Escriba un Valor entre 1 y 100");
				}while(!(id<=100&&id>=1));
				
				listado.modificar(id);
				break;

			case 8:
				do{
					System.out.print("Escriba el nuevo valor para el salario base, actualmente es: "+Empleado.getSalariobase());
					salarioBase=teclado.nextInt();
					if(salarioBase<0)
						System.out.println("*ERROR: El salario base no puede ser negativo.*");
				}while(salarioBase<0);
				
				Empleado.setSalariobase(salarioBase);
				listado.actualizacionSalarios();
				System.out.println("El salario se ha actualizado al valor: "+Empleado.getSalariobase());
				break;

			case 9:
				bucle=false;
				break;

			default:
				System.out.println("*ERROR: Selecciona una opcion del 1 al 7*");

			}

			System.out.println();
		}while(bucle);

		System.out.println("*- FIN DE PROGRAMA -*");
	}

}

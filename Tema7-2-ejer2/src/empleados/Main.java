package empleados;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		boolean bucle=true;
		int seleccion;
		
		ListaEmpleados listado=new ListaEmpleados();
		
		Empleado trabajador= new Empleado();
		
	
		
		do{
		
		System.out.println("*Elige el numero de opearacion que quiere realizar*\n1-Añadir empleado.\n2-Mostrar empleado.\n3-Mostrar todos los empleados.\n4-Eliminar un empleado.\n5-Consultar salario de un empleado.\n6-Consultar la suma de las nominas.\n7-Salir del programa.");
		seleccion=teclado.nextInt();
		switch(seleccion){
		case 1:
			trabajador=trabajador.menuAñadir();
		break;
		case 2:
			trabajador.mostrar();
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		default:
			System.out.println("ERROR: Selecciona una opcion del 1 al 7");
		
		}
		
		
		}while(bucle);
		
		}

}

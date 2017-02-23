package banco;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int seleccion, numero;
		boolean salir=false;

		Cuentas listado=new Cuentas();
		
		do{
			System.out.print("Escriba el numero de cuentas que desea crear:");
			numero=teclado.nextInt();

			if(numero<0||numero>100)
				System.out.println("*ERROR: El numero tiene que ser positivo y menor que 100.");
		}while(numero<0||numero>100);

		listado.añadirCuentas(numero);
		
		
		do{
			System.out.println("*-Escriba el numero de la opcion que desea seleccionar-*\n1-Ver la cuenta con el mayor saldo.\n2-Retirar dinero.\n3-Ingresar dinero.\n4-Mostrar todas las cuentas.\n5-Salir del programa.");
			seleccion=teclado.nextInt();
			switch(seleccion){
			case 1:
				listado.mostrarMayor();
				break;
			case 2:
				
				break;
			case 3:

				break;
			case 4:
				listado.mostrar();
				break;
				
			case 5:
				salir=true;
				break;
			default:
				System.out.println("*ERROR: Escriba un numero de 1 al 5*");
			}
		}while(!salir);
	System.out.println("-FIN DE PROGRAMA-");
	}
	


}

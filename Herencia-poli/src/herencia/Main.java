package herencia;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int seleccion;
		
		Personas cambio;
		Personas[] vector;
		vector=new Personas[3];

		for (int i=0;i<3;i++){
			System.out.println("1-Persona\n2-Empleado\n3-Jefe");
			seleccion=teclado.nextInt();

			switch(seleccion){
			case 1:
				cambio=new Personas();
				cambio=cambio.añadir(seleccion);
				vector[i]=cambio;
				break;
			case 2:
				cambio=new Empleado();
				cambio=cambio.añadir(seleccion);
				vector[i]=cambio;
				break;
			case 3:
				cambio=new Jefe();
				cambio=cambio.añadir(seleccion);
				vector[i]=cambio;
				
				break;
			default:
			}
		}
		
		
		for (int j=0;j<3;j++)
		   vector[j].mostrar();
	}

}

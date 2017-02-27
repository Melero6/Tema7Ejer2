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
		vector=new Personas[10];

		for (int i=0;i<10;i++){
			System.out.println("1-Persona\n2-Empleado\n3-Jefe\n4-Becario");
			seleccion=teclado.nextInt();

			switch(seleccion){
			case 1:
				cambio=new Personas();
				vector[i]=cambio;
				break;
			case 2:
				cambio=new Empleado();
				vector[i]=cambio;
				break;
			case 3:
				cambio=new Jefe();
				vector[i]=cambio;
				break;
			case 4:
				cambio=new Becario();
				vector[i]=cambio;
			default:
			}
		}
		
		
		for (int j=0;j<10;j++)
		   vector[j].mostrar();
	}

}

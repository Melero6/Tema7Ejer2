package empleados;

import java.util.Scanner;

public class ListaEmpleados {

	private Empleado[] lista;
	
	public void setnEmpleados(int nEmpleados){

	}
	
	public ListaEmpleados(){
		Empleado defecto=new Empleado();
		lista=new Empleado[100];
		for (int i=0;i<100;i++)
			lista[i]=defecto;

	}
	
	public int buscar(int busca){
		int indice=-1;
		
		for(int i=0;i<100;i++)
			if (this.lista[i].getId()==busca)
				indice=i;
		
		return indice;
	}
	
	public boolean comprobarDuplicados(int id){
		boolean duplicado=false;
		
		for(int i=0;i<100;i++)
			if (this.lista[i].getId()==id)
				duplicado=true;
		
		return duplicado;
	}
	
	public void mostrar(int id){
		
		
		
	}
	
}

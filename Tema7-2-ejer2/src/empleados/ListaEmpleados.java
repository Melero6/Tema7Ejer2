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


		for(int i=0;i<100;i++)
			if (this.lista[i].getId()==busca)
	


		
	}

}

package Comedor;

import java.util.Arrays;
import java.util.Scanner;

public class Comedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Plato plato1,plato2;
		boolean salir=false;
		int seleccion, nMenus;
		float precioTotal=0,dinero,vueltas;
		String bebida, postre;
		Menu tempMenu;
		ListaMenus lista=new ListaMenus();
		Cliente cliente;
		int[] tempMenusCliente;
		ListaMesa listaMesa=new ListaMesa();


		Carta cartaRestaurante=new Carta();


		do{
			System.out.println("-SELECCIONA UN OPCION-\n1-Ver carta.\n2-Atender cliente.\n3-Cobrar a un cliente.");
			seleccion=teclado.nextInt();

			switch(seleccion){
			case 1:
				System.out.println("-CARTA-");
				cartaRestaurante.mostrarCarta();
				break;
			case 2:
				System.out.print("¿Cuantos menus quieres?: ");
				nMenus=teclado.nextInt();
				System.out.println("-CARTA-");
				cartaRestaurante.mostrarCarta();

				System.out.println();
				System.out.println("Numero de mesa Nº"+ListaMesa.getnClientes());
				System.out.println();
				cliente=new Cliente(nMenus);
				tempMenusCliente=new int[nMenus];

				for (int i=0;i<nMenus;i++){
					System.out.println("-"+(i+1)+"º MENU-");
					System.out.print("¿Que plato quiere de primero?: ");
					seleccion=teclado.nextInt();
					plato1=cartaRestaurante.getListaPlatos(seleccion);
					System.out.print("¿Que plato quiere de segundo?: ");
					seleccion=teclado.nextInt();
					plato2=cartaRestaurante.getListaPlatos(seleccion);
					System.out.print("¿Que quiere para beber?: ");
					bebida=teclado.next();
					System.out.print("¿Que quiere de postre?: ");
					postre=teclado.next();


					tempMenu=new Menu(plato1,plato2,bebida,postre);

					lista.añadir(tempMenu);
					tempMenusCliente[i]=(ListaMenus.getnMenus())-1;
				}	
				cliente.anadir(tempMenusCliente);
				listaMesa.añadir(cliente);


				break;
			case 3:
				System.out.print("¿Que numero de mesa deseas cobrar?: ");
				seleccion=teclado.nextInt();
				cliente=listaMesa.getListaClientes(seleccion);
				tempMenusCliente=new int[cliente.getMenusCliente().length];
				precioTotal=0;
				tempMenusCliente=Arrays.copyOf(cliente.getMenusCliente(),cliente.getMenusCliente().length);

				System.out.println("-LISTA DE MENUS-");
				for (int i=0;i<tempMenusCliente.length;i++){
					System.out.println("-"+(i+1)+"º MENU-");
					System.out.println();
					for (int j=0;j<2;j++){
						System.out.printf("PRECIO "+(j+1)+"º PLATO= %2.2f€\n",((lista.getListasMenus(tempMenusCliente[i])).getPlatosMenu(j)).getPrecio());
						precioTotal+=((lista.getListasMenus(tempMenusCliente[i])).getPlatosMenu(j)).getPrecio();
					}
					System.out.println("Bebida= "+(lista.getListasMenus(tempMenusCliente[i])).getBebida());
					System.out.println("Postre= "+(lista.getListasMenus(tempMenusCliente[i])).getPostre());
					System.out.println("--------------------------------------");
				}

				System.out.printf("Precio total= %3.2f€\n",precioTotal);
				do{
					System.out.print("¿Cuanto dinero te da el cliente?: ");
					dinero=teclado.nextFloat();
					if (precioTotal>dinero)
						System.out.println("ERRRO: El cliente ha entregado menos dinero del que necesita, vuelva a introducir el dinero.");
				}while(precioTotal>dinero);

				vueltas=dinero-precioTotal;
				System.out.println("--------------------------------------");
				System.out.println("-FACTURA-\n");

				System.out.printf("Precio total=       %3.2f€\n",precioTotal);
				System.out.printf("Dinero del cliente= %3.2f€\n",dinero);
				System.out.printf("Dinero a devolver=  %3.2f€\n",vueltas);
				System.out.println();
				break;
			default:
				salir=true;

			}
		}while(!salir);



		
		
		
		
	
	}

}

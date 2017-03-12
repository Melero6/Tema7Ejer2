package Comedor;


public class ListaMesa {
	
	public static int getnClientes() {
		return nClientes;
	}

	private Cliente[] listaClientes;
	private static int nClientes=0;
	
	public ListaMesa(){
		
		listaClientes=new Cliente[100];
			
	}
	
	public Cliente getListaClientes(int nMesa) {
		return listaClientes[nMesa];
	}
	
	public void añadir(Cliente cliente){
		
		listaClientes[nClientes]=cliente;
		this.nClientes++;
		
	}

}

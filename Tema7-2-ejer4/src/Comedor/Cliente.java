package Comedor;

import java.util.Arrays;

public class Cliente {
	
	
	private int[] menusCliente;
	
	public Cliente(int nMenus){
		
		this.menusCliente=new int[nMenus];
		
	}
	
	public void  anadir(int[] menusClient){
		
		this.menusCliente=Arrays.copyOf(menusClient,menusClient.length);
		
	}

	public int[] getMenusCliente() {
		return menusCliente;
	}

}

package Comedor;

public class ListaMenus {

	private Menu[] listasMenus;
	private static int nMenus=0;
	
	public ListaMenus(){
		
		this.listasMenus=new Menu[100];
		
	}
	public ListaMenus(Menu[] listasMenus) {
		super();

	}
	public void añadir(Menu menu){

		if (this.nMenus==99)
			System.out.println("ERROR HOY HAS SERVIDO 100 MENUS");
		else
			this.listasMenus[nMenus]=menu;
		
		this.nMenus++;
		
	}
	
	public static int getnMenus() {
		return nMenus;
	}
	public Menu getListasMenus(int select) {
		return listasMenus[select];
	}
	
	
}

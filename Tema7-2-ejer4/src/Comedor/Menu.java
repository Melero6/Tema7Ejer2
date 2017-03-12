package Comedor;

public class Menu {
	
	private Plato[] platosMenu = new Plato[2];
	private String bebida;
	private String postre;
	
	public Menu(Plato plato1, Plato plato2, String bebida, String postre){
		
		this.bebida=bebida;
		this.postre=postre;
		this.platosMenu[0]=plato1;
		this.platosMenu[1]=plato2;
		
	}

	public Plato getPlatosMenu(int select) {
		return platosMenu[select];
	}

	public String getBebida() {
		return bebida;
	}

	public String getPostre() {
		return postre;
	}

}

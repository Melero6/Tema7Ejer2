package Comedor;

public class Carta {
	
	private Plato[] listaPlatos;
	
	public Carta(){
		
		listaPlatos=new Plato [6];
		
		String[] nomPlatos=new String[6];
		nomPlatos[0]="Pizza";
		nomPlatos[1]="Ensalada";
		nomPlatos[2]="Bocata";
		nomPlatos[3]="Sopa";
		nomPlatos[4]="Ternera";
		nomPlatos[5]="Judias Verdes";
		
		for(int i=0; i<6;i++){
			Plato aux=new Plato(nomPlatos[i]);
			listaPlatos[i]=aux;
		}
		
	}
	
	public void mostrarCarta(){
		
		String separador;
		
		for(int i=0; i<6;i++){
			separador=", ";
			System.out.println("-------------------------------------");
			System.out.println("Plato: "+listaPlatos[i].getNombre());
			System.out.print("Ingredientes: ");
			for (int j=0; j<6;j++){
			if(j==5)
				separador=".";
			System.out.print(listaPlatos[i].getIngredientes()[j]+separador);
			}
			System.out.println("\nPrecio: "+listaPlatos[i].getPrecio());
		}
		
	}
}

package Comedor;

public class Plato {

	private String nombre;
	private float precio;
	private String[] ingredientes= new String[6];

	public Plato(String nom){
		int random;
		boolean repe=false;
		int[] listRandom=new int[6];

		String[] nomIngredientes=new String[15];
		nomIngredientes[0]="Tomate";
		nomIngredientes[1]="Lechuga";
		nomIngredientes[2]="Pollo";
		nomIngredientes[3]="Queso";
		nomIngredientes[4]="Bacon";
		nomIngredientes[5]="Piña";
		nomIngredientes[6]="Pimimento";
		nomIngredientes[7]="Huevo";
		nomIngredientes[8]="Ternera";
		nomIngredientes[9]="Patata";
		nomIngredientes[10]="Zanahoria";
		nomIngredientes[11]="Guisantes";
		nomIngredientes[12]="Gambas";
		nomIngredientes[13]="Salmon";
		nomIngredientes[14]="Arroz";


		this.nombre=nom;
		this.precio=(float)(Math.random()*(10-4+1)+4);

		for (int i=0;i<6;i++){
			do{
				random=(int)(Math.random()*(14-0+1)+0);
				repe=false;
				for (int j=0;j<i;j++){
					if (random==listRandom[j])
						repe=true;
				}

			}while(repe);
			listRandom[i]=random;
			repe=false;
			this.ingredientes[i]=nomIngredientes[random];

		}

	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

}

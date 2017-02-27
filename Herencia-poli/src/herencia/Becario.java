package herencia;

public class Becario extends Personas {

	
	private int numBecario;
	private String fechaComienzo, fechaFinal ;
	private float beca;
	
	public Becario() {
		super();
		String fechaComienzo="01-01-10", fechaFinal="01-01-16";
		int numBecario=(int)(Math.random()*(100000-0+1)+0);
		float beca=(float)(Math.random()*(2000-500+1)+500);
		
		
		this.numBecario = numBecario;
		this.fechaComienzo = fechaComienzo;
		this.fechaFinal = fechaFinal;
		this.beca = beca;
	}
	public void imprimeRecibo(){
		System.out.printf("Beca:                      %7.2f €\n",calculo());
		System.out.println();
		
	}
	
	public float calculo(){
		
		return beca;
	}
	
	public void mostrar(){
		System.out.println("BECARIO");
		super.mostrar();
//		imprimeRecibo();
		
	}
}



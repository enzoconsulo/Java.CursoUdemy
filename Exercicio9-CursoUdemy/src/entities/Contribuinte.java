package entities;

public abstract class  Contribuinte {

	protected String name;
	protected Double rendaAnual;
	
	public Contribuinte() {
	}

	public Contribuinte(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double calcularImposto();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(": $ ");
		sb.append(String.format("%.2f", calcularImposto()));
		
		return sb.toString();
	} 
	
}

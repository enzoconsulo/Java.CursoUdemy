package entities;

public class PessoaJuridica extends Contribuinte{
	
	private int numeroFuncionarios;
	
	public PessoaJuridica() {
	}
	

	public PessoaJuridica(String name, Double rendaAnual, int numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}


	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}


	@Override
	public double calcularImposto() {
		
		double imposto = 0;
		
		if(numeroFuncionarios > 10) {
			imposto = rendaAnual * 0.14;
		}else {
			imposto = rendaAnual * 0.16;
		}
		
		return imposto;
	}
	

}

package entities;

public class PessoaFisica extends Pessoa {

	private Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double renda) {
		super(nome, renda);
	}
	
	public PessoaFisica(String nome, Double renda, Double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}
	
	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		double valorImposto = 0.0;
		if (getRenda() < 20000.0) {
			valorImposto = getRenda() * 0.15;
		} else {
			valorImposto = getRenda() * 0.25;
		}
	}
}
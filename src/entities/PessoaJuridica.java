package entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda, Integer numFuncionarios) {
		super(nome, renda);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double imposto() {
		if (numFuncionarios <= 10) {
			return getRenda() * 0.14;
		} else {
			return getRenda() * 0.16;
		}
	}
}

package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String nome, Double renda, Integer numberOfEmployees) {
		super(nome, renda);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees <= 10) {
			return getIncome() * 0.16;
		} else {
			return getIncome() * 0.14;
		}
	}
}

package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditure;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double income) {
		super(name, income);
	}
	
	public Individual(String name, Double income, Double healthExpenditure) {
		super(name, income);
		this.healthExpenditure = healthExpenditure;
	}
	
	public Double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}

	@Override
	public double tax() {
		double taxValue = 0.0;
		if (getIncome() < 20000.0) {
			taxValue = getIncome() * 0.15;
		} else {
			taxValue = getIncome() * 0.25;
		}
		taxValue = taxValue - getHealthExpenditure() * 0.5;
		if (taxValue < 0.0) {
			taxValue = 0.0;
		}
		return taxValue;
	}
}
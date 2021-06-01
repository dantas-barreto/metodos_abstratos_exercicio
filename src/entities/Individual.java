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
			if (healthExpenditure != 0.0) {
				return taxValue = (getIncome() * 0.15) - (healthExpenditure * 0.5);
			} else {
				return taxValue = getIncome() * 0.15;
			}
		} else {
			if (healthExpenditure != 0.0) {
				return taxValue = (getIncome() * 0.25) - (healthExpenditure * 0.5);
			} else {
				return taxValue = getIncome() * 0.25;
			}
		}
	}
}
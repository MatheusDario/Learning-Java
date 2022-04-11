package about_abstrac_class_methods.ex_proposto.entities;

public class Indivual extends TaxPayer{

    private Double healthExpenditures;

    public Indivual(String name, Double anualIncome, Double healthExpenditured) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditured;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() < 20000.0) {
            return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
        }
		else {
            return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}

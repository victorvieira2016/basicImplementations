public class BasePlusCommissionEmployee extends  CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(double commissionRate,
                                      double grossSales,
                                      String socialSecurityNumber,
                                      String lastName,
                                      String firstName,
                                      double baseSalary) {
        super(commissionRate, grossSales, socialSecurityNumber, lastName, firstName);

        if (baseSalary < 0.0) throw new IllegalArgumentException("Base salary must be > 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried", super.toString(), "baseSalary", getBaseSalary());
    }
}

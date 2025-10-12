public abstract class CommissionEmployee {
    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;
    protected double grossSales;
    protected double commissionRate;

    public CommissionEmployee(double commissionRate, double grossSales, String socialSecurityNumber, String lastName, String firstName) {

        if (grossSales < 0.0) { throw new IllegalArgumentException("Gross sales must be positive"); }
        if (commissionRate <= 0.0 || commissionRate >= 1.0) { throw new IllegalArgumentException("Commission rate"); }

        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
        this.socialSecurityNumber = socialSecurityNumber;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) throw new IllegalArgumentException("Gross >= 0.0");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }

    public double earnings() {
        return  grossSales * commissionRate;
    }
}

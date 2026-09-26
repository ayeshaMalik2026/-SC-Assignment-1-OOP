public class SalesManager extends Employee {
    private double sales;
    private double commissionRate;

    public SalesManager(String name, double baseSalary, double sales, double commissionRate) {
        super(name, baseSalary);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    // Overrides base method to calculate total pay with commission
    @Override
    public double calculatePay() {
        return getBaseSalary() + (sales * commissionRate);
    }
}
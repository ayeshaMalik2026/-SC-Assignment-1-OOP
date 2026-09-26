public class Developer extends Employee {
    private double techAllowance;

    public Developer(String name, double baseSalary, double techAllowance) {
        super(name, baseSalary);
        this.techAllowance = techAllowance;
    }

    // Overrides base method to include allowance
    @Override
    public double calculatePay() {
        return getBaseSalary() + techAllowance;
    }
}
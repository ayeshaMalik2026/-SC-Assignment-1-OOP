import java.util.ArrayList;
import java.util.List;

public class Task2Test {
    public static void main(String[] args) {
        // Create a generic list of base type Employee
        List<Employee> employeeList = new ArrayList<>();

        // Add derived objects to the base list
        employeeList.add(new Developer("Alice", 70000.0, 5000.0));
        employeeList.add(new SalesManager("Bob", 50000.0, 100000.0, 0.10)); // 10% commission on 100k sales
        employeeList.add(new Developer("Charlie", 80000.0, 6000.0));

        System.out.println("--- Dynamic Payroll Calculation ---");
        // Loop through generic Employee list and invoke calculatePay()
        for (Employee emp : employeeList) {
            System.out.println(emp.getName() + " Final Pay: $" + emp.calculatePay());
        }
    }
}

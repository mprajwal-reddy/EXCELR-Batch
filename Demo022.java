import java.util.Scanner;

public class Demo022 {
    public static void main(String[] args) {
        // Input monthly gross salary, HRA, and PF
        try (Scanner scanner = new Scanner(System.in)) {
            // Input monthly gross salary, HRA, and PF
            System.out.print("Enter monthly gross salary: ");
            double monthlyGrossSalary = scanner.nextDouble();
            System.out.print("Enter monthly HRA: ");
            double hra = scanner.nextDouble();
            System.out.print("Enter monthly PF: ");
            double pf = scanner.nextDouble();
            
            // Calculate annual values
            double annualGrossSalary = monthlyGrossSalary * 12;
            double annualHRA = hra * 12;
            double annualPF = pf * 12;
            
            // Calculate deductions and taxable income
            double deductions = annualHRA + annualPF;
            double taxableIncome = annualGrossSalary - deductions;
            
            // Calculate tax based on slabs
            double tax = 0;
            if (taxableIncome <= 500000) {
                tax = taxableIncome * 0.10;
            } else if (taxableIncome <= 1000000) {
                tax = 500000 * 0.10 + (taxableIncome - 500000) * 0.20;
            } else {
                tax = 500000 * 0.10 + 500000 * 0.20 + (taxableIncome - 1000000) * 0.30;
            }
            
            // Display the annual income tax
            System.out.println("Annual Income Tax: Rs " + tax);
        }
    }
}
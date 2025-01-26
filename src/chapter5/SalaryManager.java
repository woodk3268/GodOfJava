package chapter5;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.getMonthlySalary(20000000);
        System.out.println("-----");
    }
    public void getMonthlySalary(double yearlySalary) {
        double monthlySalary = yearlySalary / 12.0;
        System.out.println("Monthly salary: " + monthlySalary);
        System.out.println("Tax: " + calculateTax(monthlySalary));
        System.out.println("National pension: " + calculateNationalPension(monthlySalary));
        System.out.println("Health insurance: " + calculateHealthInsurance(monthlySalary));
        double totalTax = calculateTax(monthlySalary)+calculateNationalPension(monthlySalary)+calculateHealthInsurance(monthlySalary);
        System.out.println("Total Tax: " + totalTax);
        monthlySalary -= totalTax;
        System.out.println("Real monthly salary: " + monthlySalary);
    }
    public double calculateTax(double monthlySalary) {
        double tax = monthlySalary * 0.125;
        System.out.println("Tax: " + tax);
        return tax;
    }
    public double calculateNationalPension(double monthlySalary) {
        double nationalPension = monthlySalary * 0.081;
        System.out.println("National pension: " + nationalPension);
        return nationalPension;
    }
    public double calculateHealthInsurance(double monthlySalary) {
        double healthInsurance = monthlySalary * 0.135;
        System.out.println("Health insurance: " + healthInsurance);
        return healthInsurance;
    }

}

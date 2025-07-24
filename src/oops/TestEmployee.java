package oops;


public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 75000.0, 2018, "NI1234567");

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        // Updating values
        emp.setAnnualSalary(80000.0);
        emp.setYearStarted(2017);
        emp.setName("Alice Smith");

        System.out.println("\nAfter updates:");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
    }
}

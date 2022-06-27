public class EmployeeImpl {
    public static void main(String[] args) {

        Employee emp = new Employee(110, "Daniel", 32, "12/12/1990", "124 Bridgewater Eville", 3000);
        System.out.println("The Employee details before hike");
        emp.displayEmployeeDetails();
        float payhikePercentage = 20f;
        double salary = emp.calculateSalaryHike(payhikePercentage);
        System.out.println("The Employee details after hike");
        emp.displayEmployeeDetails();
        System.out.println("The Employee Annual Salary is : $" + emp.calculateAnnualSalary());

    }
}

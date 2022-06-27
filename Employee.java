class Employee {
    int employeeCode;
    String employeeName;
    int age;
    String dob;
    String address;
    double salary;

    public Employee(int employeeCode, String employeeName, int age,
            String dob, String address, double salary) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println(" Name - " + employeeName + " Employee Code - " + employeeCode + " Salary -  $" + salary);
        System.out.println(" Date of birth " + dob + " Age -  " + age + " Address - " + address);
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }

    double calculateSalaryHike(float payHikePercentage) {
        this.salary = salary + (salary * payHikePercentage / 100);
        return salary;
    }
}
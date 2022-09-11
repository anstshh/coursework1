public class Employee {

    private String name;
    private int department;
    private double salary;
    private String employeeID;
    private static String uniqueID = "0";

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        employeeID = Employee.getNextUniqueID();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment() {
        this.department = department;
    }

    public double getSalary() {
        this.salary = salary;
        return salary;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    public void raiseSalary(double percentage) {
        double raise = salary * percentage / 100;
        salary += raise;
    }

    public static String getNextUniqueID() {
        int id = Integer.parseInt(uniqueID);
        ++id;
        uniqueID = Integer.toString(id);
        return uniqueID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", employeeID='" + employeeID + '\'' +
                '}';
    }
}
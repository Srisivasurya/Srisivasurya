package Testans;

public class Employee {
    private String employeeName;
    private String employeeDesignation;
    private Double employeeBaseSalary;

    public Employee(String name, String designation, Double baseSalary) {
        employeeName = name;
        employeeDesignation = designation;
        employeeBaseSalary = baseSalary;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public void setEmployeeBaseSalary(Double employeeBaseSalary) {
        this.employeeBaseSalary = employeeBaseSalary;
    }

    public Double getEmployeeBaseSalary(){
        return employeeBaseSalary;
    }
    public String toString() {

        return "" + this.employeeName + "" + this.employeeDesignation + "" + this.employeeBaseSalary + "";
    }
}

package Testans;

import java.util.ArrayList;
import java.util.Collections;
public class Salary {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Ragu", "Junior developer", 14000.00));
        list.add(new Employee("Manish", "Manager", 17000.00));
        list.add(new Employee("Raghul", "HR", 2000.00));
        list.add(new Employee("Vishnu", "Senior Developer", 16000.00));
        Employee details = Collections.max(list, new HighestSalary());
        System.out.println(" "+ details.getEmployeeName() +" "+ details.getEmployeeDesignation() +" "+ details.getEmployeeBaseSalary());
    }
}


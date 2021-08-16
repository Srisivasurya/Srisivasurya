package Testans;

import java.util.Comparator;

public class HighestSalary implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2) {
        return e1.getEmployeeBaseSalary().compareTo(e2.getEmployeeBaseSalary());
    }
}
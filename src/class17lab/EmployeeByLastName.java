package class17lab;

import java.util.Comparator;

public class EmployeeByLastName implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getLastName().compareTo(e2.getLastName());
    }
}

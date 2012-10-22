package class17lab;

import java.util.*;

public class Lab5 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Doe", "John", "333-33-3333");
        Employee e2 = new Employee("Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee("Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee("Lombardo", "James", "444-44-4444");

        //using comparable
        List<Employee> list = new ArrayList<>();

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Set<Employee> employees = new TreeSet<>(list);

        System.out.println("Sorting works:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("/nAs does iterator:");
        Iterator<Employee> i = employees.iterator();
        while( i.hasNext() ) {
            System.out.println(i.next());
        }
    }
}

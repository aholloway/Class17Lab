
package class17lab;

import java.util.*;
import lab1.Employee;

public class Lab2 {


    public static void main(String[] args) {
        Employee e1 = new Employee("Doe", "John", "333-33-3333");
        Employee e2 = new Employee("Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee("Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee("Lombardo","James","444-44-4444");
        
        ArrayList<Employee> employees = new ArrayList<>();
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        HashSet<Employee> noDups = new HashSet<>(employees);
        
        for (Employee e: noDups){
            System.out.println(e);
        }
        
        employees = new ArrayList<>(noDups);
        
        System.out.println("");
        for (Employee e: employees){
            System.out.println(e);
        }
        
        
    }
}


package class17lab;

import java.util.*;

public class Lab5 {


    public static void main(String[] args) {
        Employee e1 = new Employee("Doe", "John", "333-33-3333");
        Employee e2 = new Employee("Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee("Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee("Lombardo","James","444-44-4444");
        
        //using comparable
        Map<String,Employee> map = new TreeMap<>();
        
        map.put(e1.getSsn(), e1);
        map.put(e2.getSsn(), e2);
        map.put(e3.getSsn(), e3);
        map.put(e4.getSsn(), e4);

        Set<String> keys = map.keySet();
        
        System.out.println("By ssn:");
        for (String key : keys){
            System.out.println(map.get(key));
        }
        
        //using comparator
        Collection <Employee> values = map.values();
        List <Employee> sortedList = new ArrayList<> (values);
        Collections.sort(sortedList, new EmployeeByLastName());
        
        System.out.println("\nBy last name:");
        for(Employee emp : sortedList) {
            System.out.println(emp);
        }
    }
}

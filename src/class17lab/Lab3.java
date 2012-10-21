
package class17lab;

import java.util.*;
import lab1.Employee;

public class Lab3 {


    public static void main(String[] args) {
        Employee e1 = new Employee("Doe", "John", "333-33-3333");
        Employee e2 = new Employee("Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee("Evans", "Bob", "444-44-4444");
        Employee e4 = new Employee("Lombardo","James","444-44-4444");
        
        Map<String,Employee> map = new HashMap<>();
        
        //seems to allow you to put different objects in the same spots.  
        //Weird.  It looks like it just overwrites the last object that
        // was put in that place.  Maybe that is why they used put instead
        // of add, since you can put an object in a map, but the map size does
        // not grow.
        map.put(e1.getSsn(), e1);
        map.put(e2.getSsn(), e2);
        map.put(e3.getSsn(), e3);
        map.put(e4.getSsn(), e4);

        ArrayList<Employee> employees = new ArrayList<>();
        
        
        //first attempt at listing.  I already know the key.
        // but there is a problem.  There are duplicates beacuse I didn't
        // put the keys in the set.  And sometimes I wouldn't know what the
        // key is.
        employees.add(map.get(e1.getSsn()));
        employees.add(map.get(e2.getSsn()));
        employees.add(map.get(e3.getSsn()));
        employees.add(map.get(e4.getSsn()));
        
        System.out.println(map.size());
        System.out.println("");
        
        for (Employee e: employees){
            System.out.println(e);
        }
        
        // looping through the keys.  A better way
        Set<String> keys = map.keySet();
        
        System.out.println("");
        
        for (String key : keys){
            System.out.println(map.get(key));
        }
        
        
    }
}

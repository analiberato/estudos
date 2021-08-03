package schoolofnet.javalessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compar {
    public static void main(String[] args) {
        List<Person> arr = new ArrayList<Person>();

        arr.add(new Person("Ana", 27));
        arr.add(new Person("Maria", 17));
        arr.add(new Person("Julia", 33));   
        arr.add(new Person("Joana", 5)); 
        
        for (Person p : arr){
            System.out.println(p.getName() + " " + p.getAge());
        }
    
        System.out.println(" ");
    
        //Collections.sort((List) arr);
        
        Collections.sort((List) arr, new Person());
    
        for (Person p : arr){
            System.out.println(p.getName() + " " + p.getAge());
        }
        
    }
    
}

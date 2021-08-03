package schoolofnet.javalessons;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector v = new Vector<>(2, 3); //initialcapacity and capacityincremented
        
        System.out.println(v.capacity());
        v.addElement("a");
        v.addElement("b");

        System.out.println(v.size());
        v.addElement("c");

        System.out.println(v.capacity());
        v.remove(0);

        while (v.iterator().hasNext()) {
            System.out.println(v.iterator().next());
        }

    }
    
}

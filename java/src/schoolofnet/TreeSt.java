package schoolofnet.javalessons;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSt {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();

        tree.add("a");
        tree.add("b");
        tree.add("c");
        tree.add("d");

        System.out.println(tree);

        Iterator<String> iterator = tree.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println(tree.pollFirst());
        System.out.println(tree.pollLast());
        System.out.println(tree.isEmpty());


    }
    
}

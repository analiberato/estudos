package schoolofnet.javalessons;

import java.util.LinkedList;
import java.util.Queue;

/*
* FILA
* First-In, First-Out - FIFO
*/

public class Queues {
    public static void main(String[] args) {
        Queue queue = new LinkedList<>();

        System.out.println("Push: " + queue.add("1"));
        System.out.println("Push: " + queue.add("2"));
        System.out.println("Element: " + queue.element());

        System.out.println("Poll: " + queue.poll());
        System.out.println("Element: " + queue.element());
        System.out.println("Peek: " + queue.peek());

    }
}

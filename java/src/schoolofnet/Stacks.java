package schoolofnet.javalessons;

import java.util.Random;
import java.util.Stack;

/*
* PILHA
* Last In First Out - LIFO
*/
public class stacks {
    public static void main(String[] args) {
        Stack stack = new Stack<>();

        Random random = new Random();

        int i = 5;

        //insert on stack
        while (i != 0) {
            System.out.println("Push " + stack.push(random.nextInt(20)));
            i--;
        }

        //delete first item from stack
        while (!stack.isEmpty()){}
            System.out.println("Pop: " + stack.pop());
        }
    }
    
}

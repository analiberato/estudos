package schoolofnet.javalessons;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = reader.nextLine();

        System.err.println("Nice to meet you " + name);
        reader.close();
    }
    
}

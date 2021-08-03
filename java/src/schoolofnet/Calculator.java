package schoolofnet.javalessons;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Double n1 = 0.0;
        Double n2 = 0.0;
        Double result =  0.0;

        System.out.println("Number 1");
        n1 = reader.nextDouble();
        System.out.println("Number 2");
        n2 = reader.nextDouble();
        System.out.println("Operator (+ - / *)");
        String op = reader.next();

        if(op.equals("+"))
            result = sum(n1, n2);
        else if (op.equals("-"))
            result = sub(n1, n2);
        else if (op.equals("*"))
            result = mult(n1, n2);
        else if (op.equals("/"))
            result = div(n1, n2);
        else
            System.out.println("Could not idetify the operator!"); 
        System.out.println(result);
        
        reader.close();
    }
    
    public static Double sum( Double n1, Double n2) {
        return n1 + n2;        
    }

    public static Double sub( Double n1, Double n2) {
        return n1 - n2;        
    }

    public static Double mult( Double n1, Double n2) {
        return n1 * n2;        
    }

    public static Double div( Double n1, Double n2) {
        return n1 / n2;        
    }

}

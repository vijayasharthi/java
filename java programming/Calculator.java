import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        int a;
        int b;
        String c;
        int d;
        Scanner scnr = new Scanner(System.in);
        System.out.print("The first value is ");
        a = scnr.nextInt();
        System.out.print("The second value is ");
        b = scnr.nextInt();
        System.out.print("Enter the operator ");
        c = scnr.next();

        if (c.equals("addition") || (c.equals("add")) || c.equals("+")) {
            d = a + b;
            System.out.print("The value is " + d);
        } else if (c.equals("Subractor") || (c.equals("sub")) || c.equals("-")) {
            d = a - b;
            System.out.print("The value is " + d);
        } else if (c.equals("multiplication") || c.equals("*") || c.equals("multiply")) {
            d = a * b;
            System.out.print("The value is " + d);
        } else if (c.equals("Divisor") || c.equals("divide") || c.equals("/")) {
            d = a - b;
            System.out.print("The value is " + d);
        }

    }

}

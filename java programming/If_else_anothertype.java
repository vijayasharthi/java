import java.util.*;

public class If_else_anothertype {
    public static void main(String args[]) {

        int a;
        String c;
        Scanner scnr = new Scanner(System.in);
        System.out.print("The value is : ");
        a = scnr.nextInt();
        c = ((a - 1) %2 == 0) ? "even" : "odd";
        System.out.print(c);
    }

}

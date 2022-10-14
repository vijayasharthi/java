import java.util.Scanner;

import javax.swing.SwingConstants;

public class Calculator_usingswitch {
    public static void main(String args[]) {
        int a;
        int b;
        int c;
        Scanner scnr = new Scanner(System.in);
        System.out.print("The first value is : ");
        a = scnr.nextInt();
        System.out.print("The second value is :");
        b = scnr.nextInt();
        System.out.print(" select the operator  : \n 1-addition\n2-subraction\n3-multiplication\n4-divison\n");
        c = scnr.nextInt();
        switch (c) {
            case 1: {
                c = a + b;
                System.out.print(c);
                break;
            }
            case 2: {
                c = a - b;
                System.out.print(c);
                break;
            }
            case 3: {
                c = a * b;
                System.out.print(c);
                break;
            }
            case 4: {
                c = a / b;
                System.out.print(c);
                break;
            }
            default: {
                System.out.print("SORRY CAN YOU PLEASE  ENTER ONLY ABOVE THE FIVE NUMBERS");
                break;
            }
        }

    }

}

import java.util.Scanner;

public class while_calculation {
    public static void main(String[] args) {
        int p =1;
        int a;
        int b;
        int c=1;
        String e;
        int E;
        Scanner scnr = new Scanner(System.in);
         
        

        while (c ==1) {
            System.out.print("Enter the values : ");
            b = scnr.nextInt();
            System.out.print("Enter the second value : ");
            E = scnr.nextInt();
            System.out.print("Enter the operator : ");
            e = scnr.next();



            if (e.equals("addition") || e.equals("add") || e.equals("+"))

            {
                System.out.println(E + b);
            }

            else if (e.equals("subraction") || e.equals("sub") || e.equals("-")) {
                System.out.print(E - b);
            } else if (e.equals("multiplication") || e.equals("x") || e.equals("*")) {
                System.out.print(E * b);

            } else if (e.equals("division") || e.equals("/")) {
                System.out.print(E / b);

            }
          
            {
            System.out.print("   press 1 if you want do again/n press 0 don't i want do ");}
            c=scnr.nextInt();
            
            if(c==1)
            {
            //System.out.print(" do again");
               c=1;
            }
        
            else{
              //  System.out.print("Thank you for using calculator  app ");
               c=0;
            }
            
        }

    }
}



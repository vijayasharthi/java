import java.util.*;
public class While {
    public static void main(String args[]){
        int a;
        Scanner scnr =new Scanner(System.in);
        System.out.print("Enter the number of values :" );
        a=scnr.nextInt();
        int i=1;
        int b;
        int c=0;

        while(i<=a)
        {
            System.out.println("enter the value:");
            b=scnr.nextInt();
            c=c+b;
            i++;


        }
        System.out.print(c);
        
        



    }
    
}

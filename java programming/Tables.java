import java.util.*;
public class Tables {
    public static void main(String args[]){
        
        int b;
        int c;
        int i;
        
        
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter the  no of multplier value : ");
        b=scnr.nextInt();
        System.out.println("Enter the multiplicand value : ");
        c=scnr.nextInt();
        for(i=1;i<=b;i++)
        {
        int a=i*c;
        
        System.out.println(i+ "x"+c+"="+a );
    
        }
        

        

        }
    
}

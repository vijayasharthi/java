import java.util.*;
public class Reverse {
    public static void main(String [] args){
        Scanner scan=new Scanner (System.in);
        int a=scan.nextInt();
        while(a>0)
        {
            int b=a%10;
            System.out.print(b);
            a=a/10;


        }

    }
    
}

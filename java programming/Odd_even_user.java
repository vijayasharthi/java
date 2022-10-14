import java.util.*;
public class Odd_even_user{
    public static void main(String args[]){
        int a;
        Scanner scnr=new Scanner(System.in);
        System.out.print("The value is : ");
        a=scnr.nextInt();
        if(a%2==0)
        {
            System.out.print("The value is even");

        }
        else
        {
            System.out.print("The value is odd");
        }


    }
}
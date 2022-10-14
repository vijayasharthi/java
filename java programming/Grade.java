import java.util.*;
public class Grade {
    public static void main(String args[]){
        int a;
        Scanner scnr=new Scanner(System.in);
        System.out.print("Enter your marks : ");
        a=scnr.nextInt();
        if(a>90)
        {
        System.out.print(" A");
        }
        else if(a>80)
        {
        System.out.print("B");
        }
        else if(a>70)
        {
        System.out.print("C");
        }
        else if(a>60)
        {
        System.out.print("D");
        }
        else if(a<50)
        {
        System.out.print("F");
        }
               }
    
}

import java.util.*;
public class vijay{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = {12,34,56,78,90,23};
        int b = 12; 
        for(int i=0;i<6;i++){
            if(a[i] == b){
                System.out.println("your number is there");
                break;
            }
        }
    }
}
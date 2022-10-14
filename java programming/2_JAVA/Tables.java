import java.util.*;
public class Tables {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter multiplier: ");
        int a = scan.nextInt();
        System.out.println("Enter multiplicant: ");
        int b = scan.nextInt();
        for(int i=0;i<=b;i++)
        {
            int num=a*i;
            System.out.println(i+"X"+a+"="+num);
            scan.close();
    
}
}
}

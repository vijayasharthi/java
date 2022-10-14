import java.util.*;
public class Char_user {
    public static void main(String [] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your charachter :");
            char chs=scan.next().charAt(6);
            String b=scan.nextLine();
            scan.nextLine();
            int a= b.indexOf("D");
            System.out.println(b);
            System.out.println("Your characater is "+chs );
            System.out.println(a);
        }
    }
}

vxcz*

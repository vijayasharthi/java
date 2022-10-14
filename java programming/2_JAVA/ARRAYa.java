import java.util.*;

public class ARRAYa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int b[] = new int[a];

        
        int count = 0;
        int f = 0;

        for (int i = 0; i < a; i++) {
            b[i] = scan.nextInt();
        }
        for (int i = 0; i < a; i++) {
            if (b[i] == 100) {
                count++;
            } else {
                f++;
            }
        }
        System.out.println(count + "STUDENTS GET CENTUM");
        System.out.println(f + "Student get no centum");
        scan.close();
    }

}

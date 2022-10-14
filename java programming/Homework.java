import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number:");
        for (int j = 0; j < 100; j++) {
            int a = j;
            int flag = 0;
            for (int i = 2; i < a; i++)// a=7;
                if (a % i == 0 && a != i) {
                    flag = 1;
                }

            if (flag != 1) {
                System.out.println(j);
            }
        }
    }

}

import java.util.*;
class vijay{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[6];
        for(int i=0;i<6;i++){
            a[i] = scan.nextInt();
        }
        int b = scan.nextInt(); 
        for(int i=0;i<6;i++){
            if(a[i] == b){
                System.out.println("your number is there");
                break;
            }
            else{
                System.out.println("your number is not there");
                break;
            }
        }
    }
}
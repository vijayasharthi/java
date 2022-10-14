import java.util.*;
public class Array{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int count=0;
        int a=scan.nextInt();
        int[] b=new int[a];
        
        for(int i=0;i<a;i++)
        {
            b[i] = scan.nextInt();
        }

        for(int k=0;k<a;k++)
        {
            if(b[k]==100)
            {
                count++;
            }
            

        }
        
        System.out.println("no of people take centum: "+ count);
        System.out.println(a-count);
    }
}
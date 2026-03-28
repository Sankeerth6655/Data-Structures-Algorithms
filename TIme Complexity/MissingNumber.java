import java.io.*;
import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int a=0,b=0;
            b=b^(n+1);
            for(int i=0;i<n;i++){
                a=a^arr[i];
                b=b^(i+1);
            }
            int res=a^b;
            

        System.out.println(res);
        }
    }
}
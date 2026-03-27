import java.io.*;
import java.util.*;

public class ApowerB {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextInt();
            long b=sc.nextInt();
            long m=(long)1e9+7;
            long ans=1;
            long r=a%m;
            while(b!=0){
                if((b&1) ==1){
                    ans=((long)ans*r)%m;
                }
                r=((long)r*r)%m;
                b=b>>1;
            }
            System.out.println(ans);
        }
    }
}
import java.io.*;
import java.util.*;

public class BinaryRepresentation{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==0){
                System.out.println(0);
                continue;
            }
            boolean start = false;
            for(int i=31;i>=0;i--){
                if(((n>>i)&1)==1) start=true;
                if(start) System.out.print((n>>i)&1);
            }
            System.out.println("");
        }
    }
}
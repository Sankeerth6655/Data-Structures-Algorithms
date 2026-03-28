import java.util.*;

public class FlipBits {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
           int a=sc.nextInt();
           int b=sc.nextInt();
            int count=0;
           for(int i=0;i<32;i++){
            if((((a>>i)&1) ^ ((b>>i)&1) )== 1) count++;
           } 
           System.out.println(count);
        }
    }

    
}

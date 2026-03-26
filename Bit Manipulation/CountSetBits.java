import java.util.*;

public class CountSetBits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int count=0;
            for(int i=0;i<64;i++){
                if(((n>>i)&1 )== 1) count++;
            }
            System.out.println(count);
        }
    }
}
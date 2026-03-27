import java.util.*;

public class X1sY0s {

    static long power(long base,long exp,long mod){
        long result =1;
        base=base%mod;

        while(exp>0){
            if((exp&1)==1)
            result=(result*base)%mod;

            base=(base*base)%mod;
            exp>>=1;
        }
        return result;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextInt();
            long y=sc.nextInt();
            long m=(long)(1e9+7);
            long p1=(power(2,x,m)-1+m)%m; //2powx-1
            long p2=power(2,y,m);//2powy
            long res=(p1*p2)%m;
            System.out.println(res);
        }
    }

}
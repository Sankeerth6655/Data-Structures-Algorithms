import java.util.*;

public class XandYsetBit {
    static long power(long base,long exp,long m){
        long ans=1;
        base=base%m;
        while(exp!=0){
            if((exp&1)==1) ans=(ans*base)%m;
            base=(base*base)%m;
            exp>>=1;
        }
            return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextInt();
            long y=sc.nextInt();
            long m=(long)(1e9+7);
            long res;
            if(x==y) res=power(2,x,m);
            else res=(power(2,x,m)+power(2,y,m))%m;
            System.out.println(res);
        }
    }
}
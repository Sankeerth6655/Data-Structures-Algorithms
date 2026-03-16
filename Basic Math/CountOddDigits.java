
import java.util.Scanner;
class CountOddDigits{
    public int CountOdds(int num){
        int count=0,temp;
        if(num==0) return 0;
        while(num!=0){
            temp=num/10;
            if(temp%2!=0) count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        CountOddDigits obj=new CountOddDigits();
        int count=obj.CountOdds(num);
        System.out.println(count);
    }
}
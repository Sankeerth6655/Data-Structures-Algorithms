
import java.util.Scanner;

public class CharDist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=0,end=0;
        String str=sc.next();
        char c=sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                start=i;
                break;
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                end=i;
            }
        }
        int res=end-start;
        System.out.println(res);


    }
}

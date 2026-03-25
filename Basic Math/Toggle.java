import java.util.*;
public class Toggle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90 ){
                res.append((char)(ch+32));
            }
            else if(ch>='a' && ch<='z' ){
                res.append((char)(ch-32));
            }
            else{
                res.append(ch);
            }
        }
        System.out.println(res);
    }
}

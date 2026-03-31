import java.io.*;
import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[99];
        boolean isThere=false;
        for(int i=0;i<99;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<=100;i++){
            isThere=false;
            for(int j=0;j<99;j++){
                if(arr[j]==i){
                    isThere=true;
                }
            }
            if(isThere) continue;
            else System.out.println(i);
        }
    }
}
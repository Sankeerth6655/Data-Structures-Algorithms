import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        
        // int temp=arr[0];
        // for(int i=1;i<5;i++){
        //     arr[i-1]=arr[i];
        // }
        // arr[5-1]=temp;
        for(int i=0;i<5-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

        for(int i=0;i<5;i++){
            System.out.print(arr[i]);
        }
    }
}

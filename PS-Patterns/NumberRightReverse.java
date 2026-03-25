public class NumberRightReverse {
    public void printStars(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
     NumberRightReverse obj=new NumberRightReverse();
        int n=5;
        obj.printStars(n);
    }
}

public class StarRightReverse {
    public void printStars(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
     StarRightReverse obj=new StarRightReverse();
        int n=5;
        obj.printStars(n);
    }
}

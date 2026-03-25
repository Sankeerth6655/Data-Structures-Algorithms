public class ReverseTriangle {
    public void printStars(int n){
        int stars=2*n-1;
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println("");
            stars=stars-2;
        }
    }
    public static void main(String[] args) {
     ReverseTriangle obj=new ReverseTriangle();
        int n=5;
        obj.printStars(n);
    }
}

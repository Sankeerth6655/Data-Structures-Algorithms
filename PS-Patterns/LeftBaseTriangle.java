public class LeftBaseTriangle {
    public void printStars(int n){
        int stars;
        for(int i=0;i<2*n-1;i++){
            if(i<n) stars=i+1;
            else stars=2*n-i-1;
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
     LeftBaseTriangle obj=new LeftBaseTriangle();
        int n=5;
        obj.printStars(n);
    }
}

public class NumIncRightTriangle {
    public void printStars(int n){
        int r=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(r++ +" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
     NumIncRightTriangle obj=new NumIncRightTriangle();
        int n=5;
        obj.printStars(n);
    }
}

public class NumberRightTriangle2 {
    public void printStars(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print(i+1);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        NumberRightTriangle2 obj=new NumberRightTriangle2();
        int n=5;
        obj.printStars(n);
    }
}

public class NumberRightTriangle {
    public void printStars(int n){
        for(int i=0;i<n;i++){
            int r=1;
            for(int j=0;j<i+1;j++){
                System.out.print(r++);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        NumberRightTriangle obj=new NumberRightTriangle();
        int n=5;
        obj.printStars(n);
    }
}

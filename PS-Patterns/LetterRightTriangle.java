public class LetterRightTriangle {
    public void printStars(int n){
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<i+1;j++){
                System.out.print(ch++);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
     LetterRightTriangle obj=new LetterRightTriangle();
        int n=5;
        obj.printStars(n);
    }
}

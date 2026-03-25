public class RevLetterRightTriangle {
    public void printStars(int n){
        for(int i=0;i<n;i++){
            for(char ch=(char)('E'- i);ch<='E';ch++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
     RevLetterRightTriangle obj=new RevLetterRightTriangle();
        int n=5;
        obj.printStars(n);
    }
}

public class LetterRevTriangle {
    public void printStars(int n){
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<n-i;j++){
                System.out.print(ch++);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
     LetterRevTriangle obj=new LetterRevTriangle();
        int n=5;
        obj.printStars(n);
    }
}

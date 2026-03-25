public class LetterRepeatTriangle {
    public void printStars(int n){
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(ch);
            }
            System.out.println("");
            ch++;
        }
    }
    public static void main(String[] args) {
     LetterRepeatTriangle obj=new LetterRepeatTriangle();
        int n=5;
        obj.printStars(n);
    }
}

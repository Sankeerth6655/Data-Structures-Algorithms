public class LetterTriangle {
    public void printStars(int n){
        char ch='A';
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //letter
            for(int j=0;j<2*i+1;j++){
                int col=2*i+1;
                if(j<col/2) 
                System.out.print(ch++);
                else 
                System.out.print(ch--);
            }
            System.out.println("");
            ch='A';
        }
    }
    public static void main(String[] args) {
     LetterTriangle obj=new LetterTriangle();
        int n=5;
        obj.printStars(n);
    }
}

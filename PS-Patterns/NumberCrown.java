public class NumberCrown {
    public void printStars(int n){
        int spaces=2*n-2;
        for(int i=0;i<n;i++){
            //num
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            //space
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            //num
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println("");
            spaces-=2;
        }
    }
    public static void main(String[] args) {
     NumberCrown obj=new NumberCrown();
        int n=5;
        obj.printStars(n);
    }
}

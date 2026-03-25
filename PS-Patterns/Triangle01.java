public class Triangle01 {
    public void printStars(int n){
        int start;
        for(int i=0;i<n;i++){
            if(i%2==0) start=1;
            else start=0;
            for(int j=0;j<i+1;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
     Triangle01 obj=new Triangle01();
        int n=5;
        obj.printStars(n);
    }
}

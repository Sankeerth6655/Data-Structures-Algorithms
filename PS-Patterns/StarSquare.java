class StarSquare{
    public void printStars(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        int n=5;
        StarSquare obj=new StarSquare();
        obj.printStars(n);
    }
}
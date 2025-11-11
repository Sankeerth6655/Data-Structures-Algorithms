class PrintName{
    public void recursion(int i,int n){
        if(i>n) return;
        System.out.println("Raj");
        recursion(i+1,n);
    }
    public static void main(String[] args) {
        PrintName obj=new PrintName();
        int i=1,n=5;
        obj.recursion(i, n);
    }
}
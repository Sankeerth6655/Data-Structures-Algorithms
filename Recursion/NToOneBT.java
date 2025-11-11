class NToOneBT{
    public void recursion(int i,int n){
        if(i>n) return;
        recursion(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        NToOneBT obj=new NToOneBT();
        int i=1,n=5;
        obj.recursion(i, n);
    }
}
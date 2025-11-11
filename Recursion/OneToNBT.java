class OneToNBT{
    public void recursion(int i,int n){
        if(i<1) return;
        recursion(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        OneToNBT obj=new OneToNBT();
        int n=5;
        obj.recursion(n, n);
    }
}
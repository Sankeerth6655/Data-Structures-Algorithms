class NToOne{
    public void recursion(int i,int n){
        if(i<1) return;
        System.out.println(i);
        recursion(i-1, n);
    }
    public static void main(String[] args) {
        NToOne obj=new NToOne();
        int n=5;
        obj.recursion(n, n);
    }
}
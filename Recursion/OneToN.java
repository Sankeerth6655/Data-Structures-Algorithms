class OneToN{
    public void recursion(int i,int n){
        if(i>n) return;
        System.out.println(i);
        recursion(i+1,n);
    }
    public static void main(String[] args) {
        OneToN obj=new OneToN();
        int i=1,n=5;
        obj.recursion(i, n);
    }
}
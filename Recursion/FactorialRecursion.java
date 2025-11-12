class FactorialRecursion{
    public int param(int n){
        if(n==1) return 1;
        return n*param(n-1);
    }
    public static void main(String args[]){
        int n=5;
        FactorialRecursion obj=new FactorialRecursion();
        System.out.print(obj.param(n));
    }
}
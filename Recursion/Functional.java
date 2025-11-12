class Functional{
    public int param(int n){
        if(n==0) return 0;
        return n+param(n-1);
    }
    public static void main(String args[]){
        int n=3;
        Functional obj=new Functional();
        
        System.out.print(obj.param(n));
    }
}
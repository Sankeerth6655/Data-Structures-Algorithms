class Parameterised{
    public int param(int n, int sum){
        if(n<1){
            System.out.print(sum);
            return 0;
        }
        return param(n-1,sum+n);
    }
    public static void main(String args[]){
        int n=3;
        Parameterised obj=new Parameterised();
        obj.param(n,0);
    }
}
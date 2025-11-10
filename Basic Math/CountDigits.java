class CountDigits{
    public int noOfDigits(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=567345;
        CountDigits obj=new CountDigits();
        int res=obj.noOfDigits(n);
        System.out.print(res);
    }
}
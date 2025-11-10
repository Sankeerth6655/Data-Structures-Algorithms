class ReverseNumber{
    public int noOfDigits(int n){
        
        int lastDigit,revNum=0;
        while(n!=0){
            lastDigit=n%10;
            revNum=(revNum*10)+lastDigit;
            n=n/10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        int n=1234;
        ReverseNumber obj=new ReverseNumber();
        int res=obj.noOfDigits(n);
        System.out.print(res);
    }
}
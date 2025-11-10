class Palindrome{
    public boolean  noOfDigits(int n){
        int lastDigit,revNum=0,temp=n;
        while(temp!=0){
            lastDigit=temp%10;
            revNum=(revNum*10)+lastDigit;
            temp/=10;
        }
        if(revNum==n) return true;
        return false;
        
    }
    public static void main(String[] args) {
        int n=121;
        Palindrome obj=new Palindrome();
        boolean res=obj.noOfDigits(n);
        System.out.print(res);
    }
}
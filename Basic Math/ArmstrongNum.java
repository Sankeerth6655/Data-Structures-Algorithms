class ArmstrongNum{
    public boolean  noOfDigits(int n){
        int lastDigit,sum=0,count=0,temp1=n,temp2=n,x=1;

        while(temp1!=0){
            count++;
            temp1/=10;
        }
        
        while(temp2!=0){
            lastDigit=temp2%10;
            for(int i=0;i<count;i++){
                x=x*lastDigit;
            }
            sum+=x;
            temp2/=10;
            x=1;
        }

        if(sum==n) return true;
        return false; 
    }
    public static void main(String[] args) {
        int n=153;
        ArmstrongNum obj=new ArmstrongNum();
        boolean res=obj.noOfDigits(n);
        System.out.print(res);
    }
}
public class StringRotation {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2 = "CDBA";
        String mix=str1+str1;
        boolean res=mix.contains(str2);
        System.out.print(res);
    }
}

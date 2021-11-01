public class ReverseString {
    public static void main(String[] args){

        String s = "Hello";

        //1st solution , String is immutable
        int length = s.length();
        String rev = "";

        for(int i=length-1; i>=0; i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);

        //2nd solution, StringBuffer is mutable
        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());
    }
}

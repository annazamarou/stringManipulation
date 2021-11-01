public class StringToFakeBinary {
    /*Given a string of digits, you should replace any digit
    below 5 with '0' and any digit 5 and above with '1'.
    Return the resulting string.*/
    public static void main(String[] args) {
        System.out.println(fakeBinary("156987"));

    }
    public static String fakeBinary(String s){

        String first = s.replaceAll("[1-4]", "0");
        String newString = first.replaceAll("[5-9]", "1");
        return newString;

        //2nd solution
//        return s.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");

        //3rd solution
//        final char c[] = s.toCharArray();
//        for (int i = 0; i < c.length; i++)
//            c[i] = c[i] < '5' ? '0' : '1';
//        return new String(c);
    }
}

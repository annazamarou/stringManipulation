public class BreakCamelCase {
    //Complete the solution so that the function will break up camel casing, using a space between words.
    public static void main(String[] args) {
        System.out.println(camelCase("AnnaZamarou"));
    }
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

//2nd solution
//    public static String camelCase(String input) {
//        String out = "";
//
//        for (int i=0; i<input.length(); i++) {
//            String c = Character.toString(input.charAt(i));
//            if (c.equals(c.toUpperCase())) {
//                out+=" ";
//            }
//            out+=c;
//        }
//
//        return out;
//    }
}

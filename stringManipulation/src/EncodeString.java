public class EncodeString {
    //The goal of this exercise is to convert a string to a new string where each character in the new
    // string is "(" if that character appears only once in the original string, or ")" if that character
    // appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
    public static void main(String[] args) {
        System.out.println(encode("aabhaa"));
    }
    public static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
    //2nd solution
//    public static String encode(String word){
//        String encodeString = "";
//        String decodedString = word.toLowerCase();
//        for (int i = 0; i < decodedString.length(); i++) {
//
//            if (decodedString.substring(i + 1, decodedString.length())
//                    .contains(String.valueOf(decodedString.charAt(i)))
//                    || decodedString.substring(0, i).contains(String.valueOf(decodedString.charAt(i)))) {
//                encodeString += ")";
//            } else {
//                encodeString += "(";
//            }
//
//        }
//        return encodeString;
//    }
}

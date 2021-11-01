public class StringEndsIsAnotherString {
//    public static boolean solution(String str, String ending) {
//        return str.endsWith(ending);
//    }

    //solution 2
    public static boolean solution(String str, String ending) {
        char[] strung = str.toCharArray(), out = ending.toCharArray();
        if (out.length>strung.length) return false;
        for (int i=0; i<(out.length); i++)
            if (strung[(strung.length-1)-i]!=out[(out.length-1)-i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("Anna", "na"));
    }
}

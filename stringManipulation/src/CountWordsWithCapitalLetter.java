import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordsWithCapitalLetter {
    public static void main(String[] args) {
        String str = " soonIWantVacations";

        //if a small char word is at the beginning
        int c  = 0;
        if (Character.isLowerCase(str.trim().charAt(0))){
            c++;
        }
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)>= 'A' && str.charAt(i)<= 'Z'){
                c++;
            }
        }
        System.out.println(c);

        //1st solution
        int count =0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)>= 'A' && str.charAt(i)<= 'Z'){
                count++;
            }
        }
        System.out.println(count);

        //2nd solution
        int count1 =0;
        for (int i=0; i<str.length(); i++){
            //we use ASCII values(A= 65,  Z=90)
            if (str.charAt(i)>= 65 && str.charAt(i)<= 90){
                count1++;
            }
        }
        System.out.println(count1);

        //3rd solution
        int count2 =0;
        for (int i=0; i<str.length(); i++){
            //we use ASCII values(A= 65,  Z=90)
            if (Character.isUpperCase(str.charAt(i))){
                count2++;
            }
        }
        System.out.println(count2);

        //4th solution using streams
        long count4 = str.chars().filter(e -> e>=65 && e<=90).count();
        System.out.println(count4);

        //5th solution using streams
        long count5 = str.chars().filter(e -> Character.isUpperCase(e)).count();
        System.out.println(count5);

        //6th REGEX
        String reg = "[A-Z]+";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        pattern.matcher(str);
        int count6=0;
        while(matcher.find()){
            count6+= matcher.group(0).length();
        }
        System.out.println(count6);
    }
}

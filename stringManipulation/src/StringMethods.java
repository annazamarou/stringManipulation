public class StringMethods {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println(str1.equals(str2));
        System.out.println(str1.length());
        System.out.println(str1.charAt(0));

        //same outcome
        System.out.println(str1.charAt(0) + "|" + str1.charAt(4));
        System.out.println(str1.charAt(0) + "|" + str1.charAt(str1.length()-1));

        System.out.println(str1.indexOf("l")); // 1st occurrence of l
        System.out.println(str1.indexOf("l", str1.indexOf("l")+1)); //// 2st occurrence of l

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println(str1.contains("l"));

        String str3 = str1.substring(3); //from index 0 to 2 will be removed and the rest is our result
        System.out.println(str3);

        String str4 = str1.substring(1, 3); //from index 1 to 2 will be our result
        System.out.println(str4);

        String str5 = str1.replace("e", "E"); //from index 0 to 2 will be rmoved and the rest is our result
        System.out.println(str5);

        char[] charArr = str1.toCharArray();
        for(char ch : charArr){
            System.out.print(ch + " ");
        }
        System.out.println("");

        String str = "Anna, Nikos";
        String[] strArr = str.split(",");
        for(String s : strArr) {
            System.out.println(s.trim());
        }

        System.out.println(str.isEmpty());

        System.out.println(str1.concat(" World!"));

    }
}


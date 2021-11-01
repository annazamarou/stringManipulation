public class RevomeSpecialCharacters {
    public static void main(String[] args){

        String s= "////anna125S !!!";

        //Regex:[a-zA-Z0-9]

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}

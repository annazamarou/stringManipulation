public class PrintName1000TimesWithoutLoop {
    public static void main(String[] args) {
        String name = "anna";

        //1st solution
        String s = "i";
        s = s.replaceAll("i", "iiiiiiiiii");//10
        s = s.replaceAll("i", "iiiiiiiiii");//10*10 = 100
        s = s.replaceAll("i", "iiiiiiiiii");//100*10 = 1000

        s = s.replaceAll("i", name + "\n");
        System.out.println(s);

    }
}

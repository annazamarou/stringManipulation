public class IntToString {

    public static void main(String[] args){

        int x = 123;

        String y = Integer.toString(x);
        System.out.println("First way: " + y);

        System.out.println("Second way: " + String.valueOf(x));

        String str = "" + 123;
        System.out.println("Third way: " + str);
    }
}


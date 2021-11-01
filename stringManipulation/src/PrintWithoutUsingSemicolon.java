public class  PrintWithoutUsingSemicolon {
    public static void main(String[] args) {

        //1st solution
        if (System.out.printf("Hello World" + "\n") == null){}

        //2nd solution
        if (System.out.append("Hello World"+ "\n") == null){}

        //3rd solution
        if (System.out.append("Hello World"+ "\n").equals(null)){}

        //4th solution
        for (int i=0; i<1; System.out.println("Hello World")){
            i++;
        }
    }
}

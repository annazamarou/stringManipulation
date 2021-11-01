import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {

        printDuplicateCharacters("A");
        System.out.println("****************");
        printDuplicateCharacters("");
        System.out.println("****************");
        printDuplicateCharacters("AAAAA");
        System.out.println("****************");
        printDuplicateCharacters(null);
        System.out.println("****************");
        printDuplicateCharacters("java");
        System.out.println("****************");
        printDuplicateCharacters("Anna");
        System.out.println("****************");
        printDuplicateCharacters("niko");
    }

    public static void printDuplicateCharacters(String str){
        if (str == null){
            System.out.println("Null String");
            return;
        }
        if (str.isEmpty()){
            System.out.println("Empty String");
        }
        if (str.length() == 1){
            System.out.println("Single character String");
        }

        char words[] = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (Character ch: words){
            if (charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
            }else{
                charMap.put(ch, 1);
            }
        }

        //print the map
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet){
            if (entry.getValue() >1){
                System.out.println(entry.getKey() + ":"+ entry.getValue());
            }
        }
    }
}

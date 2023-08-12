import java.util.HashMap;
import java.util.Set;

public class CountDuplicateCharacters {
    public static void duplicateCharCount(String inputString){

        HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();

        char[] strArray = inputString.toCharArray();

        for(char c : strArray){
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }
            else{
                charCount.put(c,1);
            }
        }

        Set<Character> charString = charCount.keySet();
        System.out.println("Duplicate characters in string :"+inputString);

        for(char ch : charString){
            if(charCount.get(ch)>1){
                System.out.println(ch+" : "+charCount.get(ch));
            }
        }
    }

    public static void main(String[] args) {

        duplicateCharCount("javaJ2ee");
        duplicateCharCount("Better Butter");
    }
}

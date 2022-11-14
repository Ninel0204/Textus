
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text= "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    public static void main(String[] args) {
        Map<Character, Integer> loremIpsum = new HashMap<>();
        for(char c:text.toCharArray()){
            if (Character.isLetter(c)){
                if(!loremIpsum.containsKey(c)){
                    loremIpsum.put(c,1);
                } else {
                    loremIpsum.put(c, loremIpsum.get(c)+1);
                }
            }
        }
        int maxText=(Collections.max(loremIpsum.values()));
        for (Map.Entry<Character,Integer>entry:loremIpsum.entrySet()){
            if (entry.getValue()==maxText){
                System.out.println("Наиболее часто встречающаяся буква : "+ entry.getKey());
                break;
            }
        }
        int minText=( Collections.min(loremIpsum.values()));
        for (Map.Entry<Character,Integer>entry1:loremIpsum.entrySet()){
            if(entry1.getValue()==minText){
                System.out.println("Наиболее реже встречающаяся буква: "+entry1.getKey());
                break;
            }
        }
    }
}
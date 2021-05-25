import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> charCount=new LinkedHashMap<>();
        String line=scanner.nextLine();
        for(int i=0;i<line.length();i++){
            if(!(line.charAt(i)==' ')){
                Integer occurences=charCount.get(line.charAt(i));
                if(occurences==null){
                    occurences=0;
                }
                charCount.put(line.charAt(i),occurences+1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}

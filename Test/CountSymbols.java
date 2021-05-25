import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> characterMap=new TreeMap();
        String line=scanner.nextLine();
        for(int i=0;i<line.length();i++){
            if(characterMap.get(line.charAt(i))!=null){
                characterMap.put(line.charAt(i),characterMap.get(line.charAt(i))+1);
            }
            else characterMap.put(line.charAt(i),1);
        }
        for (Character character : characterMap.keySet()) {
            System.out.println(character+": "+characterMap.get(character)+" time/s");
        }
    }
}

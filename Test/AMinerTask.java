import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> resources=new LinkedHashMap<>();
        String input=scanner.nextLine();
        while (!input.equals("stop")){
            int quantity=Integer.parseInt(scanner.nextLine());
            if(resources.get(input)!=null){
                resources.put(input,resources.get(input)+quantity);
            }
            else resources.put(input,quantity);

            input=scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}

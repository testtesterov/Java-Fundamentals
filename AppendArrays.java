import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arrays= Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        for(int i=arrays.size()-1;i>=0;i--){
            String[] tokens=arrays.get(i).split("\\s+");
            for (String token : tokens) {
                if(!token.equals(""))
                System.out.print(token+" ");
            }
        }
    }
}

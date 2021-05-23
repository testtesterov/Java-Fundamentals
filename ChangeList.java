import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        String[] line=scanner.nextLine().split("\\s+");
        for(int i=0;i<line.length;i++)
            list.add(Integer.parseInt(line[i]));
        String input=scanner.nextLine();
        while (!input.equals("end")){
            String[] tokens=input.split("\\s+");
            if(tokens.length==2&&tokens[0].equals("Delete")) {
                while (list.contains(Integer.valueOf(tokens[1]))) {
                    list.remove(Integer.valueOf(tokens[1]));
                }
            }
            if(tokens.length==3&&tokens[0].equals("Insert")) {
                if(Integer.parseInt(tokens[2])<list.size())
                list.add(Integer.parseInt(tokens[2]),Integer.parseInt(tokens[1]));
            }
            input=scanner.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }
}

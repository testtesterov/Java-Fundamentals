import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FinalExam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> guestsList=new HashMap<>();
        int count=0;
        String input= scanner.nextLine();
        while (!input.equals("Stop")){
            String[] tokens=input.split("-");
            switch (tokens[0]){
                case "Like":
                    List<String> meals=new ArrayList<>();
                    meals.add(tokens[2]);
                    if(guestsList.get(tokens[1])==null){
                        guestsList.put(tokens[1],meals);
                    }else if(!(guestsList.get(tokens[1]).contains(tokens[2]))){
                        List<String> hasMeals= Stream.concat(guestsList.get(tokens[1]).stream(),meals.stream()).collect(Collectors.toList());
                        guestsList.put(tokens[1],hasMeals);
                    }
                    break;
                case "Unlike":
                    if(guestsList.get(tokens[1])==null       ){
                        System.out.println(tokens[1]+" is not at the party.");
                    }
                    else{
                        if(!guestsList.get(tokens[1]).contains(tokens[2]))
                            System.out.println(tokens[1]+" doesn't have the "+tokens[2]+" in his/her collection.");
                    }
                    if(guestsList.get(tokens[1])!=null&&guestsList.get(tokens[1]).contains(tokens[2])){
                        System.out.println(tokens[1]+" doesn't like the "+tokens[2]+".");
                        guestsList.get(tokens[1]).remove(tokens[2]);
                        count++;
                    }
                    break;
                default: break;
            }
            input=scanner.nextLine();
        }
        guestsList.entrySet().stream()
                .sorted((a,b) -> {
                    int result=b.getValue().size()-a.getValue().size();
                    if(result==0){
                        result=a.getKey().compareTo(b.getKey());
                    }
                    return result;
                }).forEach(g ->{
            System.out.print(g.getKey()+": ");
            for(int i=0;i<g.getValue().size();i++){
                if(i==0) System.out.print(g.getValue().get(i));
                else System.out.print(", "+g.getValue().get(i));
            }
            System.out.println();
        });
        System.out.println("Unliked meals: "+count);
    }
}

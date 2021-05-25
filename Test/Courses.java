import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> course=new LinkedHashMap<>();
        String line=scanner.nextLine();
        while (!line.equals("end")){
            String[] data=line.split(" : ");
            String courseName=data[0];
            String studentName=data[1];
            if(course.get(courseName)==null){
                course.put(courseName,new LinkedList<>());
            }
            course.get(courseName).add(studentName);
            line=scanner.nextLine();
        }
        course.entrySet()
                .stream()
                .sorted((a,b) -> b.getValue().size()-a.getValue().size())
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue().stream()
                            .sorted((a,b) -> a.compareTo(b))
                            .forEach(s -> System.out.println("-- "+s));
                });
    }
}

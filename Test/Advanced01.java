import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Advanced01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> queue= new ArrayDeque<>();
        Deque<Integer> stack= new ArrayDeque<>();

        int value=0;

        int[] firstLine= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondLine= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for(int i=0;i<firstLine.length;i++){
            queue.offer(firstLine[i]);
        }

        for(int i=0;i<secondLine.length;i++){
            stack.push(secondLine[i]);
        }

        while (!queue.isEmpty()&&!stack.isEmpty()){
            int sum=queue.peek()+stack.peek();
            if(sum%2==0){
                value+=sum;
                queue.poll();
                stack.pop();
            }
            else{
                queue.offer(stack.pop());
            }
        }

        if(queue.isEmpty()){
            System.out.println("First magic box is empty.");
        }
        else System.out.println("Second magic box is empty.");

        if(value>=90){
            System.out.println("Wow, your prey was epic! Value: "+value);
        }
        else System.out.println("Poor prey... Value: "+value);

    }
}

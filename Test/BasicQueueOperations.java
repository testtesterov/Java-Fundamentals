import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> queue=new ArrayDeque<>();
        String[] NSX=scanner.nextLine().split("\\s+");
        int N=Integer.parseInt(NSX[0]);
        int S=Integer.parseInt(NSX[1]);
        int X=Integer.parseInt(NSX[2]);
        String[] numbers=scanner.nextLine().split("\\s+");
        for (String number : numbers)
            queue.offer(Integer.valueOf(number));
        for(int i=0;i<S;i++){
            queue.poll();
        }
        if(!queue.isEmpty()){
            if(queue.contains(X)){
                System.out.println("true");
            }
            else{
                System.out.println(Collections.min(queue));
            }
        }
        else System.out.println(0);
    }
}

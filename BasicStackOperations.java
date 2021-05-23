import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack=new ArrayDeque<>();
        String[] NSX=scanner.nextLine().split("\\s+");
        int N=Integer.parseInt(NSX[0]);
        int S=Integer.parseInt(NSX[1]);
        int X=Integer.parseInt(NSX[2]);
        String[] numbers=scanner.nextLine().split("\\s+");
        for (String number : numbers)
            stack.push(Integer.parseInt(number));
        for(int i=0;i<S;i++){
            stack.pop();
        }
        if(!stack.isEmpty()) {
            int currentMin = stack.peek();

            if (stack.contains(X))
                System.out.println("true");
            else {
                for (int i = 0; i < stack.size(); i++) {
                    if (stack.peek() < currentMin) currentMin = stack.peek();
                    stack.pop();
                }
                System.out.println(currentMin);
            }
        }
        else System.out.println("0");
    }
}

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> stack = new ArrayDeque<>();
        String line = scanner.nextLine();


        for (int i = 0; i < line.length(); i++) {

            if (String.valueOf(line.charAt(i)).equals("(") || String.valueOf(line.charAt(i)).equals("{") || String.valueOf(line.charAt(i)).equals("[")) {
                stack.push(String.valueOf(line.charAt(i)));
            } else {
                if(!stack.isEmpty()) {
                    if (((String.valueOf(line.charAt(i)).equals(")") && stack.peek().equals("(")) ||
                            (String.valueOf(line.charAt(i)).equals("}") && stack.peek().equals("{")) ||
                            (String.valueOf(line.charAt(i)).equals("]") && stack.peek().equals("[")))) {

                        stack.pop();
                    }
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if (stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}



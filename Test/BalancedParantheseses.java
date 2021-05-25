import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParantheseses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> stack=new ArrayDeque<>();
        String line=scanner.nextLine();
        for(int i=0;i<line.length();i++){
            if(String.valueOf(line.charAt(i)).equals("(")||String.valueOf(line.charAt(i)).equals("[")||String.valueOf(line.charAt(i)).equals("{")){
                stack.push(String.valueOf(line.charAt(i)));
            }
        }
        for(int i=0;i<line.length();i++){
            String linea=String.valueOf(line.charAt(i));
            String stacka=stack.peek();
            if(linea.equals("{")){
                for(int j=i;j<line.length();j++){
                    if(String.valueOf(line.charAt(j)).equals("}")){
                        stack.pop();
                        break;
                    }
                }
            }
            if(linea.equals("(")){
                for(int j=i;j<line.length();j++){
                    if(String.valueOf(line.charAt(j)).equals(")")){
                        stack.pop();
                        break;
                    }
                }
            }
            if(linea.equals("[")){
                for(int j=i;j<line.length();j++){
                    if(String.valueOf(line.charAt(j)).equals("]")){
                    stack.pop();
                    break;
                    }
                }
            }
        }
        if (stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}

//taq e greshnata
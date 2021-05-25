import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        String[] arrayLine=line.split(" ");
        int[] arr = new int[arrayLine.length];
        for (int i = 0; i < arrayLine.length; i++){
            arr[i] = Integer.parseInt(arrayLine[i]);
        }
        String input=scanner.nextLine();
        while(!input.equals("end")){
            String[] tokens=input.split(" ");
            String command=tokens[0];
            if(command.equals("swap")) {
                int x=arr[Integer.parseInt(tokens[1])];
                arr[Integer.parseInt(tokens[1])]=arr[Integer.parseInt(tokens[2])];
                arr[Integer.parseInt(tokens[2])]=x;
            }
            if(command.equals("multiply")){
                arr[Integer.parseInt(tokens[1])]=arr[Integer.parseInt(tokens[2])]*arr[Integer.parseInt(tokens[1])];
            }
            if(command.equals("decrease")){
                for(int i=0;i<arr.length;i++){
                    arr[i]--;
                }
            }

            input=scanner.nextLine();
        }
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1) System.out.print(arr[i]+", ");
            else System.out.print(arr[i]);
        }
    }
}

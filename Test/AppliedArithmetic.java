import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray=  Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Function<int[],int[]> addOne=arr -> Arrays.stream(arr).map(num -> num+=1).toArray();
        Function<int[],int[]> multiplyArray=arr -> Arrays.stream(arr).map(num -> num*=2).toArray();
        Function<int[],int[]> subtractArray=arr -> Arrays.stream(arr).map(num -> num-=1).toArray();
        Consumer<int[]> printArray=arr -> {
            Arrays.stream(arr).forEach(e -> System.out.print(e+" "));
        };
        String command=scanner.nextLine();
        while (!command.equals("end")){
            switch (command){
                case "add":
                    intArray=addOne.apply(intArray);
                    break;
                case "multiply":
                    intArray=multiplyArray.apply(intArray);
                    break;
                case "subtract":
                    intArray=subtractArray.apply(intArray);
                    break;
                case "print":
                    printArray.accept(intArray);
                    System.out.println();
                    break;
            }
            command=scanner.nextLine();
        }
    }
}

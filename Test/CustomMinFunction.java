import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray=  Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Function<int[],Integer> func=arr -> {
            return Arrays.stream(arr).min().getAsInt();
        };
        System.out.println(func.apply(intArray));
    }
}

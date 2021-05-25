import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FactorialDivison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNumber=Integer.parseInt(scanner.nextLine());
        long secondNumber=Integer.parseInt(scanner.nextLine());
        factorialDivision(firstNumber,secondNumber);
    }
    public static void factorialDivision(long firstNumber,long secondNumber){
        BigDecimal firstFact= BigDecimal.valueOf(1);
        if(firstNumber==0) firstFact= BigDecimal.valueOf(1);
        else {
            for (int i = 1; i <= firstNumber; i++) {
                firstFact =firstFact.multiply(BigDecimal.valueOf(i));
            }
        }
        long secondFact=1;
        for(int i=1;i<=secondNumber;i++){
            secondFact*=i;
        }

        BigDecimal result= firstFact.divide(BigDecimal.valueOf(secondFact),2, RoundingMode.HALF_EVEN);
        System.out.printf("%.2f",result);
    }
}

import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workerEfficiency=Integer.parseInt(scanner.nextLine());
        int countOfWorkers=Integer.parseInt(scanner.nextLine());
        int secondFactory=Integer.parseInt(scanner.nextLine());
        int firstFactory=0;
        for(int i=1;i<=30;i++){
            if(i%3==0){
                firstFactory+=Math.floor(0.75*(workerEfficiency*countOfWorkers));
            }
            else firstFactory+=(workerEfficiency*countOfWorkers);
        }
        System.out.println("You have produced "+firstFactory+" biscuits for the past month.");
        if(firstFactory>secondFactory){
            int diff=firstFactory-secondFactory;
            double fraction=(double)diff/secondFactory;
            double result=fraction*100;
            System.out.printf("You produce %.2f percent more biscuits.", result);
        }
        if(firstFactory<secondFactory){
            int diff=secondFactory-firstFactory;
            double fraction=(double)diff/secondFactory;
            double result=fraction*100;
            System.out.printf("You produce %.2f percent less biscuits.", result);
        }
    }
}

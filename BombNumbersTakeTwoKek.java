import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbersTakeTwoKek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<input.length;i++){
            list.add(Integer.parseInt(input[i]));
        }
        String[] numberAndPower=scanner.nextLine().split(" ");
        int specialNumber=Integer.parseInt(numberAndPower[0]);
        int power=Integer.parseInt(numberAndPower[1]);
        while (list.contains(specialNumber)){
            int bompPosition=list.indexOf(specialNumber);
            int leftBound=Math.max(0,bompPosition-power);
            int rightBound=Math.min(bompPosition+power,list.size()-1);
            for(int i=rightBound;i>=leftBound;i--){
                list.remove(i);
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}

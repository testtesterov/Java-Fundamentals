import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input=scanner.nextLine().split("\\s+");
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<input.length;i++){
            list.add(Integer.parseInt(input[i]));
        }
        String[] line=scanner.nextLine().split("\\s+");
        int specialNumber=Integer.parseInt(line[0]);
        int power=Integer.parseInt(line[1]);
        for(int i=0;i<list.size();i++){
            /*if(list.get(i)==specialNumber){
                if(i+power>list.size()-1){
                    for(int k=i+1;k<list.size();k++){
                        list.remove(k);
                    }
                }
                else {
                    for (int k = i + 1; k <= i + power; k++) {
                        list.remove(k);
                    }
                }if(i-power<0){
                    for(int j=i;j>=0;j--){
                        list.remove(j);
                    }
                }
                else {
                    for (int j = i; j >= i - power; j--) {
                        list.remove(j);
                    }
                }*/
            if(list.get(i)==specialNumber){
                if(i+power<=list.size()-1&&i-power<=0) {
                    for (int j = i + power; j >= i - power; j--) {
                        list.remove(j);
                    }
                }
                if(i+power>list.size()-1&&i-power<=0){
                    for (int j = list.size(); j >i - power; j--) {
                        list.remove(j);
                    }
                }
                if(i+power<=list.size()-1&&i-power>0) {
                    for (int j = i + power; j >= 0; j--){
                        list.remove(j);
                    }
                }

            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        boolean flag=false;
        for(int i=0;i<input.length;i++){
            int leftSum=0;
            int rightSum=0;
            for(int j=i-1;j>=0;j--){
                leftSum+=Integer.parseInt(input[j]);
            }
            for(int k=i+1;k<input.length;k++){
                rightSum+=Integer.parseInt(input[k]);
            }
            if(leftSum==rightSum){
                flag=true;
                System.out.print(i);
            }
        }
        if(!flag) System.out.print("no");
    }
}

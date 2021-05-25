import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        int primaryDiagonal=0;
        int secondaryDiagonal=0;
        for(int i=0;i<n;i++){
            primaryDiagonal+=arr[i][i];
            secondaryDiagonal+=arr[i][n-i-1];
        }
        System.out.println(Math.abs(primaryDiagonal-secondaryDiagonal));
    }
}

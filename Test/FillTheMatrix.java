import java.util.Scanner;

public class FillTheMatrix {
    public static void A(int n){
        int[][] matrix=new int[n][n];
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[j][i]=k;
                k++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void B(int n){
        int[][] matrix=new int[n][n];
        int k=1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    matrix[j][i]=k;
                    k++;
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    matrix[j][i]=k;
                    k++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens=scanner.nextLine().split(", ");
        int n= Integer.parseInt(tokens[0]);
        if(tokens[1].equals("A")){
            A(n);
        }
        if(tokens[1].equals("B")){
            B(n);
        }
    }
}

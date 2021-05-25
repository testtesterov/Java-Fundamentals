import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        String[] arrayLine=line.split(" ");
        int rotations=Integer.parseInt(scanner.nextLine());
        int[] arr = new int[arrayLine.length];

        for (int i = 0; i < arrayLine.length; i++){
            arr[i] = Integer.parseInt(arrayLine[i]);
        }
        for(int i=0;i<rotations;i++){
            int x=arr[arr.length-1];
            arr[arr.length-1]=arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                if(j==arr.length-2) arr[j]=x;
                else arr[j]=arr[j+1];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.Scanner;

public class Advanced02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix=new char[n][n];
        int totalBombs=0;
        int currentRow=-1;
        int currentCol=-1;
        boolean exitCheck=false;
        int cycleCount=0;
        int deactivatedBombs=0;
        boolean bombCheck=false;

        String[] commands=scanner.nextLine().split(",");

        for(int i=0;i<n;i++){
            String[] tokens=scanner.nextLine().split("\\s+");
            for(int j=0;j<n;j++){
                matrix[i][j]=tokens[j].charAt(0);
                if(matrix[i][j]=='B') totalBombs++;
                if(matrix[i][j]=='s'){
                    currentRow=i;
                    currentCol=j;
                }
            }
        }

        while (!exitCheck&&cycleCount<commands.length&&!bombCheck){
            int nextRow=0;
            int nextCol=0;
            switch (commands[cycleCount]) {
                case "up":
                    nextRow=currentRow-1;
                    nextCol=currentCol;
                    break;
                case "down":
                    nextRow=currentRow+1;
                    nextCol=currentCol;
                    break;
                case "right":
                    nextRow=currentRow;
                    nextCol=currentCol+1;
                    break;
                case "left":
                    nextRow=currentRow;
                    nextCol=currentCol-1;
                    break;
            }
            if(nextRow >= 0 && nextRow < n && nextCol < n && nextCol >= 0){
                if(matrix[nextRow][nextCol] == 'B'){
                    deactivatedBombs++;
                    matrix[currentRow][currentCol]='+';
                    currentRow=nextRow;
                    currentCol=nextCol;
                    matrix[currentRow][currentCol]='s';
                    System.out.println("You found a bomb!");
                    if(deactivatedBombs==totalBombs) {
                        System.out.println("Congratulations! You found all bombs!");
                        bombCheck=true;
                    }
                }
                else if(matrix[nextRow][nextCol] == '+'){
                    matrix[currentRow][currentCol]='+';
                    currentRow=nextRow;
                    currentCol=nextCol;
                    matrix[currentRow][currentCol]='s';
                }
                else if(matrix[nextRow][nextCol] == 'e'){
                    exitCheck=true;
                }
            }

            cycleCount++;

        }
        if(exitCheck) {
            System.out.println("END! "+(totalBombs-deactivatedBombs)+" bombs left on the field");
        }
        else if(!bombCheck){
            System.out.println((totalBombs-deactivatedBombs)+" bombs left on the field. Sapper position: ("+currentRow+","+currentCol+")");
        }


    }
}

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy=Integer.parseInt(scanner.nextLine());
        int countOfWins=0;
        String input=scanner.nextLine();
        while (!input.equals("End of battle")){
            int neededEnergy=Integer.parseInt(input);
            if(energy-neededEnergy>=0){
                energy-=neededEnergy;
            }else{
                System.out.println("Not enough energy! Game ends with "+countOfWins+" won battles and "+energy+" energy");
                return;
            }
            countOfWins++;
            if(countOfWins%3==0){
                energy+=countOfWins;
            }
            input=scanner.nextLine();
        }
        System.out.println("Won battles: "+countOfWins+". Energy left: "+energy);
    }
}

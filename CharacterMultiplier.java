import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data=scanner.nextLine().split(" ");
        System.out.print(characterMultiplier(data[0],data[1]));
    }
    private static int characterMultiplier(String firstString,String secondString){
        int sum=0;
        if(firstString.length()==secondString.length()){
            for(int i=0;i<firstString.length();i++){
                sum+=firstString.charAt(i)*secondString.charAt(i);
            }
        }
        if(firstString.length()>secondString.length()){
            for(int i=0;i<secondString.length();i++){
                sum+=firstString.charAt(i)*secondString.charAt(i);
            }
            for(int i=secondString.length();i<firstString.length();i++){
                sum+=firstString.charAt(i);
            }
        }
        if(secondString.length()>firstString.length()){
            for(int i=0;i<firstString.length();i++){
                sum+=firstString.charAt(i)*secondString.charAt(i);
            }
            for(int i=firstString.length();i<secondString.length();i++){
                sum+=secondString.charAt(i);
            }
        }
        return sum;
    }
}

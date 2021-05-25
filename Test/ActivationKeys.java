import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey=scanner.nextLine();
        String commands=scanner.nextLine();
        while(!commands.equals("Generate")){
            String[] commandsAndTokens=commands.split(">>>");
            String command=commandsAndTokens[0];
            switch (command){
                case "Contains":
                    String substr=commandsAndTokens[1];
                    if(activationKey.contains(substr)){
                        System.out.println(activationKey+" contains "+substr);
                    }else{
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    if(commandsAndTokens[1].equals("Upper")){
                        String flipSubStr = activationKey.substring(Integer.parseInt(commandsAndTokens[2]), Integer.parseInt(commandsAndTokens[3]));
                        activationKey = activationKey.substring(0, Integer.parseInt(commandsAndTokens[2])) + flipSubStr.toUpperCase()
                                + activationKey.substring(Integer.parseInt(commandsAndTokens[3]));

                    }
                    if(commandsAndTokens[1].equals("Lower")){
                        String flipSubStr=activationKey.substring(Integer.parseInt(commandsAndTokens[2]),Integer.parseInt(commandsAndTokens[3]));
                        activationKey=activationKey.substring(0,Integer.parseInt(commandsAndTokens[2]))+flipSubStr.toLowerCase()
                                +activationKey.substring(Integer.parseInt(commandsAndTokens[3]));
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    activationKey=activationKey.substring(0,Integer.parseInt(commandsAndTokens[1]))+activationKey.substring(Integer.parseInt(commandsAndTokens[2]));
                    System.out.println(activationKey);
                    break;
                default: break;
            }
            commands=scanner.nextLine();
        }
        System.out.println("Your activation key is: "+activationKey);
    }
}

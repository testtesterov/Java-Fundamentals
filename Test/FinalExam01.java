import java.util.Scanner;

public class FinalExam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        String line=scanner.nextLine();
        while (!line.equals("End")){
            String[] commands=line.split("\\s+");
            switch (commands[0]){
                case "Translate":
                    for (int i = 0; i < input.length(); i++) {
                        if(input.charAt(i)==commands[1].charAt(0)){
                            StringBuilder sb=new StringBuilder(input);
                            sb.setCharAt(i,commands[2].charAt(0));
                            input=sb.toString();
                        }
                    }
                    System.out.println(input);
                    break;
                case "Includes":
                    if(input.contains(commands[1])){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    if(input.substring(0,commands[1].length()).equals(commands[1])){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    input=input.toLowerCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    int f=-1;
                    for (int i = 0; i < input.length(); i++) {
                        if(commands[1].charAt(0)==input.charAt(i)){
                            f=i;
                        }
                    }
                    if(f>=0){
                        System.out.println(f);
                    }
                    break;
                case "Remove":
                    input=input.substring(0,Integer.parseInt(commands[1]))+input.substring(Integer.parseInt(commands[1])+Integer.parseInt(commands[2]));
                    System.out.println(input);
                    break;
                default: break;
            }
            line=scanner.nextLine();
        }
    }
}

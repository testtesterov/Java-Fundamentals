import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        StringBuilder newString=new StringBuilder();
        for(int i=0;i<line.length();i++){
            newString.append((char)(line.charAt(i)+3));
        }
        System.out.println(newString.toString());
    }

}

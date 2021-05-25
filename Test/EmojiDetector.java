import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        int pr=1;
        int totalEmojis=0;
        List<String> coolEmojis=new ArrayList<>();
        Pattern pattern=Pattern.compile("(::|\\*\\*)([A-Z][a-z]{2,})\\1");
        Matcher matcher= pattern.matcher(input);
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                pr*=Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        while(matcher.find()){
            totalEmojis++;
            int sum=0;
            for (int i = 0; i < matcher.group(2).length(); i++) {
                sum+=matcher.group(2).charAt(i);
            }
            if(sum>pr){
                coolEmojis.add(matcher.group());
            }
        }
        System.out.println("Cool threshold: "+pr);
        System.out.println(totalEmojis+" emojis found in the text. The cool ones are: ");
        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji);
        }
    }
}

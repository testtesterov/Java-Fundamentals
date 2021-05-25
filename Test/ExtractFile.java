import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        String substr=line.substring(line.lastIndexOf("\\")+1);
        String[] data=substr.split(",|\\.");
        System.out.println("File name: "+data[0]);
        System.out.println("File extension: "+data[1]);
    }
}

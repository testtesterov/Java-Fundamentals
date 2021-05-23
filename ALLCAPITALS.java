import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ALLCAPITALS {
    private static String INPUT_PATH="C:\\Users\\User\\IdeaProjects\\Fundamentals\\src\\streamsFilesAndDirectoriesExercise\\resources\\resources\\input.txt";
    private static String OUTPUT_PATH="C:\\Users\\User\\IdeaProjects\\Fundamentals\\src\\streamsFilesAndDirectoriesExercise\\resources\\resources\\output.txt";
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader(INPUT_PATH));
            PrintWriter writer= new PrintWriter(OUTPUT_PATH)){

            String line= reader.readLine();
            int vowelsCount=0;
            int consonantsCount=0;
            int punctuationCount=0;
            while (line!=null){

                for (int i = 0; i < line.length(); i++) {
                    if(line.charAt(i)=='a'||line.charAt(i)=='o'||line.charAt(i)=='e'||line.charAt(i)=='i'||line.charAt(i)=='u') vowelsCount++;
                    if(line.charAt(i)=='!'||line.charAt(i)=='?'||line.charAt(i)=='.'||line.charAt(i)==',') punctuationCount++;
                    if(line.charAt(i)!='a'&&line.charAt(i)!='o'&&line.charAt(i)!='e'&&line.charAt(i)!='i'&&line.charAt(i)!='u'&&line.charAt(i)!='?'&&line.charAt(i)!='!'&&line.charAt(i)!='.'&&line.charAt(i)!=','&&line.charAt(i)!=' ') consonantsCount++;
                }

                line=reader.readLine();
            }
            writer.println("Vowels: "+vowelsCount);
            writer.println("Consonants: "+consonantsCount);
            writer.println("Punctuation: "+punctuationCount);

        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }
}

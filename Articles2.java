import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Article> list=new ArrayList<>();
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String[] input=scanner.nextLine().split(", ");
            String title=input[0];
            String content=input[1];
            String author=input[2];
            Article article=new Article(title,content,author);
            list.add(article);
        }
        String sortBy=scanner.nextLine();
        switch (sortBy){
            case "title": list.stream().sorted((a1,a2) -> a1.getTitle().compareTo(a2.getTitle())).forEach(article -> System.out.println(article.toString()));
            break;
            case "content": list.stream().sorted((a1,a2) -> a1.getContent().compareTo(a2.getContent())).forEach(article -> System.out.println(article.toString()));
            break;
            case "author": list.stream().sorted((a1,a2) -> a1.getAuthor().compareTo(a2.getAuthor())).forEach(article -> System.out.println(article.toString()));
            break;
        }
    }
    static class Article{
        String title;
        String content;
        String author;

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void renameTitle(String title) {
            this.title = title;
        }

        public void editContent(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }
        public String toString(){
            return String.format("%s - %s: %s",title,content,author);
        }
    }

}

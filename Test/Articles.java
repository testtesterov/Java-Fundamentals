import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line=scanner.nextLine().split(", ");
        String title=line[0];
        String content=line[1];
        String author=line[2];
        Article article=new Article(title,content,author);
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String[] input=scanner.nextLine().split(": ");
            switch(input[0]){
                case "Edit" : article.editContent(input[1]);
                break;
                case "ChangeAuthor" : article.changeAuthor(input[1]);
                break;
                case "Rename" : article.renameTitle(input[1]);
                break;
            }
        }
        System.out.println(article.toString());
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

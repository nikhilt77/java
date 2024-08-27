import java.util.Scanner;
interface Searchable {
    boolean search(String keyword);
}
class Document implements Searchable{
  private String content;
  public Document(String content){
    this.content=content;
  }
  public boolean search(String keyword){
    return content.contains(keyword);
  }
}
class WebPage implements Searchable{
  private String content;
  public WebPage(String url,String content){
    this.content=content;
    
  }
  public boolean search(String keyword){
    return content.contains(keyword);
  }
}
public class Interfacer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String document = text;
        String str = in.nextLine();
        boolean documentContainsKeyword = document.contains(str);

        System.out.println("Document contains keyword: " +str+ " "+documentContainsKeyword);
        WebPage webPage = new WebPage("https://onlinecourses.nptel.ac.in", "This is a NPTEL online course webpage.");
        boolean webPageContainsKeyword = webPage.search("webpage");
        System.out.print("Webpage contains keyword 'webpage': " + webPageContainsKeyword);
    }
}

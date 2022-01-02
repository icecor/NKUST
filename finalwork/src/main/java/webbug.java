import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class webbug {
    public static void main(String[] args) {
        .YOUTUBE_API_KEY = "AIzaSyC-J2DsojsP0rwbRsfkmk58Pv6qVj0wcA0";
        try {
            Document doc = Jsoup.connect("https://www.youtube.com/").get();
            System.out.println(doc.title());
            Elements newsHeadlines = doc.select("#contents a");

            for (Element headline : newsHeadlines) {
               //System.out.println(headline.attr(("title")));
               System.out.println(headline.absUrl("href"));
            }
        }catch (Exception e) {

            System.out.println(e);

        }
   }
}

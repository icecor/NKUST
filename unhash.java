import java.util.ArrayList;
import java.util.List;

public class unhash {
    public static void main(String[] args) {

        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";

    public static String revHash(long hash) {
        List<Character> x = new ArrayList();
        StringBuilder y = new StringBuilder();

        while (true) {
            for (int i = 0; i < letters.length(); i++) {
                if ((hash - i) % 23 == 0) {
                    hash = (hash - letters.indexOf(i)) / 23;
                    x.add(letters.charAt(i));
                    break;
                }
            }
            if (hash == 7) {
                break;
            }
        }
        for (int i = x.size() - 1; i >= 0; i--) {
            y.append(x.get(i));

        }
           return (y.toString());
    }


    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}



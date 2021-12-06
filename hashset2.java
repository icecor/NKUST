import java.util.HashSet;

public class hashset2 {
    public static void main(String[] args) {
        HashSet<Integer> x =new HashSet<Integer>();
        x.add(0);
        x.add(0);
        x.add(1);
        x.add(1);
        x.add(1);
        x.add(2);
        x.add(2);
        x.add(3);
        x.add(3);
        x.add(4);

        System.out.println("("+x+")");
        System.out.println("有"+x.size()+"個整數");

    }
}

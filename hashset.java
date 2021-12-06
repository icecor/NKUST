import java.util.HashSet;
import java.util.Scanner;

public class hashset {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //Byte a =sc.nextByte();
        HashSet<Integer> x =new HashSet<Integer>();
        x.add(1);
        x.add(1);
        x.add(2);



        System.out.println("("+x+")");
        System.out.println("有"+x.size()+"個整數");



    }

}
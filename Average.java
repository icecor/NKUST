public class Average {
    public static void main(String[] args) {
        int[] X = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10};
        int result =  (X[0] + X[X.length - 1])* X.length / 2;
        System.out.println(result);
    }
}
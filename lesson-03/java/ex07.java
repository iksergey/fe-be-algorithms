public class ex07 {
    public static void main(String[] args) {
        int res = fact(5);
        System.out.println(res);
    }

    public static int fact(int n) {
        return (n == 0) ? 1 : n * fact(n - 1);
    }
}
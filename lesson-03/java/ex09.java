public class ex09 {
    static int count = 0;

    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            count = 0;
            f(n);
            System.out.println("Для n = " + n + ", count = " + (count + 1) + ", 2^" + n + " = " + Math.pow(2, n));
        }
    }

    public static void f(int n) {
        if (n <= 0)
            return;
        count++;
        f(n - 1);
        f(n - 1);
    }
}

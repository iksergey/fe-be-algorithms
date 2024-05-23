public class ex05 {
    static void printDown(int n) {
        System.out.println(n);
        if (n > 1) {
            printDown(n - 1);
        }
    }

    static String s = "";

    static void printUp(int n) {
        if (n < 10)
            printUp(n + 1);
        s = s + n + " ";
    }

    public static void main(String[] args) {
        // printDown(10);
        printUp(1);
        System.out.println(s);

    }
}

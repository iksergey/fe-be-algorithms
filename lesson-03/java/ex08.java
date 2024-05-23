public class ex08 {
    static int countRec = 0;
    static int countFor = 0;

    public static void main(String[] args) {
        for (int n = 1; n < 30; n++) {
            countRec = 0;
            countFor = 0;
            System.out.printf("fibRec(%d) %d countRec = %d\n", n, fibRec(n), countRec);
            System.out.println("fibFor(" + n + ") " + fibFor(n) + " countFor " + countFor + "\n");
        }
    }

    public static int fibRec(int n) {
        countRec++;
        return (n == 1 || n == 2) ? 1 : fibRec(n - 1) + fibRec(n - 2);
    }

    public static int fibFor(int n) {
        if (n == 1 || n == 2)
            return 1;
        int a1 = 1, a2 = 1;
        int aN = 0;
        for (int i = 2; i < n; i++) {
            countFor++;
            aN = a2 + a1;
            a1 = a2;
            a2 = aN;
        }
        return aN;
    }
}

public class Program2 {

    static int count = 0;

    static int get(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n; // 0(1)
            n /= 3; // 0(1)
            count++;
        }

        return sum;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 64; i++) {
            count = 0;
            get(i);
            System.out.printf("%d -> %d\n", i, count);
        }

    }
}

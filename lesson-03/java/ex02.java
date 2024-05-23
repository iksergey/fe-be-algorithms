public class ex02 {
    public static void main(String[] args) {
        int n = 10;
        int i = 0, j = 0, a = 0;

        for (i = n / 2; i < n; i++) {
            for (j = 2; j < n; j = j * 2) {
                a = a + n / 2;
            }
        }
        System.out.println("a = " + a);
    }
}
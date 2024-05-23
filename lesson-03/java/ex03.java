public class ex03 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                a = a + i + j;
            }
        }

        System.out.println("a = " + a);
    }
}
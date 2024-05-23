public class ex04 {
    public static void main(String[] args) {
        int n = 10;

        int a = 0, i = n;

        while (i > 0) {
            a = a + i;
            i = i / 2;
        }

        System.out.println("a = " + a);
    }
}
public class ex01 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int n = 5;

        if (n == 1)
            return;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("*");
                break;
            }
        }

    }
}
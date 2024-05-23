public class ex06 {
    public static void main(String[] args) {
        String result = printUp(1);
        System.out.println(result);
    }

    public static String printUp(int n) {
        if (n < 10) {
            return n + " " + printUp(n + 1);
        }
        return n + " ";
    }
}
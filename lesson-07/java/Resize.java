public class Resize {
    static int[] array = new int[0];
    static int index = 0;

    static void append(int item) {
        int n = array.length;
        if (index >= n) {
            int[] temp = new int[n == 0 ? 1 : 2 * n];
            for (int i = 0; i < n; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[index++] = item;
    }

    public static void main(String[] args) {
        int k = 5;
        double n = Math.pow(2, k) + 1;

        for (int i = 0; i <= n; i++) {
            System.out.printf("i: %d  index: %d  length: %d\n", i, index, array.length);
            append(i);
        }
    }
}

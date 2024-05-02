import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 2, 0, 1, 7, 0, 9, 5 };
        int i = 0, j = 0;
        System.out.println(Arrays.toString(array));

        while (i < array.length) {
            j = 0;
            while (j < array.length - 1 - i) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                j = j + 1;
            }
            i = i + 1;
        }

        System.out.println(Arrays.toString(array));

    }
}

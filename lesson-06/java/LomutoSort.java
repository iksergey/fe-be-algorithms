import java.util.Arrays;

public class LomutoSort {

    public static void lomutoSort(int[] items, int start, int end) {
        if (start < end) {
            int pivotIndex;
            int pos = items[end];
            int i = start;
            int j;
            for (j = start; j <= end - 1; j++) {
                if (items[j] < pos) {
                    int temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                    i++;
                }
            }
            int temp = items[i];
            items[i] = items[j];
            items[j] = temp;
            pivotIndex = i;
            lomutoSort(items, start, pivotIndex - 1);
            lomutoSort(items, pivotIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] col = { 4, 2, 6, 1, 6 };
        System.out.println(Arrays.toString(col));
        lomutoSort(col, 0, col.length - 1);
        System.out.println(Arrays.toString(col));
    }
}

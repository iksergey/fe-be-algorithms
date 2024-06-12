import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int n = 10;
        int[] col = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            col[i] = random.nextInt(10); // generate random numbers
        }

        System.out.println(Arrays.toString(col));
        System.out.println(Arrays.toString(Arrays.stream(col).sorted().toArray()) + " << expected");

        quickSort(col, 0, col.length - 1);
        System.out.println(Arrays.toString(col) + " << quick sort");
    }

    public static void quickSort(int[] collection, int left, int right) {
        int i = left;
        int j = right;

        int pivot = collection[(left + right) / 2];

        while (i <= j) {
            while (collection[i] < pivot)
                i++;
            while (collection[j] > pivot)
                j--;

            if (i <= j) {
                int temp = collection[i];
                collection[i] = collection[j];
                collection[j] = temp;
                i++;
                j--;
            }
        }

        if (i < right)
            quickSort(collection, i, right);
        if (left < j)
            quickSort(collection, left, j);
    }
}

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int n = 10;
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = random.nextInt(10);
        }
        int[] copy = Arrays.copyOf(original, original.length);

        System.out.println(Arrays.toString(original) + " <<< original");

        Arrays.sort(copy);
        System.out.println(Arrays.toString(copy) + " <<< expected");

        original = mergeSort(original);
        System.out.println(Arrays.toString(original) + " <<< mergeSort");

    }
}
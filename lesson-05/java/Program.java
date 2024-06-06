import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {
    private static boolean show = true;

    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println("a = " + Arrays.toString(a));

        int generation = 1;
        System.out.println(Arrays.toString(mergeSort(a, generation)) + " << merge sort");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a) + " << expected");
    }

    private static int[] mergeSort(int[] arr, int gen) {
        return mergeSort(arr, gen, "");
    }

    @SuppressWarnings("resource")
    private static int[] mergeSort(int[] arr, int gen, String sp) {
        if (arr.length < 2) {
            if (show)
                System.out.printf(
                        " %s %d: %s ! %n",
                        sp, gen, Arrays.toString(arr));
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        new Scanner(System.in).nextLine();
        if (show) {
            System.out.printf("%s %d: %s %n", sp,
                    gen, Arrays.toString(left));
            System.out.printf("%s %d: %s %n", sp,
                    gen, Arrays.toString(right));
        }

        return merge(mergeSort(left, gen + 1, sp + "  "), mergeSort(right, gen + 1, sp + "  "), gen, sp + "  ");
    }

    private static int[] merge(int[] left, int[] right, int gen, String sp) {
        new Scanner(System.in).nextLine();
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while (i < left.length)
            result[k++] = left[i++];
        while (j < right.length)
            result[k++] = right[j++];

        if (show)
            System.out.printf("%s %d: %s %n", sp,
                    gen, Arrays.toString(result));
        return result;
    }
}
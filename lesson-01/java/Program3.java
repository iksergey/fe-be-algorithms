public class Program3 {

    public static void main(String[] args) {
        int n = 123;
        int[] array = new int[n];
        int max = array[0];
        int index = 0;

        while (index < array.length) {
            if (array[index] > max) {
                max = array[index];
            } else {

            }
            index = index + 1;
        }

        System.out.println(max);
    }
}
public class Program1 {

    // f(n) g(4)
    // O(1) + O(1) + O(1) + O(n) + O(1) = O(n)+O(4)
    // O(1) + O(1) + O(1) + O(n) + O(1) = O(2*n)
    // O(2000*n) => O(n)
    public static int sumItems(int[] array) {
        int index = 0; // O(1)
        int sum = 0; // O(1)
        int n = array.length;// O(1)

        // O(n) * O(2) = O(n*2) = O(2*n)
        while (index < n) { // O(n)
            // O(2)
            sum += array[index]; // O(1)
            index += 1; // O(1)
        }

        return sum; // O(1)
    }

    public static void main(String[] args) {

    }
}

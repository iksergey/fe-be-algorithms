
public class RubberArrayRun {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();
        for (int i = 1; i <= 5; i++) {
            ra.append(i * 10);
        }
        System.out.println(ra); // [10 20 30 40 50]
        ra.remove(20);
        System.out.println(ra); // [10 30 40 50]

    }
}

class RubberArray {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 2;

    public RubberArray() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void append(int element) {
        ensureCapacity();
        array[size++] = element;
    }

    public void appendRange(int[] elements) {
        ensureCapacity(size + elements.length);
        System.arraycopy(elements, 0, array, size, elements.length);
        size += elements.length;
    }

    public void remove(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                removeAt(i);
                break;
            }
        }
    }

    public void removeAt(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(array, position + 1, array, position, size - position - 1);
        size--;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = copyArray(array, newCapacity);
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > array.length) {
            int newCapacity = Math.max(minCapacity, array.length * 2);
            array = copyArray(array, newCapacity);
        }
    }

    private int[] copyArray(int[] original, int newCapacity) {
        int[] newArray = new int[newCapacity];
        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        return newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

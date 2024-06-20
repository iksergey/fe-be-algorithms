import java.util.Arrays;

public class MyStackRun {
    public static void main(String[] args) {
        MyStack ms = new MyStack(10);
        System.out.println(ms);
        ms.push(10);
        ms.push(20);
        ms.push(30);

        System.out.println(ms);
        System.out.println(ms.peek());
        System.out.println(ms.peek());
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms);

        System.out.println(ms.pop());
        System.out.println(ms);
    }

}

class MyStack {
    int[] storage;
    int index;

    public MyStack(int size) {
        this.storage = new int[size];
        this.index = 0;
    }

    public void push(int val) {
        storage[index++] = val;
    }

    public int pop() {
        return storage[--index];
    }

    public int peek() {
        return storage[index - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(storage, 0, index));
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class MyQueueRun {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue(3);
        System.out.println(mq); // []
        mq.enqueue(10);
        System.out.println(mq); // 10

        mq.enqueue(20);
        System.out.println(mq); // 10 20

        mq.enqueue(30);
        System.out.println(mq); // 10 20 30

        System.out.println(mq.dequeue()); // 10
        System.out.println(mq); // 20 30

        mq.enqueue(40);
        System.out.println(mq); // 20 30 40
        System.out.println(mq.dequeue()); // 20
        System.out.println(mq.dequeue()); // 30
        System.out.println(mq.dequeue()); // 40
        mq.enqueue(50);
        System.out.println(mq); // 50
        System.out.println(mq.dequeue()); // 50

        System.out.println(mq); // []
    }
}

class MyQueue {
    int count;
    int[] storage;
    int head;
    int tail;
    int size;

    public MyQueue(int size) {
        this.storage = new int[size];
        this.size = size;
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    public void enqueue(int val) {
        if (count >= size)
            throw new RuntimeException("очередь переполнена");
        count++;
        storage[head++] = val;
        head %= size;
        // head = head % size;
        // if (head >= size)
        // head = 0;
    }

    public int dequeue() {
        if (count == 0)
            throw new RuntimeException("очередь пуста");
        count--;
        int temp = storage[tail++];
        tail %= size;
        // tail = tail % size;
        // if (tail >= size)
        // tail = 0;
        return temp;
    }

    public int peek() {
        return head > tail
                ? storage[head - 1]
                : storage[tail - 1];
    }

    @Override
    public String toString() {
        if (count == 0)
            return "[]";
        if (head > tail) {
            return Arrays.toString(Arrays.copyOfRange(storage, tail, head));
        } else {
            ArrayList<Integer> t = new ArrayList<>();
            for (int i = tail; i < storage.length; i++) {
                t.add(storage[i]);
            }
            for (int i = 0; i < head; i++) {
                t.add(storage[i]);
            }
            return t.toString();
        }
    }
}

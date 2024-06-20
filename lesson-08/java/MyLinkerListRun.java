public class MyLinkerListRun {
    public static void main(String[] args) {
        MyLinkerList ll = new MyLinkerList();
        for (int i = 1; i <= 5; i++) {
            ll.append(i * 10);
        }
        System.out.println(ll);
        ll.remove(20);
        System.out.println(ll);
    }
}

class MyLinkerList {
    private Node head;
    private int size;

    private static class Node {
        int value;
        Node next;

        Node(int data) {
            this.value = data;
            this.next = null;
        }
    }

    public MyLinkerList() {
        head = null;
        size = 0;
    }

    public void append(int item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public void appendRange(int... items) {
        for (int value : items) {
            append(value);
        }
    }

    public void remove(int data) {
        if (head == null)
            return;

        if (head.value == data) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.value != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    public void removeAt(int position) {
        if (position < 0 || position >= size)
            return;

        if (position == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public int size() {
        return size;
    }

    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.value == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        Node current = head;
        StringBuilder out = new StringBuilder();
        while (current != null) {
            out.append(current.value + " ");
            current = current.next;
        }
        return "[" + out.toString().trim() + "]";
    }
}

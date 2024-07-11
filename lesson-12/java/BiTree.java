import java.util.Random;

public class BiTree {

    public static void main(String[] args) {
        Node root = build(9);
        print(root, "");

    }

    static int t = 0;
    static Random random = new Random();

    static Node build(int count) {
        Node node = null;

        if (count > 0) {
            // node = new Node(random.nextInt(100));
            t += 1;
            node = new Node(t);
            node.left = build(count / 2);
            node.right = build(count - count / 2 - 1);
        }

        return node;
    }

    static void print(Node root, String sp) {
        if (root != null) {
            System.out.println(sp + root.value);
            print(root.left, sp + "  ");
            print(root.right, sp + "  ");
        }
    }
}

class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

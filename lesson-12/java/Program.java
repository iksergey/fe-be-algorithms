
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Node city2 = new Node(2);
        Node city6 = new Node(6);
        Node city5 = new Node(5);
        Node city4 = new Node(4);
        Node city3 = new Node(3);

        Node city1 = new Node(1);

        city2.append(city1);
        city2.append(city5);

        city5.append(city3);
        city5.append(city6);
        city5.append(city4);

        print(city2, "");
    }

    public static void print(Node root, String sp) {
        if (root != null) {
            System.out.println(sp + root.value);

            if (root.children.size() != 0) {
                for (int i = 0; i < root.children.size(); i++) {
                    print(root.children.get(i), sp + "  ");
                }
            }
        }
    }
}

class Node {
    int value;
    public ArrayList<Node> children;

    public Node(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void append(Node node) {
        this.children.add(node);
    }

}

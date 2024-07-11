class Node {
    constructor(value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

const print = (root, sp = "") => {
    if (root !== null) {
        console.log(sp + root.value);
        print(root.left, sp + "  ");
        print(root.right, sp + "  ");
    }
}

var t = 0;
const build = (count) => {
    let node = null;

    if (count > 0) {
        // node = new Node(Math.floor(Math.random() * 100));
        t += 1;
        node = new Node(t);
        node.left = build(Math.floor(count / 2));
        node.right = build(count - Math.floor(count / 2) - 1);
    }

    return node;
}

const root = build(9);
print(root);

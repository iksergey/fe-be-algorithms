class Node {
    constructor(value) {
        this.value = value;
        this.children = [];

    }

    append = (node) => {
        this.children.push(node);
    }
}

const print = (root, sp = "") => {
    if (root !== null) {
        console.log(sp + root.value);

        if (root.children.length !== 0) {
            root.children.forEach(tree => {
                print(tree, sp + "  ");
            });
        }
    }
}

const city2 = new Node(2);
const city6 = new Node(6);
const city5 = new Node(5);
const city4 = new Node(4);
const city3 = new Node(3);

const city1 = new Node(1);

city2.append(city1);
city2.append(city5);

city5.append(city3);
city5.append(city6);
city5.append(city4);


print(city2);

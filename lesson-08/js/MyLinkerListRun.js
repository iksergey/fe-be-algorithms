class Node {
    constructor(data) {
        this.value = data;
        this.next = null;
    }
}

class MyLinkerList {
    constructor() {
        this.head = null;
        this.size = 0;
    }

    append(item) {
        const node = new Node(item);
        if (this.head === null) {
            this.head = node;
        } else {
            let current = this.head;
            while (current.next !== null) {
                current = current.next;
            }
            current.next = node;
        }
        this.size++;
    }

    appendRange(...items) {
        for (const value of items) {
            this.append(value);
        }
    }

    remove(data) {
        if (this.head === null) return;

        if (this.head.value === data) {
            this.head = this.head.next;
            this.size--;
            return;
        }

        let current = this.head;
        while (current.next !== null && current.next.value !== data) {
            current = current.next;
        }

        if (current.next !== null) {
            current.next = current.next.next;
            this.size--;
        }
    }

    removeAt(position) {
        if (position < 0 || position >= this.size) return;

        if (position === 0) {
            this.head = this.head.next;
        } else {
            let current = this.head;
            for (let i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        this.size--;
    }

    get(index) {
        if (index < 0 || index >= this.size) throw new Error("Index out of bounds");

        let current = this.head;
        for (let i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    size() {
        return this.size;
    }

    contains(data) {
        let current = this.head;
        while (current !== null) {
            if (current.value === data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    toString() {
        let current = this.head;
        const out = [];
        while (current !== null) {
            out.push(current.value);
            current = current.next;
        }
        return `[${out.join(" ")}]`;
    }
}

const main = () => {
    const ll = new MyLinkerList();
    for (let i = 1; i <= 5; i++) {
        ll.append(i * 10);
    }
    console.log(ll.toString());
    ll.remove(20);
    console.log(ll.toString());
}

main();

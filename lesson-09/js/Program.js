class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedStorage {
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
        items.forEach(item => this.append(item));
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
        if (index < 0 || index >= this.size)
            throw new RangeError('Index out of bounds');

        let current = this.head;
        for (let i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    count() {
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
        let out = [];
        while (current !== null) {
            out.push(current.value);
            current = current.next;
        }
        return `[${out.join(' ')}]`;
    }
}

const main = () => {
    const storage = new LinkedStorage();
    storage.append(1);
    storage.append(2);
    storage.appendRange(3, 4, 5);
    console.log(storage.toString()); // [1 2 3 4 5]

    storage.remove(3);
    console.log(storage.toString()); // [1 2 4 5]

    storage.removeAt(1);
    console.log(storage.toString()); // [1 4 5]

    console.log(storage.get(1)); // 4

    console.log(storage.count()); // 3

    console.log(storage.contains(4)); // true
    console.log(storage.contains(3)); // false
}

main();

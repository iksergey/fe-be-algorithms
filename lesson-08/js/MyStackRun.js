class MyStack {
    constructor(size) {
        this.storage = new Array(size);
        this.index = 0;
    }

    push(val) {
        this.storage[this.index++] = val;
    }

    pop() {
        return this.storage[--this.index];
    }

    peek() {
        return this.storage[this.index - 1];
    }

    toString() {
        return `[${this.storage.slice(0, this.index).join(", ")}]`;
    }
}

const main = () => {

    const ms = new MyStack(10);
    console.log(ms.toString()); // []
    ms.push(10);
    ms.push(20);
    ms.push(30);

    console.log(ms.toString()); // [10, 20, 30]
    console.log(ms.peek()); // 30
    console.log(ms.peek()); // 30
    console.log(ms.peek()); // 30
    console.log(ms.pop()); // 30
    console.log(ms.toString()); // [10, 20]

    console.log(ms.pop()); // 20
    console.log(ms.toString()); // [10]
}

main();

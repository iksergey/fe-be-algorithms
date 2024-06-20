
class MyQueue {
    constructor(size) {
        this.storage = new Array(size);
        this.size = size;
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    enqueue(val) {
        if (this.count >= this.size) {
            throw new Error("Очередь переполнена");
        }
        this.count++;
        this.storage[this.head++] = val;
        this.head %= this.size;
    }

    dequeue() {
        if (this.count === 0) {
            throw new Error("Очередь пуста");
        }
        this.count--;
        const temp = this.storage[this.tail++];
        this.tail %= this.size;
        return temp;
    }

    peek() {
        return this.head > this.tail
            ? this.storage[this.head - 1]
            : this.storage[this.tail - 1];
    }

    toString() {
        if (this.count === 0) {
            return "[]";
        }
        if (this.head > this.tail) {
            return `[${this.storage.slice(this.tail, this.head).join(", ")}]`;
        } else {
            const t = [...this.storage.slice(this.tail), ...this.storage.slice(0, this.head)];
            return `[${t.join(", ")}]`;
        }
    }
}

const main = () => {

    // Пример использования
    const mq = new MyQueue(3);
    console.log(mq.toString()); // []
    mq.enqueue(10);
    console.log(mq.peek());
    console.log(mq.peek());
    console.log(mq.peek());
    console.log(mq.peek());
    console.log(mq.peek());
    console.log(mq.toString()); // [10]

    mq.enqueue(20);
    console.log(mq.toString()); // [10, 20]

    mq.enqueue(30);
    console.log(mq.toString()); // [10, 20, 30]

    console.log(mq.dequeue()); // 10
    console.log(mq.toString()); // [20, 30]

    mq.enqueue(40);
    console.log(mq.toString()); // [20, 30, 40]
    console.log(mq.dequeue()); // 20
    console.log(mq.dequeue()); // 30
    console.log(mq.dequeue()); // 40
    mq.enqueue(50);
    console.log(mq.toString()); // [50]
    console.log(mq.peek());
    console.log(mq.peek());
    console.log(mq.peek());
    console.log(mq.peek());
    console.log(mq.dequeue()); // 50

    console.log(mq.toString()); // []

}

main();

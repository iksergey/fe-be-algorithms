class RubberArray {
    static DEFAULT_CAPACITY = 2;

    constructor() {
        this.array = new Array(RubberArray.DEFAULT_CAPACITY);
        this.size = 0;
    }

    append(element) {
        this.ensureCapacity(this.size + 1);
        this.array[this.size++] = element;
    }

    appendRange(elements) {
        const requiredCapacity = this.size + elements.length;
        this.ensureCapacity(requiredCapacity);
        for (let i = 0; i < elements.length; i++) {
            this.array[this.size++] = elements[i];
        }
    }

    remove(element) {
        const index = this.array.indexOf(element);
        if (index !== -1) {
            this.removeAt(index);
        }
    }

    removeAt(position) {
        if (position < 0 || position >= this.size) {
            throw new Error("Неверный индекс");
        }
        for (let i = position; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.size--;
    }

    get(index) {
        if (index < 0 || index >= this.size) {
            throw new Error("Неверный индекс");
        }
        return this.array[index];
    }

    size() {
        return this.size;
    }

    contains(element) {
        return this.array.indexOf(element) !== -1;
    }

    ensureCapacity(minCapacity) {
        const currentCapacity = this.array.length;
        if (minCapacity > currentCapacity) {
            const newCapacity = Math.max(minCapacity, currentCapacity * 2);
            this.array = this.copyArray(newCapacity);
        }
    }

    copyArray(newCapacity) {
        const newArray = new Array(newCapacity);
        for (let i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }
        return newArray;
    }

    toString() {
        return `[${this.array.slice(0, this.size).join(" ")}]`;
    }
}

const main = () => {
    const ra = new RubberArray();
    for (let i = 1; i <= 5; i++) {
        ra.append(i * 10);
    }
    console.log(ra.toString()); // [10 20 30 40 50]
    ra.remove(20);
    console.log(ra.toString()); // [10 30 40 50]

}

main();

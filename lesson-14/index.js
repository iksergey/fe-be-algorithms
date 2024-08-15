const check1 = (items) => {
    const temp = [];

    for (let index = items.length - 1; index >= 0; index--) {
        const element = items[index];
        temp.push(element);
    }

    let flag = true;

    for (let index = 0; index < items.length; index++) {
        const elementInA = items[index];
        const elementInB = temp[index];
        if (elementInA !== elementInB) {
            return false;
        }
    }

    return true;
}

const check2 = (items) => {
    const count = Math.floor(items.length / 2);

    for (let index = 0; index < count; index++) {
        let left = items[index];
        let right = items[items.length - 1 - index];
        if (left !== right) {
            return false;
        }
    }

    return true;
}


console.log(check2([1, 2, 3, 2, 1]));
console.log(check2([1, 2, 2, 1]));
console.log(check2([1, 3, 2, 1]));
console.log(check2([]));


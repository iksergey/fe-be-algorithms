const printUp = (n) => {
    if (n < 10) {
        return n + " " + printUp(n + 1);
    }
    return n + " ";
}

const result = printUp(1);
console.log(result);


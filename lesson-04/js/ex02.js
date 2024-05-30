const powRec = (a, b) => {
    if (b === 0) return 1;
    else if (b % 2 === 1) return a * powRec(a, b - 1);
    else return powRec(a * a, Math.floor(b / 2));
}

const powWhile = (a, b) => {
    let result = BigInt(1);

    while (b > 0) {
        if (Number(b) % 2 === 1) {
            result = result * a;
        }
        a *= a;
        b = Math.floor(Number(b) / 2);
    }
    return result;
}
// BigInt
let a = BigInt(1);
console.log(typeof a);
// console.log(powRec(2, 100000));
console.log(powWhile(BigInt(2), BigInt(10000)));
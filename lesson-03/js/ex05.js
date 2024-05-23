function printDown(n) {
    console.log(n);
    if (n > 1) printDown(n - 1);
}
// printDown(10);
let s = "";
const printUp = (n) => {
    if (n < 10) {
        printUp(n + 1);
    }
    s = s + n + " ";
}

printUp(1);
console.log(s);

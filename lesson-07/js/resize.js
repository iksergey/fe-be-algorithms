var array = Array(0);
var index = 0; // 3

const append = (item) => {
    var n = array.length;
    if (index >= n) {
        const temp = Array(n === 0 ? 1 : 2 * n);
        for (let i = 0; i < index; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
    array[index++] = item;
}

const main = () => {
    const k = 5;
    const n = Math.pow(2, k) + 1;

    for (let i = 0; i <= n; i++) {
        console.log(`i: ${i}  index: ${index}  length: ${array.length}`);
        append(i);
    }
}

main();

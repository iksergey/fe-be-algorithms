
const quickSort = (collection, left, right) => {
    let i = left;
    let j = right;

    let pivot = collection[parseInt((left + right) / 2)];

    while (i <= j) {
        while (collection[i] < pivot) i++;
        while (collection[j] > pivot) j--;

        if (i <= j) {
            let temp = collection[i];
            collection[i] = collection[j];
            collection[j] = temp;
            i++;
            j--;
        }
    }

    if (i < right) quickSort(collection, i, right);
    if (left < j) quickSort(collection, left, j);


}

const random = (max = 10) => Math.floor(Math.random() * max);

const n = 10;
let col = Array(n).fill(0).map(e => random());

console.log(`${col}`);
console.log(`${col.sort((x, y) => x - y)} << expected`);

quickSort(col, 0, col.length - 1);
console.log(`${col} << quick sort`);

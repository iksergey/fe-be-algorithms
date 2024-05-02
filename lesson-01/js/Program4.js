const array = [3, 2, 0, 1, 7, 0, 9, 5];
let i = 0, j = 0;
console.log(array);

while (i < array.length) {
    j = 0;
    while (j < array.length - 1 - i) {
        if (array[j] > array[j + 1]) {
            let temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
        j = j + 1;
    }
    i = i + 1;
}

console.log(array);

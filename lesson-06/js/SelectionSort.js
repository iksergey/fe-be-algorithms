function selectionSort(arr) {
    let length = arr.length;

    for (let i = 0; i < length - 1; i++) {
        let minIndex = i;

        for (let j = i + 1; j < length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }

        let temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

const main = () => {
    let arr = [1, 6, 2, 9, 3];
    console.log(arr);
    selectionSort(arr);
    console.log(arr);
}

main();

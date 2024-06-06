const mergeSort = (arr) => {
    if (arr.length < 2) return arr;
    const mid = Math.floor(arr.length / 2);
    const left = arr.slice(0, mid);
    const right = arr.slice(mid);
    return merge(mergeSort(left), mergeSort(right));
}

const merge = (left, right) => {
    const result = [];
    while (left.length !== 0 && right.length !== 0) {
        if (left[0] <= right[0]) result.push(left.shift());
        else result.push(right.shift());
    }
    while (left.length !== 0) result.push(left.shift());
    while (right.length !== 0) result.push(right.shift());
    return result;
}

const main = () => {
    const random = (max = 10) => Math.floor(Math.random() * max);

    const n = 10;
    const original = Array(n).fill(0).map(e => random());

    console.log(`[${original}] <<< original`);
    console.log(`[${original.sort((x, y) => x - y)}] <<< expected`);

    mergeSort(original);
    console.log(`[${mergeSort(original)}] <<< merge sort`);
};

main();

const lomutoSort = (items, start, end) => {
    if (start < end) {
        let pivotIndex;
        let pos = items[end];
        let i = start;
        let j;
        for (j = start; j <= end - 1; j++) {
            if (items[j] < pos) {
                let temp = items[i];
                items[i] = items[j];
                items[j] = temp;
                i++;
            }
        }
        let temp = items[i];
        items[i] = items[j];
        items[j] = temp;
        pivotIndex = i;
        lomutoSort(items, start, pivotIndex - 1);
        lomutoSort(items, pivotIndex + 1, end);
    }
}

const main = () => {
    let col = [4, 2, 6, 1, 6];
    console.log(col);
    lomutoSort(col, 0, col.length - 1);
    console.log(col);
}

main();

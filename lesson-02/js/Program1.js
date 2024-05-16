const sumItems = (array) => {
    let index = 0;
    let sum = 0;

    while (index < array.length) {
        sum += array[index];
        index += 1;
    }

    return sum;
}
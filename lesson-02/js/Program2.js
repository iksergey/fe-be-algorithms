let count = 0;
const get = (n) => {
    let sum = 0;

    while (n > 0) {
        sum += n;
        n = Math.floor(n / 2);
        count++;
    }

    return sum;
}

count = 0;
get(100);
console.log(count);

count = 0;
get(1000);
console.log(count);

count = 0;
get(10000);
console.log(count);
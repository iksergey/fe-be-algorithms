// Пример поможет пролить свет на 2^n
let count = 0;
const f = (n) => {
    if (n <= 0) return;
    count += 1;
    f(n - 1) + f(n - 1)
}

for (let n = 1; n <= 10; n++) {
    count = 0;
    f(n);
    console.log(`Для n = ${n}, count = ${count + 1}, 2^${n}= ${2 ** (n)}`);
}
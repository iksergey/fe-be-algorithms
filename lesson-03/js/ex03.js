let n = 10;
let a = 0;

for (let i = 0; i < n; i += 1) {
    for (let j = n; j > i; j -= 1) {
        a = a + i + j
    }
}

console.log(a);
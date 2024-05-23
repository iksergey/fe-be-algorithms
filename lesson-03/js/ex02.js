let n = 10;

let i = 0, j = 0, a = 0;
for (i = Math.floor(n / 2); i < n; i++) {
    for (j = 2; j < n; j = j * 2) {
        a = a + n / 2;
    }
}

console.log(a);
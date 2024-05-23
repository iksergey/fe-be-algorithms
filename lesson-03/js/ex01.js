let n = 5;

if (n === 1) return;

for (let i = 0; i < n; i++) {// O(n)
    for (let j = 0; j < n; j++) { // O(1)
        console.log('*');
        break;
    }
}

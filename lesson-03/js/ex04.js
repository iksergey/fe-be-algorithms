let n = 10;
let a = 0, i = n;

i = n;
while (i > 0) {
    a = a + i;
    i = Math.floor(i / 2);  // Используем Math.floor для целочисленного деления
}

console.log("a =", a);

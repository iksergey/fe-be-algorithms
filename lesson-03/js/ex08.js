let countRec = 0;
function fibRec(n) {
    countRec += 1;
    return (n === 1 || n === 2)
        ? 1
        : fibRec(n - 1) + fibRec(n - 2);
}

let countFor = 0;
function fibFor(n) {
    if (n === 1 || n === 2) return 1;
    let a1 = 1, a2 = 1;
    let aN = 0;
    for (let i = 2; i < n; i++) {
        countFor += 1;
        aN = a2 + a1;
        a1 = a2;
        a2 = aN;
    }
    return aN;
}

for (let n = 1; n < 30; n++) {
    countRec = 0;
    countFor = 0;
    console.log(`fibRec(${n}) ${fibRec(n)} countRec ${countRec}`);
    console.log(`fibFor(${n}) ${fibFor(n)} countFor ${countFor} \n`);

}
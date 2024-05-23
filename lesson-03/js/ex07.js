// 
// const fact = (n) => {
//     if (n === 0) {
//         return 1;
//     }
//     else {
//         return n * fact(n - 1);
//     }
// }

const fact = (n) => n === 0 ? 1 : n * fact(n - 1)

const res = fact(5);
console.log(res);
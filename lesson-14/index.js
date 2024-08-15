const check1 = (items) => {
    const temp = [];

    for (let index = items.length - 1; index >= 0; index--) {
        const element = items[index];
        temp.push(element);
    }

    let flag = true;

    for (let index = 0; index < items.length; index++) {
        const elementInA = items[index];
        const elementInB = temp[index];
        if (elementInA !== elementInB) {
            return false;
        }
    }

    return true;
}

const check2 = (items) => {
    const count = Math.floor(items.length / 2);

    for (let index = 0; index < count; index++) {
        let left = items[index];
        let right = items[items.length - 1 - index];
        if (left !== right) {
            return false;
        }
    }

    return true;
}


console.log(check2([1, 2, 3, 2, 1]));
console.log(check2([1, 2, 2, 1]));
console.log(check2([1, 3, 2, 1]));
console.log(check2([]));


var isPalindrome1 = function (s) {
    const cleanStr = s.toLowerCase().replace(/[^a-z0-9]/g, ''); // O(2n) -> O(n)
    const newStr = cleanStr.split('').reverse().join(''); // O(2.5n) -> O(n)
    return cleanStr === newStr; // O(n)
};

function isPalindrome2(s) {
    s = s.toLowerCase().replace(/[^a-z0-9]/g, '')

    let left = 0;
    let right = s.length - 1;

    while (left < right) {
        if (s[left] !== s[right]) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}


let str = "amanaplanacanalpanama";


// split('')
const mySplit = (s) => {
    const arr = [];
    for (let index = 0; index < s.length; index++) {
        arr.push(s[index]);
    }
    return arr;
}

// reverse()
const myReverse = (arr) => {
    for (let index = 0; index < Math.floor(arr.length / 2); index++) {
        const temp = arr[index];
        arr[index] = arr[arr.length - 1 - index];
        arr[arr.length - 1 - index] = temp;
    }
    return arr;
}

// join('')
const myJoin = (arr) => {
    let result = '';
    for (let index = 0; index < arr.length; index++) {
        const temp = arr[index];
        result = result + temp;
    }
    return result;
}

const s1 = "12343";
const s2 = myJoin(myReverse(mySplit(s1)));

console.log(s1);
console.log(s2);

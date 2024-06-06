const isAlphabetic = (char) => {
    const code = char.charCodeAt(0);
    return (code >= 65 && code <= 90) || (code >= 97 && code <= 122);
}

const isPalindrome = (string) => {
    let left = 0;
    let right = string.length - 1;

    while (left < right) {
        while (!isAlphabetic(string[left])) {
            left++;
        }
        while (!isAlphabetic(string[right])) {
            right--;
        }
        console.log(`${string[left]} <<< ${left}`);
        console.log(`${string[right]} <<< ${right}`);
        if (string[left].toLowerCase() !== string[right].toLowerCase()) {
            return false;
        }

        left++;
        right--;
    }

    return true;
}

const main = () => {
    const testString = "a man, a plan, a canal, panama!";
    console.log(isPalindrome(testString));
}

main();
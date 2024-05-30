const map = [
    [0, 0, 0, 0, 0, 0, 0, 0],
    [0, 0, 1, 1, 0, 1, 1, 0],
    [0, 1, 0, 0, 1, 0, 0, 1],
    [0, 1, 0, 0, 0, 0, 1, 0],
    [0, 0, 1, 0, 0, 1, 0, 0],
    [0, 0, 0, 1, 1, 0, 0, 0],
    [0, 0, 0, 0, 0, 0, 0, 0],
    [0, 0, 0, 0, 0, 0, 0, 0],
];

const print = (x, y) => {
    for (let i = 0; i < map.length; i++) {
        const line = map[i];
        let outStr = "";
        for (let j = 0; j < line.length; j++) {
            const item = map[i][j];
            if (x === i && y === j) {
                outStr += "@";
                continue;
            }
            if (item == 0) {
                outStr += " ";
            } else {
                outStr += "█";
            }
        }
        console.log(outStr);
    }
}

const draw = (x, y) => {
    print(x, y);
    if (map[x][y] === 0) {
        map[x][y] = 1;
        draw(x - 1, y);
        draw(x, y + 1);
        draw(x + 1, y);
        draw(x, y - 1);
    }
}


draw(2, 2);

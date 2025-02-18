// 백준 2839번 실버4 설탕배달 문제
let input = Number(require('fs').readFileSync('./input.txt'));

let bag = 0;
let sugar = input;

while (true) {
    if (sugar % 5 === 0) {
        console.log(sugar / 5 + bag);
        break;
    }

    if (0 > sugar ) {
        console.log(-1);
        break;
    }

    bag++;
    sugar -= 3;
}
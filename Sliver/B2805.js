// 백준 2805번 실버2 나무 자르기
const fs = require('fs');

let input = fs.readFileSync('./input.txt', 'utf-8').trim().split('\n');

let [N, H] = input[0].split(' ').map(Number);
let Trees = input[1].split(' ').map(Number);
let MaxT = Math.max(...Trees);

function search(H, Trees, min , max) {
    let mid = 0;
    let bestCut = 0;

    while(min <= max) {
        let sumWood = 0;
        mid = Math.floor((min + max) / 2);
        Trees.forEach((t) => {
            let rest = t - mid;
            if (rest > 0) sumWood += rest;
        });
        if (sumWood >= H) {
            if (mid > bestCut) {
                bestCut = mid;
            }
            min = mid + 1;
        }
        else {
            max = mid - 1;
        }
    }
    return bestCut;
}

const result = search(H, Trees, 0, MaxT);
console.log(result);
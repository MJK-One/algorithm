// 백준 1015번 실버4 수열
const fs = require('fs');
let input = fs.readFileSync('./input.txt', 'utf-8').trim().split('\n');

let N = Number(input[0])
let A = input[1].split(' ').map(Number);

function find(N,A) {
    const indexedArray = A.map((value, index) => [value, index]);

    indexedArray.sort((a, b) => {
        if(a[0] === b[0]) {
            return a[1] - b[1]
        } 
        return a[0] - b[0]
    })

    const P = new Array(N);
    for (let i = 0; i < N; i++) {
        P[indexedArray[i][1]] = i; 
    }

    return P;
}

console.log(find(N, A).join(' '));
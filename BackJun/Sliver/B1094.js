// 백준 1094번 실버5 막대기
let input = Number(require('fs').readFileSync('./input.txt'));

let x = input;
let stick = 64;
const arr = [];
let count = 0;

if(x < stick) {
    while(true) {
        stick /= 2;
        if(x >= stick) {
            count++;
            x -= stick;
            if(x == 0) {
                console.log(count);
                break;
            }
        }
    } 
}

if(x == stick){
    console.log(1);
}
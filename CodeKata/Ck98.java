import java.util.Arrays;
import java.util.Stack;

class Ck98 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        return answer;
    }
}
// 시간 초과
// class Ck98 {
//     public int[] solution(int[] numbers) {
//         int[] answer = {};
        
//         for (int i = 0; i < numbers.length; i++) {
//             boolean updated = false; 
//             for (int j = i + 1; j < numbers.length; j++) {
//                 if (numbers[i] < numbers[j]) {
//                     numbers[i] = numbers[j];
//                     updated = true;
//                     break;
//                 }
//             }
//             if (!updated) { 
//                 numbers[i] = -1;
//             }
//         }
//         numbers[numbers.length-1] = -1;
        
//         answer = numbers;
//         return answer;
//     }
// }
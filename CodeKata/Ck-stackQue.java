// Ck 91 스택/큐 기능개발
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 1. 각 작업의 배포 가능일 계산
        int[] day = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            day[i] = (remain / speeds[i]) + (remain % speeds[i] > 0 ? 1 : 0);
        }
        
        // 2. 배포 개수 세기
        List<Integer> answerList = new ArrayList<>();
        
        int prevMaxDay = day[0];
        int count = 1;
        
        for(int i = 1; i < day.length; i++) {
            if(day[i] <= prevMaxDay) {
                count++;
            } else {
                answerList.add(count);
                count = 1;
                prevMaxDay = day[i];
            }
        }
        answerList.add(count); 
        
        // 3. 리스트를 배열로 변환
        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}

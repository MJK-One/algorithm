import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Ck57 {
    public int[] solution(int[] answers) {
        int[] scores = new int[3];
        
        int[] mathGiveUp1 = {1, 2, 3, 4, 5};
        int[] mathGiveUp2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] mathGiveUp3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        scores[0] = check(answers, mathGiveUp1);
        scores[1] = check(answers, mathGiveUp2);
        scores[2] = check(answers, mathGiveUp3);
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                result.add(i + 1);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    public static int check(int[] answers, int[] check) {
        int correct = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == check[i % check.length]) {
                correct++;
            }
        }
        
        return correct;
    }
}
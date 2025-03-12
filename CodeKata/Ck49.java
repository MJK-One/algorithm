import java.util.*;

public class Ck49 {
    public int[] solution(int[] numbers) {
        int numle = numbers.length;
        int[] temp = new int[numle * (numle - 1) / 2];
        int idx = 0;
    
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp[idx++] = numbers[i] + numbers[j];
            }
        }
    
        int[] answer = Arrays.stream(temp).distinct().sorted().toArray();
    
        return answer;
    }
} 
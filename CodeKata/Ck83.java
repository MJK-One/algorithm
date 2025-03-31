import java.util.*;

public class Ck83 {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int size : tangerine) {
            frequencyMap.put(size, frequencyMap.getOrDefault(size, 0) + 1);
        }

        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());

        frequencies.sort(Collections.reverseOrder());

        int count = 0; 
        int total = 0; 

        for (int freq : frequencies) {
            total += freq; 
            count++; 

            if (total >= k) {
                break;
            }
        }

        return count; 
    }
}
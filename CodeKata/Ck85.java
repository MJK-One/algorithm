import java.util.HashSet;
import java.util.Set;

class Ck85 {
    public int solution(int[] elements) {
        Set<Integer> sumSet = new HashSet<>();
        int n = elements.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += elements[(i + j) % n]; 
                sumSet.add(sum); 
            }
        }

        return sumSet.size(); 
    }
}
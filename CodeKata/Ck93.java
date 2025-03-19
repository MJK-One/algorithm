public class Ck93 {
    public int solution(int k, int[][] dungeons) {
        int answer;
        answer = dungeonsFatigue(k, dungeons, new boolean[dungeons.length], 0);
        
        return answer;
    }
    public int dungeonsFatigue(int k, int[][] dungeons, boolean[] visited, int count) {
        int maxCount = count;
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                maxCount = Math.max(maxCount, dungeonsFatigue(k - dungeons[i][1], dungeons, visited, count + 1));
                visited[i] = false;
            }
        }
        return maxCount;
    }
}
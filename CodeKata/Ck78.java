public class Ck78 {
    public int solution(int n) {
        final int MOD = 1234567;
        int[] fb = new int[n + 1]; 
        
        fb[0] = 0;
        fb[1] = 1;
        
        for (int i = 2; i <= n; i++ ) {
            fb[i] = (fb[i-2] + fb[i-1]) % MOD;
        }
        
        
        return fb[n];
    }
}

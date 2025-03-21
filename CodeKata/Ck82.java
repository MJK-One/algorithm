public class Ck82 {
    public long solution(int n) {
        final int MOD = 1234567;
        
        long[] rr = new long[n + 1];
        
        rr[1] = 1;
        if (n >= 2) {
            rr[2] = 2;
        }
        
        for (int i = 3; i <= n; i++) {
            rr[i] = (rr[i - 1] + rr[i - 2]) % MOD;
        }
        
        return rr[n];
    }
}

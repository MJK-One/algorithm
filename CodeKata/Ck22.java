package CodeKata;

public class Ck22 {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        for(long n = a; n <= b; n++) {
            answer += n;
        }
        return answer;
    }
}

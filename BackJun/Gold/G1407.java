package Gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G1407 {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static long A,B;
    
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        System.out.println(total(B)-total(A-1));
    }

    public static long total(long n){
        long totalsum = 0;
        long measure = 1;
        
        while(n != 0){
            if(n%2!=0){
                totalsum+=((n/2)+1)*measure;
            }else{
                totalsum+=(n/2)*measure;
            }

            measure*=2;
            n/=2;
        }
        return totalsum;
    }
}

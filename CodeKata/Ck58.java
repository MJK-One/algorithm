public class Ck58 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public boolean isPrime(int sum) {
        if (sum <= 1) return false;

        if (sum == 2) return true;

        if (sum % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(sum);

        for (int i = 3; i <= sqrt; i += 2) {
            if (sum % i == 0) return false;
        }

        return true;
    }
}
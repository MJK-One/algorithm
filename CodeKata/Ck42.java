class Ck42 {
    public int solution(int[] number) {
        int answer = 0;
        int numLength = number.length; 

        for (int i = 0; i < numLength; i++) {
            for (int j = i + 1; j < numLength; j++) { 
                for (int z = j + 1; z < numLength; z++) { 
                    int sum = number[i] + number[j] + number[z];
                    if (sum == 0) {
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }
}
public class Ck44 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int top_Weight = 0;
        int top_Height = 0;

        for(int i = 0; i < sizes.length; i++) {
            int weight = sizes[i][0];
            int height = sizes[i][1];

            if(weight < height) {
                int temp = weight;
                weight = height;
                height = temp;
            }

            if(top_Weight < weight) {
                top_Weight = weight;
            }
            if(top_Height < height) {
                top_Height = height;
            }
        }

        answer = top_Weight * top_Height;

        return answer;
    }

}

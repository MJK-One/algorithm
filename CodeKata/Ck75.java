public class Ck75 {
    public String solution(String s) {
        String answer = "";
        
        String[] list = s.split(" ");
        
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE; 
        
        for (int i = 0; i < list.length; i++) {
            int num = Integer.parseInt(list[i]); 
            
            if (num > max) {
                max = num;
            } 
            if (num < min) {
                min = num; 
            }
        }
        
        answer = min + " " + max; 
        
        return answer;
    }
}

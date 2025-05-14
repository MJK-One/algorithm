public class Ck45 {
    public String solution(String s, int n) {
        String answer = "";
        
        String result = CaesarPW(s, n);
        
        answer = result;
        
        return answer;
    }
    
    public static String CaesarPW(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(' ');
            } else if (c >= 'a' && c <= 'z') {
                result.append((char) ((c - 'a' + n) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                result.append((char) ((c - 'A' + n) % 26 + 'A'));
            }
        }

        return result.toString();       
    }
}

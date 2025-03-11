import java.util.HashSet;

public class Ck64 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        HashSet<Integer> lostSet = new HashSet<>();
        HashSet<Integer> reserveSet = new HashSet<>();

        for (int i : lost) {
            lostSet.add(i);
        }

        for (int j : reserve) {
            reserveSet.add(j);
        }

        // 여벌 체육복이 있는 학생이 도난당한 경우 처리
        for (int i : reserve) {
            if (lostSet.contains(i)) {
                lostSet.remove(i); // 도난당한 학생에서 제거
                reserveSet.remove(i); // 여벌 체육복 있는 학생에서 제거
            }
        }

        // 체육복 빌려주기
        for (int i : lostSet) {
            if (reserveSet.contains(i - 1)) { // 앞 학생에게 빌리기
                answer++; // 체육복을 빌리게 되므로 수업을 들을 수 있는 학생 수 증가
                reserveSet.remove(i - 1); // 빌려준 학생 제거
            } else if (reserveSet.contains(i + 1)) { // 뒤 학생에게 빌리기
                answer++; // 체육복을 빌리게 되므로 수업을 들을 수 있는 학생 수 증가
                reserveSet.remove(i + 1); // 빌려준 학생 제거
            }
        }
        answer -= lostSet.size();
        return answer; // 최종적으로 수업을 들을 수 있는 학생 수 반환
    }
}

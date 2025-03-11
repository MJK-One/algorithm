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

        // ���� ü������ �ִ� �л��� �������� ��� ó��
        for (int i : reserve) {
            if (lostSet.contains(i)) {
                lostSet.remove(i); // �������� �л����� ����
                reserveSet.remove(i); // ���� ü���� �ִ� �л����� ����
            }
        }

        // ü���� �����ֱ�
        for (int i : lostSet) {
            if (reserveSet.contains(i - 1)) { // �� �л����� ������
                answer++; // ü������ ������ �ǹǷ� ������ ���� �� �ִ� �л� �� ����
                reserveSet.remove(i - 1); // ������ �л� ����
            } else if (reserveSet.contains(i + 1)) { // �� �л����� ������
                answer++; // ü������ ������ �ǹǷ� ������ ���� �� �ִ� �л� �� ����
                reserveSet.remove(i + 1); // ������ �л� ����
            }
        }
        answer -= lostSet.size();
        return answer; // ���������� ������ ���� �� �ִ� �л� �� ��ȯ
    }
}

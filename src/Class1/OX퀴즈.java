package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 문자열 개수 지정

        for (int i = 0; i < n; i++) {
            String quiz = br.readLine(); // OX문자열 입력받기
            int score = 0;  // 총점
            int combo = 0;  // 연속 점수

            for (char c : quiz.toCharArray()) {
                if (c == 'O') {
                    combo++;    // 'O' 나올때마다 콤보 1 증가
                    score += combo; // 현재 콤보만큼 점수 더하고
                } else {
                    combo = 0;  // 'X' 나오면 콤보 리셋
                }
            }
            System.out.println(score); // 더한 콤보 출력 (총점)
        }

    }
}
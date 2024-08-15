package class1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 피타고라스 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // 세 변의 길이 입력 받기
            System.out.print("첫 번째 변의 길이를 입력하세요: ");
            int a = Integer.parseInt(reader.readLine());

            System.out.print("두 번째 변의 길이를 입력하세요: ");
            int b = Integer.parseInt(reader.readLine());

            System.out.print("세 번째 변의 길이를 입력하세요: ");
            int c = Integer.parseInt(reader.readLine());

            // 피타고라스 정리 검증
            if (isPythagoreanTheoremValid(a, b, c)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        } catch (IOException e) {
            System.out.println("입력 오류: " + e.getMessage());
        }
    }

    // 피타고라스 정의
    public static boolean isPythagoreanTheoremValid(int a, int b, int c) {


        return Math.abs(c * c - (a * a + b * b)) < 0.0001;
    }
}
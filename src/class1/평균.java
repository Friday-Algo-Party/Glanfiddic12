package class1;
import java.util.Scanner;

public class 평균 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자로부터 입력을 받습니다.
        Scanner sc = new Scanner(System.in);

        // 사용자가 입력하는 첫 번째 정수를 배열의 크기로 사용합니다.
        int[] n = new int[sc.nextInt()];

        // 최댓값을 저장할 변수 max를 0으로 초기화합니다.
        int max = 0;

        // 합계를 저장할 변수 sum을 0으로 초기화합니다.
        int sum = 0;

        // 배열의 크기만큼 반복하여 배열 요소들을 입력받습니다.
        for(int i = 0; i < n.length; i++) {
            // 사용자가 입력한 값을 변수 b에 저장합니다.
            int b = sc.nextInt();

            // 입력된 값 b가 현재 최댓값 max보다 크다면, max를 b로 갱신합니다.
            if(max < b) {
                max = b;
            }

            // 입력된 값 b를 합계에 더합니다.
            sum += b;
        }

        // 입력이 끝났으므로 Scanner 객체를 닫습니다.
        sc.close();

        // 평균을 계산하는 공식입니다.
        // sum을 max로 나눈 후 100을 곱하고, 다시 배열의 길이(n.length)로 나눕니다.
        // 이 식은 특정 문제에서 평균을 조정된 값으로 구하는 방법일 수 있습니다.
        double avg = (double)sum / (double)max * 100 / n.length;

        // 계산된 평균을 출력합니다.
        System.out.println(avg);
    }
}
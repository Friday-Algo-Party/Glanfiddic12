package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 두수비교하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int a = Integer.parseInt(st.nextToken());


        int b = Integer.parseInt(st.nextToken());


//이 조건은 a가 -10000 이상이고, b가 10000 이하인 경우에만 내부의 비교 연산을 수행하도록 합니다.
//	•	a >= -10000은 a의 값이 -10000보다 크거나 같은지 확인합니다.
//	•	b <= 10000은 b의 값이 10000보다 작거나 같은지 확인합니다.
//	•	이 조건이 true일 때만 다음 단계로 넘어가서 a와 b를 비교합니다.
//        	•	예시 1: a = 5, b = 3
//	•	a > b이므로 출력은 >입니다.
//	•	예시 2: a = 2, b = 4
//	•	a < b이므로 출력은 <입니다.
//	•	예시 3: a = 7, b = 7
//	•	a == b이므로 출력은 ==입니다.

        if (a >= -10000 && b <= 10000) {
            if (a > b) {  System.out.println(">");

            } else if (a < b) {  System.out.println("<");

            } else if (a == b) { System.out.println("==");

            }
        }
    }
}

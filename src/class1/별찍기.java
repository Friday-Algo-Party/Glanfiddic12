package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 별찍기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) { // 입력 받음
            for (int j = 0; j < i; j++) { // i번 만큼 별 출력함
                System.out.print("*");
            }
            System.out.println(); // ln이 한 줄 끝나면 줄 바꿈

        }
        br.close();
    }
}
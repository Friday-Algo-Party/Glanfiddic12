package class1;

import java.io.*;
import java.util.StringTokenizer;

public class 웰컴키트 {
    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter를 사용하여 입력과 출력을 효율적으로 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N: 첫 번째 입력 줄에서 전체 인원 수를 읽어옵니다.
        int N = Integer.parseInt(br.readLine());

        // 크기가 6인 정수 배열을 선언하여 각 사이즈별 수량을 저장
        int[] sizeArr = new int[6];

        // 두 번째 입력 줄을 읽어와 StringTokenizer로 각 사이즈별 수량을 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 6; i++) {
            sizeArr[i] = Integer.parseInt(st.nextToken()); // 각 사이즈의 수량을 배열에 저장
        }

        // 세 번째 입력 줄을 읽어와 StringTokenizer로 T와 P 값을 분리
        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken()); // 각 사이즈에 맞추어 제공해야 할 T 단위 크기
        int P = Integer.parseInt(st.nextToken()); // P: 한 팩당 들어가는 물품의 개수

        int cnt = 0; // 전체 세트를 맞추기 위해 필요한 세트의 수를 저장할 변수

        // sizeArr 배열을 순회하며 각 사이즈별로 필요한 세트 수 계산
        for(int i = 0; i < 6; i++) {
            cnt += sizeArr[i] / T; // 각 사이즈에서 필요한 세트 수를 계산하여 cnt에 더함
            cnt = sizeArr[i] % T > 0 ? cnt + 1 : cnt; // 나머지가 있을 경우 추가로 세트 수를 하나 더 증가
        }

        // 결과 출력: 필요한 세트 수(cnt)와 각 팩에 들어가는 인원 수, 나머지 인원 수
        bw.write(cnt + "\n"); // 필요한 세트 수 출력
        bw.write(N / P + " " + N % P); // 인원 수에 따른 팩과 나머지 인원 수 출력

        // BufferedReader와 BufferedWriter를 닫아 자원을 해제
        br.close();
        bw.flush();
        bw.close();
    }
}
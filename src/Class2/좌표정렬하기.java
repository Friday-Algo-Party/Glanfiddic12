package Class2;

import java.io.*;
import java.util.*;

public class 좌표정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(input[0]);
            points[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        StringBuilder sb = new StringBuilder();
        for (int[] point : points) {
            sb.append(point[0]).append(" ").append(point[1]).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}
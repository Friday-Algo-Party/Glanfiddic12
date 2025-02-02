package Class2;

import java.io.*;
import java.util.*;

public class 제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) {
                sum -= stack.pop();
            } else {
                stack.push(num);
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
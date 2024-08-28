package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 윤년 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int year = Integer.parseInt(br.readLine());


        if (year % 400 == 0) {                           // 연도가 400으로 나누어지면 윤년이에요.
            System.out.print(1);                         // 그래서 1을 출력해요. (1은 윤년이라는 뜻이에요.)
        } else if (year % 4 == 0 && year % 100 != 0) {   // 연도가 4로 나누어지면서 100으로는 나누어지지 않으면 윤년이에요.
            System.out.print(1);                         // 그래서 1을 출력해요.
        } else {                                         // 위의 두 조건에 맞지 않으면 윤년이 아니에요.
            System.out.print(0);                         // 그래서 0을 출력해요. (0은 윤년이 아니라는 뜻이에요.)
        }

        }


    }







package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알람시계1 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m < 45) {

            if(h == 0){
                h = 23;
                sb.append(h).append(' ');
            } else {
                h--;
                sb.append(h).append(' ');
            }

            sb.append(m = 60 - (45 - m));
        }
        else {

            sb.append(h).append(' ').append(m - 45);
        }


        System.out.println(sb);

    }
}


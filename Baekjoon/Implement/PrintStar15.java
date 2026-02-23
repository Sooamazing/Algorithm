package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-02-23 5min
// https://www.acmicpc.net/problem/10990
public class PrintStar15 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        for (int i = 1; i <= total; i++) {

            //   *
            //  * *
            // *   *
            //*     *
            sb.append(" ".repeat(total - i))
                    .append('*');
            if (i > 1) {
                sb.append(" ".repeat((i - 1) * 2 - 1))
                        .append('*');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
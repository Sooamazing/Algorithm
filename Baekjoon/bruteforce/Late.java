package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-03-16 10min
// https://www.acmicpc.net/problem/10419
public class Late {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            int classTime = Integer.parseInt(br.readLine());

            int lateTime = 0;
            for (int i = 1; i <= classTime; i++) {
                if (i * (i + 1) > classTime) {
                    lateTime = i - 1;
                    break;
                }
            }

            sb.append(lateTime).append('\n');

        }

        System.out.println(sb);
    }
}
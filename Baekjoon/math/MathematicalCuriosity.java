package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-07-02 10min
// https://www.acmicpc.net/problem/9094
public class MathematicalCuriosity {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int result = 0;
            //  0 < a < b < n, (a2+b2+m)/(ab) = 정수
            for (int a = 1; a < n; a++) {
                for (int b = a + 1; b < n; b++) {
                    if ((a * a + b * b + m) % (a * b) == 0) {
                        result++;
                    }
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }

}

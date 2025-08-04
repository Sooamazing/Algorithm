package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-08-04 5min
// https://www.acmicpc.net/problem/4880
public class NextNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());
            if (first == 0 && second == 0 && third == 0) {
                break;
            }

            if ((first - second) == (second - third)) {
                sb.append("AP ").append(third + (second - first)).append('\n');
            } else {
                sb.append("GP ").append(third * ((second / first))).append('\n');
            }
        }

        System.out.println(sb);
    }
}
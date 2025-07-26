package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-07-26 3min
// https://www.acmicpc.net/problem/4562
public class NoBrainer {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int current = Integer.parseInt(st.nextToken());
            int required = Integer.parseInt(st.nextToken());

            if (current >= required) {
                sb.append("MMM BRAINS\n");
            } else {
                sb.append("NO BRAINS\n");
            }
        }

        System.out.println(sb);
    }
}
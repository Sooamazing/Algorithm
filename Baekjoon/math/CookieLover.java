package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-22 3min
// https://www.acmicpc.net/problem/11134
public class CookieLover {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());

        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int total = Integer.parseInt(st.nextToken());
            int max = Integer.parseInt(st.nextToken());

            sb.append((total + max - 1) / max).append("\n");
        }

        System.out.println(sb);
    }
}
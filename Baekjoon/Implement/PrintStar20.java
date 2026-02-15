package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-02-15 3min
// https://www.acmicpc.net/problem/10995
public class PrintStar20 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        for (int i = 0; i < total; i++) {
            if (i % 2 == 1) {
                sb.append(' ');
            }
            sb.append("* ".repeat(total)).append('\n');
        }

        System.out.println(sb);
    }
}
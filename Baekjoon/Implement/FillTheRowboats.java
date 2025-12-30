package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-30 3min
// https://www.acmicpc.net/problem/5300
public class FillTheRowboats {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        for (int i = 1; i <= total; i++) {
            sb.append(i).append(" ");
            if (i % 6 == 0) {
                sb.append("Go! ");
            }
        }

        if (total % 6 != 0) {
            sb.append("Go!");
        }

        System.out.println(sb);
    }
}
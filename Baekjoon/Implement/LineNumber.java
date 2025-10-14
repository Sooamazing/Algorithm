package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-10-14 3min
// https://www.acmicpc.net/problem/4470
public class LineNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        for (int i = 1; i <= total; i++) {
            sb.append(i).append(". ").append(br.readLine()).append("\n");
        }
        System.out.println(sb);
    }
}
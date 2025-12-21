package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-21 5min
// https://www.acmicpc.net/problem/25703
public class PointerStudy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append("int a;\n")
                .append("int *ptr = &a;\n");

        int total = Integer.parseInt(br.readLine());
        for (int i = 2; i <= total; i++) {
            sb.append("int ")
                    .append("*".repeat(i))
                    .append("ptr")
                    .append(i)
                    .append(" = &ptr")
                    .append((i - 1) == 1 ? "" : (i - 1))
                    .append(";\n");
        }

        System.out.println(sb);
    }
}
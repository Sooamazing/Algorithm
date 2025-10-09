package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-10-09 3min
// https://www.acmicpc.net/problem/9316
public class HelloJudge {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        for (int i = 1; i <= total; i++) {
            // Hello World, Judge i!
            sb.append(String.format("Hello World, Judge %d!\n", i));
        }

        System.out.println(sb);
    }
}
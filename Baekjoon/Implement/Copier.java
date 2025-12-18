package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-18 2min
// https://www.acmicpc.net/problem/26574
public class Copier {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            String number = br.readLine();
            sb.append(number).append(" ").append(number).append("\n");
        }

        System.out.println(sb);
    }
}
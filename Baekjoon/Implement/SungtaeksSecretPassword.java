package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-08 2min
// https://www.acmicpc.net/problem/25372
public class SungtaeksSecretPassword {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            String password = br.readLine();
            int length = password.length();
            if (length >= 6 && length <= 9) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        System.out.println(sb);

    }
}
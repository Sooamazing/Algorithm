package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-10-21 5min
// https://www.acmicpc.net/problem/5598
public class CaesarsCode {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();
        for (char c : word.toCharArray()) {
            int transformed = ((c - 'A') - 3 + 26) % 26;
            sb.append((char) (transformed + 'A'));
        }

        System.out.println(sb);
    }
}
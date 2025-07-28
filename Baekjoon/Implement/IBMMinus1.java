package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-07-28 5min
// https://www.acmicpc.net/problem/6321
public class IBMMinus1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        for (int i = 1; i <= total; i++) {
            sb.append("String #").append(i).append("\n");

            String word = br.readLine();
            for (int j = 0; j < word.length(); j++) {
                char converted = (word.charAt(j) + 1) <= 'Z' ? (char) (word.charAt(j) + 1) : 'A';

                sb.append(converted);
            }
            sb.append("\n\n");
        }

        System.out.println(sb);
    }
}
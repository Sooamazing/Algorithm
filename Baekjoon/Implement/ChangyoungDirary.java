package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-03-15 3min
// https://www.acmicpc.net/problem/2954
public class ChangyoungDirary {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String sentence = br.readLine();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            sb.append(c);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                i += 2;
            }
        }
        System.out.println(sb);
    }
}
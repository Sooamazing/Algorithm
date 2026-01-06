package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-01-06 5min
// https://www.acmicpc.net/problem/5704
public class Pangram {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        while (!(input = br.readLine()).equals("*")) {
            boolean[] alphabet = new boolean[26];
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    alphabet[ch - 'a'] = true;
                }
            }

            boolean isPangram = true;
            for (boolean exists : alphabet) {
                if (!exists) {
                    isPangram = false;
                    break;
                }
            }

            sb.append(isPangram ? "Y" : "N").append("\n");
        }

        System.out.println(sb);
    }
}
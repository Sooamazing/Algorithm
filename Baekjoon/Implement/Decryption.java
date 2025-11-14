package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-11-14 25min
// https://www.acmicpc.net/problem/9046
public class Decryption {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        for (int i = 0; i < total; i++) {
            String line = br.readLine();
            int[] arr = new int[26];

            int max = -1;
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == ' ') {
                    continue;
                }
                int charIndex = line.charAt(j) - 'a';
                arr[charIndex]++;
                max = Math.max(max, arr[charIndex]);
            }

            boolean isDouble = false;
            char resultChar = ' ';
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == max) {
                    if (resultChar != ' ') {
                        isDouble = true;
                        break;
                    }
                    resultChar = (char) (j + 'a');
                }
            }
            if (isDouble) {
                sb.append('?');
            } else {
                sb.append(resultChar);
            }
            sb.append('\n');
        }

        System.out.println(sb);

    }
}
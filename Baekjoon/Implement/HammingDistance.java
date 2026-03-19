package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-03-19 3min
// https://www.acmicpc.net/problem/3449
public class HammingDistance {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            String first = br.readLine();
            String second = br.readLine();

            int length = first.length();
            int distance = 0;
            for (int i = 0; i < length; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    distance++;
                }
            }

            sb.append("Hamming distance is ").append(distance).append('.').append('\n');
        }

        System.out.println(sb);

    }
}
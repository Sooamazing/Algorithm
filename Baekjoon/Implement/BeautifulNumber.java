package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 25-12-11 3min
// https://www.acmicpc.net/problem/2774
public class BeautifulNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        for (int t = 0; t < total; t++) {
            String number = br.readLine();
            Set<Integer> set = new HashSet<>();
            int count = 0;
            for (int i = 0; i < number.length(); i++) {
                int digit = number.charAt(i) - '0';
                if (!set.contains(digit)) {
                    set.add(digit);
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
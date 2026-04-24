package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 26-04-24 10min
// https://www.acmicpc.net/problem/2028
public class SelfDuplicateNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            String numberStr = br.readLine();
            int length = numberStr.length();
            int number = Integer.parseInt(numberStr);
            int powNumber = number * number;

            int last = powNumber % (int) Math.pow(10, length);
            if (number == last) {
                sb.append("YES").append("\n");
                continue;
            }
            sb.append("NO").append("\n");
        }

        System.out.println(sb);
    }
}
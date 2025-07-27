package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-07-27 10min
// https://www.acmicpc.net/problem/5217
public class TheSumOfPairs {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            int goal = Integer.parseInt(br.readLine());
            sb.append("Pairs for ").append(goal).append(":");

            for (int i = 1; i <= goal / 2; i++) {
                int pair = goal - i;
                if (i == pair) {
                    continue;
                }
                sb.append(" ").append(i).append(" ").append(pair).append(",");
            }

            if (sb.lastIndexOf(",") == sb.length() - 1) {
                sb.deleteCharAt(sb.length() - 1);
//                sb.replace(sb.length() - 1, sb.length(), "\n");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
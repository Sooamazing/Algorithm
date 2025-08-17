package Baekjoon.Implement;

import java.io.BufferedReader;

// 25-08-17 5min
// https://www.acmicpc.net/problem/11170
public class TheNumberOfZeros {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            String[] range = br.readLine().split(" ");
            int start = Integer.parseInt(range[0]);
            int end = Integer.parseInt(range[1]);
            int count = 0;
            for (int j = start; j <= end; j++) {
                count += String.valueOf(j).length() - String.valueOf(j).replace("0", "").length();
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}
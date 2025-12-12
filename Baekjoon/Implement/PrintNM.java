package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-12-12 5min
// https://www.acmicpc.net/problem/18883
// 참고: https://velog.io/@eunah/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-N-M-%EC%B0%8D%EA%B8%B0-18883%EB%B2%88-JAVA
public class PrintNM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());
        int count = 1;

        for (int i = 0; i < numA; i++) {
            for (int j = 1; j < numB; j++) {
                sb.append(count).append(" ");
                count++;
            }
            sb.append(count).append("\n");
            count++;
        }

        System.out.println(sb.toString());
    }
}

package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-25 40
// https://www.acmicpc.net/problem/23972
// 참고: https://propercoding.tistory.com/320#google_vignette
public class DemonicSuggestion {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int pay = Integer.parseInt(st.nextToken());
        int multiple = Integer.parseInt(st.nextToken());

        if (pay % multiple == 0) {
            System.out.println(pay);
        } else {
            // 20 5
            // 20 / (5 + 1) = 3
            // 3 * (5 + 1) = 18
            // 18 + 3 = 21
            // 21 + 5 = 26

            // 25 -> 25
            // 24 -> 20 => bingo

            // 21 5
            // 21 / 5 = 4
            // 4 * 5 = 20
            // 20 + 4 = 24
            // 24 + 5 = 29

            // 25 -> 20
            // 26 -> 25 => bingo
            System.out.println((pay / (multiple + 1)) + multiple);
        }
    }
}
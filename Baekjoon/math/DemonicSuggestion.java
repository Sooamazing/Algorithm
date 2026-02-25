package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-25 45min
// https://www.acmicpc.net/problem/23972
// 반례: https://www.acmicpc.net/board/view/102974
public class DemonicSuggestion {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long pay = Integer.parseInt(st.nextToken());
        long multiple = Integer.parseInt(st.nextToken());

        if (multiple == 1) {
            System.out.println(-1);
            return;
        }
        System.out.println(
                pay * multiple / (multiple - 1)
                        + ((pay * multiple % (multiple - 1) == 0) ? 0 : 1)
        );

    }
}
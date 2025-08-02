package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-08-02 3min
// https://www.acmicpc.net/problem/5523
public class TheResultOfGame {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 0;
        for (int i = 0; i < total; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int aScore = Integer.parseInt(st.nextToken());
            int bScore = Integer.parseInt(st.nextToken());
            if (aScore > bScore) {
                a++;
            } else if (bScore > aScore) {
                b++;
            }
        }

        System.out.println(a + " " + b);
    }
}
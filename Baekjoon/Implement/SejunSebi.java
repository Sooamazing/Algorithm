package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-01-21 10min
// https://www.acmicpc.net/problem/1524
public class SejunSebi {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        br.readLine();
        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sejun = Integer.parseInt(st.nextToken());
            int sebi = Integer.parseInt(st.nextToken());

            boolean isSejunWon = true;
            st = new StringTokenizer(br.readLine());
            int sejunMax = 0;
            for (int i = 0; i < sejun; i++) {
                sejunMax = Math.max(sejunMax, Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            int sebiMax = 0;
            for (int i = 0; i < sebi; i++) {
                sebiMax = Math.max(sebiMax, Integer.parseInt(st.nextToken()));
            }

            if (sebiMax > sejunMax) {
                isSejunWon = false;
            }

            sb.append(isSejunWon ? "S" : "B").append('\n');
            br.readLine();
        }

        System.out.println(sb);
    }
}
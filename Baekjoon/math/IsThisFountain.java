package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-08 15min
// https://www.acmicpc.net/problem/2863
public class IsThisFountain {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] fountain = new int[4];
        fountain[0] = Integer.parseInt(st.nextToken());
        fountain[1] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        fountain[3] = Integer.parseInt(st.nextToken());
        fountain[2] = Integer.parseInt(st.nextToken());
        // A/C + B/D
        double max = 0;
        int round = 0;

        for (int i = 0; i < 4; i++) {
            double current =
                    (double) fountain[i] / fountain[(i + 3) % 4]
                            + (double) fountain[(i + 1) % 4] / fountain[(i + 2) % 4];
            if (current > max) {
                max = current;
                round = i;
            }
        }
        if (round == 1) {
            round = 3;
        } else if (round == 3) {
            round = 1;
        }
        System.out.println(round);
    }
}
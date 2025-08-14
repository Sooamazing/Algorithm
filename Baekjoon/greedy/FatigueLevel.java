package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 25-08-14 5min
// https://www.acmicpc.net/problem/22864
public class FatigueLevel {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int fatigue = Integer.parseInt(st.nextToken());
        int work = Integer.parseInt(st.nextToken());
        int rest = Integer.parseInt(st.nextToken());
        int maxFatigue = Integer.parseInt(st.nextToken());

        int maxWork = 0;

        int currentFatigue = 0;
        for (int i = 0; i < 24; i++) {
            if (currentFatigue + fatigue > maxFatigue) {
                currentFatigue = Math.max(0, currentFatigue - rest);
            } else {
                currentFatigue += fatigue;
                maxWork += work;
            }
        }

        System.out.println(maxWork);
    }
}
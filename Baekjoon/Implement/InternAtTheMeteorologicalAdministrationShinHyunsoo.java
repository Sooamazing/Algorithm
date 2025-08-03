package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-08-03 10min
// https://www.acmicpc.net/problem/2435
public class InternAtTheMeteorologicalAdministrationShinHyunsoo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int continuous = Integer.parseInt(st.nextToken());
        int[] temperatures = new int[total];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            temperatures[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int currentSum = 0;
        for (int i = 0; i < total; i++) {
            if (i < continuous) {
                currentSum += temperatures[i];
                max += temperatures[i];
                continue;
            }
            currentSum = currentSum + temperatures[i] - temperatures[i - continuous];
            max = Math.max(max, currentSum);
        }

        System.out.println(max);
    }
}
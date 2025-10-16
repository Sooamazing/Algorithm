package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 25-10-16 10min
// https://www.acmicpc.net/problem/2012
public class Ranking {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int student = Integer.parseInt(br.readLine());
        int[] scores = new int[student + 1];
        long displeasureSum = 0;
        for (int i = 0; i < student; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(scores);
        for (int i = 1; i <= student; i++) {
            displeasureSum += Math.abs(scores[i] - i);
        }

        System.out.println(displeasureSum);
    }
}
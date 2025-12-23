package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-12-23 3min
// https://www.acmicpc.net/problem/20044
public class ProjectTeams {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine()) * 2;
        int[] students = new int[total];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            students[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(students);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < total / 2; i++) {
            min = Math.min(min, students[i] + students[total - 1 - i]);
        }

        System.out.println(min);
    }
}
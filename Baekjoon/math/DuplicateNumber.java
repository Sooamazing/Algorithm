package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-13 10min
// https://www.acmicpc.net/problem/15719
public class DuplicateNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        boolean[] isChecked = new boolean[total];
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (isChecked[number]) {
                answer = number;
                break;
            }
            isChecked[number] = true;
        }

        System.out.println(answer);
    }
}
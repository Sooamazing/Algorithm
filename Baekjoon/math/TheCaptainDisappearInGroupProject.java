package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-10-06 5min
// https://www.acmicpc.net/problem/15727
public class TheCaptainDisappearInGroupProject {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int goal = Integer.parseInt(br.readLine());
        // Math.ceil로 올림 가능
        System.out.println((goal + 4) / 5);
    }
}
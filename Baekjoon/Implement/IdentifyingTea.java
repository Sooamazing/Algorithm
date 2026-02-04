package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-04 3min
// https://www.acmicpc.net/problem/11549
public class IdentifyingTea {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = Integer.parseInt(br.readLine());
        int[] guesses = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            guesses[Integer.parseInt(st.nextToken())]++;
        }

        System.out.println(guesses[answer]);
    }
}
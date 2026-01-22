package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 26-01-22 10min
// https://www.acmicpc.net/problem/20115
public class EnergyDrink {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] drinks = new int[total];
        for (int i = 0; i < total; i++) {
            drinks[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(drinks);

        double finallyLeft = drinks[total - 1];
        for (int i = 0; i < total - 1; i++) {
            finallyLeft += drinks[i] / 2.0;
        }

        System.out.println(finallyLeft);
    }
}
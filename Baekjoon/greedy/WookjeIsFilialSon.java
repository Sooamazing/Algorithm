package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-06 3min
// https://www.acmicpc.net/problem/14487
public class WookjeIsFilialSon {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        int sum = 0;
        int max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            int money = Integer.parseInt(st.nextToken());
            sum += money;
            max = Math.max(max, money);
        }

        System.out.println(sum - max);
    }
}
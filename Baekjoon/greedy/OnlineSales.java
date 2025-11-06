package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-11-06 20min
// https://www.acmicpc.net/problem/1246
public class OnlineSales {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int egg = Integer.parseInt(st.nextToken());
        int customer = Integer.parseInt(st.nextToken());

        int[] prices = new int[customer];
        for (int i = 0; i < customer; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(prices);

        int maxPriceSum = 0;
        int minPrice = 1_000_000;
        for (int i = 0; i < customer; i++) {
            int bought = Math.min(egg, customer - i);
            int currentPriceSum = prices[i] * bought;
            if (currentPriceSum > maxPriceSum) {
                maxPriceSum = currentPriceSum;
                minPrice = prices[i];
            }
        }

        System.out.println(minPrice + " " + maxPriceSum);
    }
}
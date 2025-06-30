package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-06-30 5min
// https://www.acmicpc.net/problem/1233
public class Dice {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int three = Integer.parseInt(st.nextToken());

        int[] sums = new int[one + two + three + 1];
        for (int i = 1; i <= one; i++) {
            for (int j = 1; j <= two; j++) {
                for (int k = 1; k <= three; k++) {
                    sums[i + j + k]++;
                }
            }
        }

        int result = 0;
        int max = 0;
        for (int i = 1; i < sums.length; i++) {
            if (sums[i] > max) {
                max = sums[i];
                result = i;
            }
        }

        System.out.println(result);
    }
}

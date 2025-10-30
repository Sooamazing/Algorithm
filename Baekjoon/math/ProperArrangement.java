package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 25-10-30 15min
// https://www.acmicpc.net/problem/1337
public class ProperArrangement {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];

        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int min = 4;
        for (int i = 0; i < total; i++) {
            int max = arr[i] + 4;
            int count = 4;
            for (int j = i + 1; j < total; j++) {
                if (arr[j] > max) {
                    break;
                }
                if (arr[j] <= max) {
                    count--;
                }
            }
            min = Math.min(min, count);
        }

        System.out.println(min);
    }
}
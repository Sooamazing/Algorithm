package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 26-02-11 15min
// https://www.acmicpc.net/problem/2592
public class RepresentativeValue {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int mostNumber = 0;
        int mostCount = 0;
        int currentCount = 0;
        int prevNumber = 0;
        Arrays.sort(arr);
        for (int v : arr) {
            if (v == prevNumber) {
                currentCount++;
            } else {
                if (mostCount < currentCount) {
                    mostCount = currentCount;
                    mostNumber = prevNumber;
                }
                currentCount = 1;
            }
            prevNumber = v;
        }

        System.out.println(sum / 10 + " " + mostNumber);
    }
}
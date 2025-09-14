package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-09-14 20min
// https://www.acmicpc.net/problem/17614
public class ThreeSixNine {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        long answer = 0;
        long[] arr = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            answer += calculate369(arr, i);
        }

        System.out.println(answer);
    }

    private static long calculate369(long[] arr, int number) {

        int currentDigit = number % 10;
        arr[number] = arr[number / 10];
        if (isIn369(currentDigit)) {
            arr[number]++;
        }
        return arr[number];
    }

    private static long calculate369(int number) {

        long sum = 0;
        do {
            if (isIn369(number)) {
                sum++;
            }
            number /= 10;
        } while (number != 0);
        return sum;
    }

    private static boolean isIn369(int number) {

        return number % 10 == 3 || number % 10 == 6 || number % 10 == 9;
    }
}
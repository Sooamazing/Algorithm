package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-08-08 15min
// https://www.acmicpc.net/problem/2947
public class WoodPiece {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (!isRightOrder(arr)) {
            for (int i = 0; i < (5 - 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    for (int v : arr) {
                        sb.append(v).append(" ");
                    }
                    sb.append("\n");
                }
            }
        }

        System.out.println(sb);

    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static boolean isRightOrder(int[] arr) {

        int number = 1;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == number) {
                number++;
                continue;
            }
            return false;
        }
        return true;
    }
}
package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

// 25-08-13 15min
// https://www.acmicpc.net/problem/1551
public class ChangeInSequence {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringJoiner sj = new StringJoiner(",");

        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int replay = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), ",");
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] result = arr; // 한 번도 하지 않으면 자기자신.

        for (int i = 0; i < replay; i++) {
            result = new int[total - 1];
            for (int j = 0; j < total - 1; j++) {
                result[j] = arr[j + 1] - arr[j];
            }
            total--;
            arr = result;
        }

        for (int i = 0; i < total; i++) {
            sj.add(String.valueOf(result[i]));
        }

        System.out.println(sj);
    }
}
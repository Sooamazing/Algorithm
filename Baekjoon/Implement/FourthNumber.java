package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-06-29 5min
// https://www.acmicpc.net/problem/2997
public class FourthNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int diff1 = arr[1] - arr[0];
        int diff2 = arr[2] - arr[1];
        if (diff1 == diff2) {
            System.out.println(arr[2] + diff1);
        } else if (diff1 > diff2) {
            System.out.println(arr[0] + diff2);
        } else {
            System.out.println(arr[1] + diff1);
        }
    }

}

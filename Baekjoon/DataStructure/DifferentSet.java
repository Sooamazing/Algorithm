package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-09-10 15min, 25-10-15 20min
// https://www.acmicpc.net/problem/1822
public class DifferentSet {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] aArr = new int[a];
        int[] bArr = new int[b];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
        }

        // 집합 A에는 속하면서 집합 B에는 속하지 않는 원소
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            bArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        int count = 0;
        for (int i = 0; i < a; i++) {
            if (Arrays.binarySearch(bArr, aArr[i]) < 0) {
                count++;
                sb.append(aArr[i]).append(" ");
            }
        }

        if (sb.length() == 0) {
            System.out.println(0);
            return;
        }

        sb.insert(0, count + "\n");

        System.out.println(sb);
    }
}
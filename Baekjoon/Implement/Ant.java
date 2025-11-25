package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-11-25 65min
// https://www.acmicpc.net/problem/3048
public class Ant {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int reverseAnts = Integer.parseInt(st.nextToken());
        int proceedAnts = Integer.parseInt(st.nextToken());

        String reversedAnt = br.readLine();
        sb.append(reversedAnt).reverse();

        String proceedAnt = br.readLine();
        int time = Integer.parseInt(br.readLine());
        for (int j = 0; j < proceedAnts; j++) {
            int maxTime = Math.min(reverseAnts, time);
            char currentAnt = proceedAnt.charAt(j);
            sb.insert(Math.max(sb.length() - maxTime, 0), currentAnt);
            time = Math.max(time - 1, 0);
        }

        System.out.println(sb);
    }

    private static void swap(int[] proceeds, char[] arr, int toRightIndex, int proceed) {

        char temp = arr[toRightIndex];
        arr[toRightIndex] = arr[proceed];
        arr[proceed] = temp;

        proceeds[proceed]++;
    }
}
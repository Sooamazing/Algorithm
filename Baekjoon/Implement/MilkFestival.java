package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-07-08 5min
// https://www.acmicpc.net/problem/14720
public class MilkFestival {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        int max = 0;
        int shouldMilkNumber = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < total; i++) {
            int currentMilk = Integer.parseInt(st.nextToken());
            if (currentMilk == shouldMilkNumber) {
                shouldMilkNumber = (shouldMilkNumber + 1) % 3;
                max++;
            }
        }
        System.out.println(max);
    }

}

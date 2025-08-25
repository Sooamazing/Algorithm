package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-08-25 10min
// https://www.acmicpc.net/problem/14470
public class Microwave {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int currentTemp = Integer.parseInt(br.readLine());
        int goalTemp = Integer.parseInt(br.readLine());
        int underZeroTime = Integer.parseInt(br.readLine());
        int zeroToFrozenTime = Integer.parseInt(br.readLine());
        int notFrozenTime = Integer.parseInt(br.readLine());

        int totalTime = 0;
        if (currentTemp < 0) {
            totalTime += (-currentTemp) * underZeroTime;
            currentTemp = 0;
        }

        if (currentTemp == 0) {
            totalTime += zeroToFrozenTime;
        }

        totalTime += (goalTemp - currentTemp) * notFrozenTime;

        System.out.println(totalTime);
    }
}
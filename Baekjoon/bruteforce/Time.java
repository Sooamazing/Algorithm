package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-02-21 5min
// https://www.acmicpc.net/problem/18312
public class Time {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxHour = Integer.parseInt(st.nextToken());
        int includedNumber = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int hour = 0; hour <= maxHour; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    if (containNumberInTime(hour, includedNumber)
                            || containNumberInTime(minute, includedNumber)
                            || containNumberInTime(second, includedNumber)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    private static boolean containNumberInTime(int hour, int includedNumber) {

        return hour % 10 == includedNumber || hour / 10 == includedNumber;
    }
}
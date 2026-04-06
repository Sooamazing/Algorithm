package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

// 26-04-06 10min
// https://www.acmicpc.net/problem/5928
public class ContestTiming {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int hour = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());

        LocalDateTime contestTime = LocalDateTime.of(2026, 11, 11, 11, 11);

        long until = contestTime.until(LocalDateTime.of(2026, 11, day, hour, minutes),
                ChronoUnit.MINUTES);

        System.out.println(until < 0 ? -1 : until);
    }
}
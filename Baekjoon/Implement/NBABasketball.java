package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

// 25-10-24 40min
// https://www.acmicpc.net/problem/2852
public class NBABasketball {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int goal = Integer.parseInt(br.readLine());

        int firstScore = 0;
        int secondScore = 0;

        long firstTime = 0;
        long secondTime = 0;
        LocalDateTime prevTime = LocalDateTime.of(2025, 10, 24, 0, 0, 0);
        for (int i = 0; i <= goal; i++) {
            int team;
            int minutes;
            int second;
            if (i != goal) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                team = Integer.parseInt(st.nextToken());
                String[] split = st.nextToken().split(":");
                minutes = Integer.parseInt(split[0]);
                second = Integer.parseInt(split[1]);
            } else {
                team = 0;
                minutes = 48;
                second = 0;
            }
            LocalDateTime currentTime = LocalDateTime.of(2025, 10, 24, 0, minutes, second);

            long durationSecond = prevTime.until(currentTime, ChronoUnit.SECONDS);

            if (firstScore > secondScore) {
                firstTime += durationSecond;
            } else if (secondScore > firstScore) {
                secondTime += durationSecond;
            }

            if (team == 1) {
                firstScore++;
            } else {
                secondScore++;
            }

            prevTime = currentTime;
        }

        sb.append(String.format("%02d", firstTime / 60)).append(":")
                .append(String.format("%02d", (firstTime % 60)))
                .append("\n")
                .append(String.format("%02d", (secondTime / 60))).append(":")
                .append(String.format("%02d", (secondTime % 60)));
        System.out.println(sb);
    }
}
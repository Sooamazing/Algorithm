package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

// 26-02-08 5min
// https://www.acmicpc.net/problem/1408
public class TwentyFour {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        LocalDateTime now =
                LocalDateTime.of(2026, 2, 8,
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine(), ":");
        LocalDateTime missionStart =
                LocalDateTime.of(2026, 2, 8,
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()));

        if (now.isAfter(missionStart)) {
            missionStart = missionStart.plusHours(24);
        }

        long leftSeconds = Duration.between(now, missionStart).getSeconds();

        long hours = leftSeconds / 3600;
        long minutes = (leftSeconds % 3600) / 60;
        long seconds = leftSeconds % 60;

        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
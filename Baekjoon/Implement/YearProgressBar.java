package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.StringTokenizer;

// 26-01-03 15min
// https://www.acmicpc.net/problem/1340
public class YearProgressBar {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //  January, February, March, April, May, June, July, August, September, October, November, December
        Map<String, Integer> monthMap = Map.ofEntries(
                Map.entry("January", 1),
                Map.entry("February", 2),
                Map.entry("March", 3),
                Map.entry("April", 4),
                Map.entry("May", 5),
                Map.entry("June", 6),
                Map.entry("July", 7),
                Map.entry("August", 8),
                Map.entry("September", 9),
                Map.entry("October", 10),
                Map.entry("November", 11),
                Map.entry("December", 12)
        );

        // May 10, 1981 00:31
        int month = monthMap.get(st.nextToken());
        int day = Integer.parseInt(st.nextToken().replace(",", ""));
        int year = Integer.parseInt(st.nextToken());
        String time = st.nextToken();
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));
        LocalDateTime yearFirst = LocalDateTime.of(year, 1, 1, 0, 0);
        LocalDateTime yearEnd = LocalDateTime.of(year + 1, 1, 1, 0, 0).minusNanos(1);

        LocalDateTime now = LocalDateTime.of(year, month, day, hour, minute);
        long fromEnd = yearFirst.until(yearEnd, ChronoUnit.NANOS);
        long fromNow = yearFirst.until(now, ChronoUnit.NANOS);

        double percent = (fromNow * 100.0) / fromEnd;

        System.out.println(percent);

    }
}
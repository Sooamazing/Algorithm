package Baekjoon.Implement;

import static java.time.temporal.ChronoUnit.DAYS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

// 26-04-21 5min
// https://www.acmicpc.net/problem/2139
public class IKnowYourLife {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            if (day + month + year == 0) {
                break;
            }

            LocalDate firstDay = LocalDate.of(year, 1, 1);
            LocalDate now = LocalDate.of(year, month, day);

            long diff = firstDay.until(now, DAYS);
            sb.append(diff + 1).append('\n');
        }

        System.out.println(sb);
    }
}
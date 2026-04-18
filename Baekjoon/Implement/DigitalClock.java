package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-04-18 20min
// https://www.acmicpc.net/problem/1942
// 참고: https://www.acmicpc.net/board/view/124097
public class DigitalClock {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringTokenizer startTime = new StringTokenizer(st.nextToken(), ":");
            StringTokenizer endTime = new StringTokenizer(st.nextToken(), ":");

            int startHour = Integer.parseInt(startTime.nextToken());
            int startMinutes = Integer.parseInt(startTime.nextToken());
            int startSecond = Integer.parseInt(startTime.nextToken());
            int endHour = Integer.parseInt(endTime.nextToken());
            int endMinutes = Integer.parseInt(endTime.nextToken());
            int endSecond = Integer.parseInt(endTime.nextToken());

            int currentHour = startHour;
            int currentMinutes = startMinutes;
            int currentSecond = startSecond;

            int count = 0;
            int sum = currentHour + currentMinutes + currentSecond;
            if (sum % 3 == 0) {
                count++;
            }
            while (!(currentHour == endHour
                    && currentMinutes == endMinutes
                    && currentSecond == endSecond)) {

                currentSecond++;
                if (currentSecond == 60) {
                    currentSecond = 0;
                    currentMinutes++;
                }
                if (currentMinutes == 60) {
                    currentMinutes = 0;
                    currentHour++;
                }
                if (currentHour == 24) {
                    currentHour = 0;
                }

                sum = currentHour + currentMinutes + currentSecond;
                if (sum % 3 == 0) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
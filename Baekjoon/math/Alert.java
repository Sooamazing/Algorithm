package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-07-17 30min
// https://www.acmicpc.net/problem/3029
// 참고: https://www.acmicpc.net/board/view/136875
public class Alert {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int currentHour = Integer.parseInt(st.nextToken());
        int currentMinutes = Integer.parseInt(st.nextToken());
        int currentSecond = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), ":");
        int alertHour = Integer.parseInt(st.nextToken());
        int alertMinutes = Integer.parseInt(st.nextToken());
        int alertSecond = Integer.parseInt(st.nextToken());

        // 같은 경우, 0이 아니라 24시간.
        if (alertHour == currentHour && alertMinutes == currentMinutes
                && alertSecond == currentSecond) {
            System.out.println("24:00:00");
            return;
        }

        if (alertSecond < currentSecond) {
            alertSecond += 60;
            alertMinutes -= 1;
        }
        int resultSecond = alertSecond - currentSecond;

        if (alertMinutes < currentMinutes) {
            alertMinutes += 60;
            alertHour -= 1;
        }
        int resultMinutes = alertMinutes - currentMinutes;

        if (alertHour < currentHour) {
            alertHour += 24;
        }
        int resultHour = alertHour - currentHour;

        System.out.println(String.format("%02d", resultHour) + ":"
                + String.format("%02d", resultMinutes) + ":"
                + String.format("%02d", resultSecond));
    }
}
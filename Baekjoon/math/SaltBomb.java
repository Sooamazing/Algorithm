package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

// 26-02-06 15min
// https://www.acmicpc.net/problem/13223
public class SaltBomb {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        LocalTime now =
                LocalTime.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine(), ":");
        LocalTime salt =
                LocalTime.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()));

        // salt를 기다리는 시간 출력
        LocalTime left = salt.minusHours(now.getHour()).minusMinutes(now.getMinute())
                .minusSeconds(now.getSecond());

        if (left.equals(LocalTime.of(0, 0, 0))) {
            System.out.println("24:00:00");
            return;
        }

        if (left.isBefore(LocalTime.of(0, 0, 0))) {
            left = left.plusHours(24);
        }

        System.out.println(String.format("%02d:%02d:%02d", left.getHour(), left.getMinute(),
                left.getSecond()));
    }
}
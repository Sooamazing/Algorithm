package Baekjoon.Implement;

import java.time.LocalDate;
import java.time.ZoneId;

// 25-09-04 3min
// https://www.acmicpc.net/problem/10699
public class TodaysDate {

    public static void main(String[] args) {

        LocalDate utc = LocalDate.now(ZoneId.of("UTC"));
        System.out.println(utc);
    }
}
package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

// 25-12-24 4min
// https://www.acmicpc.net/problem/2948
public class Year2009 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        LocalDate date = LocalDate.of(2009, month, day);
        String lowerCase = date.getDayOfWeek().toString().toLowerCase();
        // 첫 글자만 대문자로 변경
        String dayOfWeek = lowerCase.substring(0, 1).toUpperCase() + lowerCase.substring(1);
        System.out.println(dayOfWeek);
    }
}
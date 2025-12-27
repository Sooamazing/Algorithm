package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-12-27 3min
// https://www.acmicpc.net/problem/33612
public class Pigalcup {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nth = Integer.parseInt(br.readLine());
//        1번째 2024년 8월에 열렸다. 7개월 간격
        int year = 2024;
        int month = 8 + (nth - 1) * 7;

        year += (month - 1) / 12;
        month = ((month - 1) % 12) + 1;

        System.out.println(year + " " + month);
    }
}
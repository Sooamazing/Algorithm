package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-11-29 5min
// https://www.acmicpc.net/problem/5789
public class DoOrDoNot {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int total = Integer.parseInt(br.readLine());
        while (total-- > 0) {
            String flower = br.readLine();
            int length = flower.length();
            char lastLeft = flower.charAt(length / 2 - 1);
            char lastRight = flower.charAt(length / 2);

            sb.append(lastLeft == lastRight ? "Do-it" : "Do-it-Not").append('\n');
        }

        System.out.println(sb);
    }
}
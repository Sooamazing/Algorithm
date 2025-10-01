package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-10-01 10min
// https://www.acmicpc.net/problem/11006
public class NamwooksChickenCoop {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int legs = Integer.parseInt(st.nextToken());
            int heads = Integer.parseInt(st.nextToken());

            int unbroken = legs - heads;
            int broken = heads - unbroken;
            sb.append(broken).append(" ").append(unbroken)
                    .append("\n");
        }

        System.out.println(sb);

    }
}
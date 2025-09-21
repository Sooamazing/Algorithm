package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-09-21 5min
// https://www.acmicpc.net/problem/10833
public class Apple {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int school = Integer.parseInt(br.readLine());

        int rest = 0;
        for (int i = 0; i < school; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            int apple = Integer.parseInt(st.nextToken());

            rest += apple % student;
        }

        System.out.println(rest);
    }
}
package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 26-03-03 5min
// https://www.acmicpc.net/problem/31962
public class GoToSchool {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int inTime = Integer.parseInt(st.nextToken());

        int max = -1;
        for (int i = 0; i < total; i++) {
            st = new StringTokenizer(br.readLine());
            int waiting = Integer.parseInt(st.nextToken());
            int coming = Integer.parseInt(st.nextToken());

            if (waiting + coming <= inTime) {
                max = Math.max(max, waiting);
            }
        }

        System.out.println(max);
    }
}
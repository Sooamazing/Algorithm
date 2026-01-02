package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-02 3min
// https://www.acmicpc.net/problem/15780
public class IsThereEnoughMultitap {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int people = Integer.parseInt(st.nextToken());
        int multitap = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < multitap; i++) {
            people -= (Integer.parseInt(st.nextToken()) + 1) / 2;
            if (people <= 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
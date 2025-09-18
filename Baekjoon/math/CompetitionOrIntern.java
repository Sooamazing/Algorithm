package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 25-09-18 10min
// https://www.acmicpc.net/problem/2875
public class CompetitionOrIntern {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int two = Integer.parseInt(st.nextToken());
        int one = Integer.parseInt(st.nextToken());
        int internship = Integer.parseInt(st.nextToken());

        int maxTeam = Math.min(two / 2, one);
        int remain = two + one - maxTeam * 3;

        int answer = 0;
        if (remain >= internship) {
            answer = maxTeam;
        } else {
            answer = Math.max(0, maxTeam - (internship - remain + 2) / 3);
        }
        System.out.println(answer);
    }
}
package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-12-01 5min
// https://www.acmicpc.net/problem/20299
public class ThreeMeasurements {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int team = Integer.parseInt(st.nextToken());
        int minTeam = Integer.parseInt(st.nextToken());
        int minPerson = Integer.parseInt(st.nextToken());

        int teamCount = 0;
        for (int i = 0; i < team; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());
            if (first >= minPerson && second >= minPerson && third >= minPerson
                    && (first + second + third) >= minTeam) {
                teamCount++;
                sb.append(first).append(" ")
                        .append(second).append(" ")
                        .append(third).append(" ");
            }
        }

        sb.insert(0, teamCount + "\n");

        System.out.println(sb);
    }
}